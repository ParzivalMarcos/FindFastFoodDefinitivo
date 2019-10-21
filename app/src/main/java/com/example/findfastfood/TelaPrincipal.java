package com.example.findfastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
    }

    public void japonesa (View view){
        Intent it = new Intent(this, Japonesa.class);
        startActivity(it);

    }

    public void pesquisa (View view){
        Intent it = new Intent(this, Pesquisa.class);
        startActivity(it);

    }
}
