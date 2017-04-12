package adrianrosas.coursera.miscontactos;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * Created by Adrian on 28/03/2017.
 */

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.mascotaViewHolder>{
    ArrayList<Mascota> mascotas;

    Activity activity;
    ImageButton estrella;

    public MascotaAdaptador (ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;

    }


    //Inflar el layout y lo pasará al viewholder para que el obtenga cada elemento o view
    @Override
    public mascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { //Layout que estará reciclando el ReciclerView
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);

        return new mascotaViewHolder(v);
    }
        //Asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(mascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.nombreCV.setText(mascota.getNombre());


        mascotaViewHolder.imgFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, mascota.getNombre(),Toast.LENGTH_SHORT).show();


            }
        });
        mascotaViewHolder.hueso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, "Le diste like a "+mascota.getNombre(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() { //Cantidad de elementos que contiene la lista de contactos
        return mascotas.size();
    }

    public static class mascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFoto;
        private TextView nombreCV;
        private ImageButton hueso;

        public mascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto     = (ImageView) itemView.findViewById(R.id.imgFoto);
            nombreCV    = (TextView) itemView.findViewById(R.id.nombreCV);
            hueso     = (ImageButton) itemView.findViewById(R.id.hueso);

        }


    }



    public final static String EXTRA_NOMBRE = "mascotas.petmotion.NOMBRE";
}
