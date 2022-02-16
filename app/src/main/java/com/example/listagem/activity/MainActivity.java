package com.example.listagem.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.listagem.R;
import com.example.listagem.adpter.Adapter;
import com.example.listagem.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilme = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //criar filmes
        criarFilmes();

        //Configurar adapter
        Adapter adapter = new Adapter(listaFilme);

        //Configurar Recyclerview
        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);
    }

    public void criarFilmes() {
        Filme filme = new Filme("Filme 1", "12/12/2022", "Genero 1");
        listaFilme.add(filme);

        filme = new Filme("Filme 2", "12/12/2022", "Genero 2");
        listaFilme.add(filme);

        filme = new Filme("Filme 3", "12/12/2022", "Genero 3");
        listaFilme.add(filme);

        filme = new Filme("Filme 4", "12/12/2022", "Genero 4");
        listaFilme.add(filme);

        filme = new Filme("Filme 2", "12/12/2022", "Genero 2");
        listaFilme.add(filme);

        filme = new Filme("Filme 3", "12/12/2022", "Genero 3");
        listaFilme.add(filme);

        filme = new Filme("Filme 4", "12/12/2022", "Genero 4");
        listaFilme.add(filme);

        filme = new Filme("Filme 2", "12/12/2022", "Genero 2");
        listaFilme.add(filme);

        filme = new Filme("Filme 3", "12/12/2022", "Genero 3");
        listaFilme.add(filme);

        filme = new Filme("Filme 4", "12/12/2022", "Genero 4");
        listaFilme.add(filme);

        filme = new Filme("Filme 2", "12/12/2022", "Genero 2");
        listaFilme.add(filme);

        filme = new Filme("Filme 3", "12/12/2022", "Genero 3");
        listaFilme.add(filme);

        filme = new Filme("Filme 4", "12/12/2022", "Genero 4");
        listaFilme.add(filme);

        filme = new Filme("Filme 2", "12/12/2022", "Genero 2");
        listaFilme.add(filme);

        filme = new Filme("Filme 3", "12/12/2022", "Genero 3");
        listaFilme.add(filme);

        filme = new Filme("Filme 4", "12/12/2022", "Genero 4");
        listaFilme.add(filme);
    }
}