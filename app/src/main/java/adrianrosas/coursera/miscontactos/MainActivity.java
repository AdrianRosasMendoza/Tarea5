package adrianrosas.coursera.miscontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    ImageButton estrella;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);
        estrella = (ImageButton) findViewById(R.id.estrella);
        estrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DetalleMascotas.class);
               startActivity(intent);
            }

        });


       LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
       // GridLayoutManager glm = new GridLayoutManager(this, 2);

        listaMascotas.setLayoutManager(llm);//Poner aquí nuestro tipo de recycler podr´´ia ser grid o linear
        inicializarListaMascotas();
        inicializarAdaptador();

    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);

    }

    public void inicializarListaMascotas(){

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.ghost, "Ghost" ));
        mascotas.add(new Mascota(R.drawable.lenon, "Lenon"));
        mascotas.add(new Mascota(R.drawable.mishky, "Mishky" ));
        mascotas.add(new Mascota(R.drawable.baloo, "Baloo"));
        mascotas.add(new Mascota(R.drawable.wero, "Wero"));
        mascotas.add(new Mascota(R.drawable.tigrito, "Tigrito"));
        mascotas.add(new Mascota(R.drawable.bigotes, "Bigotes"));

    }



    }

