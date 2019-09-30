package com.example.findfastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtLogin;
    EditText txtPass;
    Button btnLogin;
    EditText txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.btnLogin = findViewById(R.id.btnLogin);
        this.txtLogin = findViewById(R.id.txtLogin);
        this.txtPass = findViewById(R.id.txtPass);
    }

    public void Logar(View view){
        String login, senha;

        login = txtLogin.getText().toString();
        senha = txtPass.getText().toString();

        if (login.equals("admin") && senha.equals("admin")){
            this.txtResultado.setText("Usuario aprovado!!!");
        }else{
            this.txtResultado.setText("Usuario e/ou senha incorretos");
        }


    }
}
