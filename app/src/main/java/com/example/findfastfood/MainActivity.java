package com.example.findfastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


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

    public void Logar(View view) {
        String login = txtLogin.getText().toString();
        String senha = txtPass.getText().toString();


        Intent it = new Intent(this, TelaPrincipal.class);

        if (login.equals("admin") && senha.equals("admin")) {
            startActivity(it);
        } else {
            Toast.makeText(getApplicationContext(), "Usuario e/ou senha icorretos", Toast.LENGTH_SHORT).show();
            this.txtLogin.setText("");
            this.txtPass.setText("");
        }
    }
}