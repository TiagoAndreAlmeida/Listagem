package com.example.listagem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] cidades = {
            "Afonso", "Água Doce do Norte", "Águia Branca", "Alegre", "Alfredo Chaves", "Alto Rio Novo", "Anchieta", "Apiacá", "Aracruz", "Atilio Vivacqua", "Baixo Guandu", "Barra de São Francisco", "Boa Esperança", "Bom Jesus do Norte", "Brejetuba", "Cachoeiro de Itapemirim", "Cariacica", "Castelo", "Colatina", "Conceição da Barra", "Conceição do Castelo", "Divino de São Lourenço", "Domingos Martins", "Dores do Rio Preto", "Ecoporanga", "Fundão", "Governador Lindenberg", "Guaçuí", "Guarapari", "Ibatiba", "Ibiraçu", "Ibitirama", "Iconha", "Irupi", "Itaguaçu", "Itapemirim", "Itarana", "Iúna", "Jaguaré", "Jerônimo Monteiro", "João Neiva", "Laranja da Terra", "Linhares", "Mantenópolis", "Marataízes", "Marechal Floriano", "Marilândia", "Mimoso do Sul", "Montanha", "Mucurici", "Muniz Freire", "Muqui", "Nova Venécia", "Pancas", "Pedro Canário", "Pinheiros", "Piúma", "Ponto Belo", "Presidente Kennedy", "Rio Bananal", "Rio Novo do Sul", "Santa Leopoldina", "Santa Maria de Jetibá", "Santa Teresa", "São Domingos do Norte", "São Gabriel da Palha", "São José do Calçado", "São Mateus", "São Roque do Canaã", "Serra", "Sooretama", "Vargem Alta", "Venda Nova do Imigrante", "Viana", "Vila Pavão", "Vila Valério", "Vila Velha", "Vitória", "Acrelândia", "Assis Brasil", "Brasiléia", "Bujari", "Capixaba", "Cruzeiro do Sul", "Epitaciolândia", "Feijó", "Jordão", "Mâncio Lima", "Manoel Urbano", "Marechal Thaumaturgo", "Plácido de Castro", "Porto Acre", "Porto Walter", "Rio Branco", "Rodrigues Alves", "Santa Rosa do Purus", "Sena Madureira", "Senador Guiomard", "Tarauacá", "Xapuri"
    };

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                getApplicationContext(),
                R.layout.row,
                cidades
        );

        listView.setAdapter(arrayAdapter);

    }
}