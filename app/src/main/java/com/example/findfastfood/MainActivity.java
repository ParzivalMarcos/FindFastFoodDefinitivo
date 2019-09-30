package com.example.findfastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtLogin;
    EditText txtPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.btnLogin = findViewById(R.id.btnLogin);
        this.txtLogin = findViewById(R.id.txtLogin);
        this.txtPass = findViewById(R.id.txtPass);
    }

    public void Logar(View view){
        String login = txtLogin.getText().toString();
        String senha = txtPass.getText().toString();

        Intent it = new Intent(this,TelaPrincipal.class);
        it.putExtra("login", login);
        it.putExtra("senha", senha);
        startActivity(it);
    }
}
