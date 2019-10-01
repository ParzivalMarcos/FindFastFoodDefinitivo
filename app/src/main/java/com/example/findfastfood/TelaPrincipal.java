package com.example.findfastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaPrincipal extends AppCompatActivity {

    TextView txtBemVindo;
    TextView txtComidaJaponesa;
    TextView txtComidaItaliana;
    TextView txtFastFood;
    ImageView imgComidaJaponesa;
    ImageView imgComidaItaliana;
    ImageView imgFastFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        this.txtBemVindo = findViewById(R.id.txtBemVindo);
        this.txtComidaItaliana = findViewById(R.id.txtComidaItaliana);
        this.txtComidaJaponesa = findViewById(R.id.txtComidaJaponesa);
        this.txtFastFood = findViewById(R.id.txtFastFood);
        this.imgComidaItaliana = findViewById(R.id.imgComidaItaliana);
        this.imgComidaJaponesa = findViewById(R.id.imgComidaJaponesa);
        this.imgFastFood = findViewById(R.id.imgFastFood);


        Intent it = getIntent();
        String login = it.getExtras().getString("login");
        String senha = it.getExtras().getString("senha");


        if (login.equals("admin") && senha.equals("admin")){
            this.txtBemVindo.setText("Usuario aprovado!!!");
        }else{
            this.txtBemVindo.setText("Usuario e/ou senha incorretos");
        }
    }
}
