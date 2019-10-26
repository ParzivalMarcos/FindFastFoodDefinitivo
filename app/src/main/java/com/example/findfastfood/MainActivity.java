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
    TextView txtError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.btnLogin = findViewById(R.id.btnLogin);
        this.txtLogin = findViewById(R.id.txtLogin);
        this.txtPass = findViewById(R.id.txtPass);
        this.txtError = findViewById(R.id.txtError);
    }

    public void Logar(View view) {
        String login = txtLogin.getText().toString();
        String senha = txtPass.getText().toString();


        Intent it = new Intent(this, TelaPrincipal.class);
        //it.putExtra("login", login);
        //it.putExtra("senha", senha);

        if (login.equals("admin") && senha.equals("admin")) {
            startActivity(it);
        } else {
            this.txtError.setText("Usuario e/ou Senha incorretos");
            this.txtLogin.setText("");
            this.txtPass.setText("");
        }
    }
}