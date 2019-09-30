package com.example.findfastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TelaPrincipal extends AppCompatActivity {

    TextView txtBemVindo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        this.txtBemVindo = findViewById(R.id.txtBemVindo);

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
