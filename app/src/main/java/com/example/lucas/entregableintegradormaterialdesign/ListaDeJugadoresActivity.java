package com.example.lucas.entregableintegradormaterialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListaDeJugadoresActivity extends AppCompatActivity {

    List<Jugadores> listaDeJugadores;
    RecyclerView recyclerViewJugadores;
    AdapterJugadores miAdaptadorDeJugadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_jugadores);

        listaDeJugadores = new ArrayList<>();

        cargarJugadores();

        recyclerViewJugadores = (RecyclerView) findViewById(R.id.listadejugadoresRecyclerView);

        miAdaptadorDeJugadores = new AdapterJugadores(listaDeJugadores);
        recyclerViewJugadores.setAdapter(miAdaptadorDeJugadores);

        recyclerViewJugadores.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));

        recyclerViewJugadores.setHasFixedSize(true);

        ListenerJugadores unListenerDeJugadores = new ListenerJugadores();
        miAdaptadorDeJugadores.setOnClickListener(unListenerDeJugadores);

    }




    public void cargarJugadores(){

        listaDeJugadores.add(new Jugadores("Lionel Messi",10));
        listaDeJugadores.add(new Jugadores("Sergio Aguero", 7));
        listaDeJugadores.add(new Jugadores("Diego Maradona",10));
        listaDeJugadores.add(new Jugadores("Lionel Messi",10));
        listaDeJugadores.add(new Jugadores("Sergio Aguero", 7));
        listaDeJugadores.add(new Jugadores("Diego Maradona",10));
        listaDeJugadores.add(new Jugadores("Lionel Messi",10));
        listaDeJugadores.add(new Jugadores("Sergio Aguero", 7));
        listaDeJugadores.add(new Jugadores("Diego Maradona",10));
        listaDeJugadores.add(new Jugadores("Lionel Messi",10));
        listaDeJugadores.add(new Jugadores("Sergio Aguero", 7));
        listaDeJugadores.add(new Jugadores("Diego Maradona",10));


    }


    private class ListenerJugadores implements View.OnClickListener{


        @Override
        public void onClick(View view) {

            Toast.makeText(view.getContext(), "Apretamos el elemento" + recyclerViewJugadores.getChildPosition(view), Toast.LENGTH_LONG).show();

        }
    }





}
