package com.example.lucas.entregableintegradormaterialdesign;

import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Lucas on 6/1/16.
 */
public class AdapterJugadores extends RecyclerView.Adapter implements View.OnClickListener{


    private View.OnClickListener listener;
    private List<Jugadores> listaDeJugadores;

    public AdapterJugadores (List<Jugadores> unaListaDeJugadores){
        listaDeJugadores = unaListaDeJugadores;
    }

    public void setOnClickListener(View.OnClickListener unListener){
        listener = unListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.detalle_jugadores, parent, false);

        JugadoresViewHolder unJugadorViewHolder = new JugadoresViewHolder(itemView);
        itemView.setOnClickListener(this);

        return unJugadorViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        Jugadores unJugador = listaDeJugadores.get(position);

        JugadoresViewHolder unJugadorViewHolder = (JugadoresViewHolder) holder;

        unJugadorViewHolder.bindJugadores(unJugador);

    }

    @Override
    public int getItemCount() {
        return listaDeJugadores.size();
    }

    @Override
    public void onClick(View view) {

        listener.onClick(view);
    }

    private static class JugadoresViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewNombreJugador;
        private TextView textViewNumeroJugador;

        public JugadoresViewHolder(View itemView){
            super(itemView);

            textViewNombreJugador = (TextView) itemView.findViewById(R.id.textviewNombreJugador);
            textViewNumeroJugador = (TextView) itemView.findViewById(R.id.textviewNumeroJugador);

        }

        public void bindJugadores (Jugadores unJugador){

            textViewNombreJugador.setText(unJugador.getNombre());
            textViewNumeroJugador.setText(unJugador.getNumeroDeCamiseta().toString());

        }


    }


}
