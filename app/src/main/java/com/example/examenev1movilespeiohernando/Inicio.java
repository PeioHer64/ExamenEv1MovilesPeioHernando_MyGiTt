package com.example.examenev1movilespeiohernando;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView IV =findViewById(R.id.imageView);

        Intent Pagina2 = new Intent(this, PantallaPrincipal.class);

        IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(Pagina2);

            }
        });


    }
}