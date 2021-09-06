package alura.com.br.ceep.ui.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import alura.com.br.ceep.R;
import alura.com.br.ceep.dao.NotaDAO;
import alura.com.br.ceep.model.Nota;
import alura.com.br.ceep.ui.adapter.ListaNotasAdapter;
import alura.com.br.ceep.ui.recyclerview.adapter.ListaNotaAdapter;

public class ListaNotasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_notas);
        RecyclerView listaNotas = findViewById(R.id.lista_notas_recyclerview);

        NotaDAO dao = new NotaDAO();
        dao.insere(new Nota("Primeira nota",
                "Primeira descrição"));
        List<Nota> todasNotas = dao.todos();

        listaNotas.setAdapter(new ListaNotaAdapter(todasNotas));
    }
}