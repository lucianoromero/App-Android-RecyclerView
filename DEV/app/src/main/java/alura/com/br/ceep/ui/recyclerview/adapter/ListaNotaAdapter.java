package alura.com.br.ceep.ui.recyclerview.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import alura.com.br.ceep.model.Nota;

public class ListaNotaAdapter extends RecyclerView.Adapter {

    private List<Nota> notas;

    public ListaNotaAdapter(List<Nota>notas) {
        this.notas = notas;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return notas.size();
    }
}
