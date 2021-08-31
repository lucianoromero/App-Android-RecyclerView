package alura.com.br.ceep.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import alura.com.br.ceep.R;
import alura.com.br.ceep.dao.NotaDAO;
import alura.com.br.ceep.model.Nota;
import alura.com.br.ceep.ui.adapter.ListaNotasAdapter;

public class ListaNotasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_notas);
        ListView listaNotas = findViewById(R.id.listView);

        NotaDAO dao = new NotaDAO();
        dao.insere(new Nota("Primeira nota",
                "Primeira descrição"));
        List<Nota> todasNotas = dao.todos();

        listaNotas.setAdapter(new ListaNotasAdapter(this, todasNotas));
    }
}