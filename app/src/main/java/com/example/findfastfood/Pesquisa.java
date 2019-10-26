package com.example.findfastfood;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Pesquisa extends AppCompatActivity {

    EditText txtPesquisa;
    TextView txtError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesquisa);
        this.txtPesquisa = findViewById(R.id.txtPesquisa);
        this.txtError = findViewById(R.id.txtError);
    }
    public void pesquisa(View view) {

        String pesquisa = txtPesquisa.getText().toString().toLowerCase();

        Intent jap = new Intent(this, Japonesa.class);
        Intent lan = new Intent(this, lanches.class);
        Intent ita = new Intent(this, Italiana.class);
        Intent tip = new Intent(this, Tipica.class);

        if (pesquisa.equals("japonesa")) {
            startActivity(jap);

        }else if (pesquisa.equals("lanches") || pesquisa.equals("lanchonete")){
            startActivity(lan);
        }else if (pesquisa.equals("italiana")){
            startActivity(ita);
        }else if (pesquisa.equals("tipica")){
            startActivity(tip);
        }

        else {
            this.txtError.setText("Item não existe");
        }
    }
}
