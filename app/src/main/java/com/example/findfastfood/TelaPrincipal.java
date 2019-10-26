package com.example.findfastfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaPrincipal extends AppCompatActivity implements
BlankFragment.OnFragmentInteractionListener,
CuponsFragment.OnFragmentInteractionListener{

    ImageButton btnJaponesa;
    ImageButton btnItaliana;
    ImageButton btnPesquisa;
    ImageButton btnFeijoada;
    ImageButton btnLanche;
    Button  btnCupons;
    //ImageView imgQRdesconto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        this.btnItaliana = findViewById(R.id.btnItaliana);
        this.btnJaponesa = findViewById(R.id.btnJaponesa);
        this.btnPesquisa = findViewById(R.id.btnPesquisa);
        this.btnFeijoada = findViewById(R.id.btnFeijoada);
        this.btnLanche = findViewById(R.id.btnLanche);
        this.btnCupons = findViewById(R.id.btnCupons);
        //this.imgQRdesconto = findViewById(R.id.qrcodedesconto);

    }

    public void japonesa (View view){
        Intent it = new Intent(this, Japonesa.class);
        startActivity(it);

    }

    public void pesquisa (View view){
        Intent it = new Intent(this, Pesquisa.class);
        startActivity(it);

    }

    public void italiana (View view){
        Intent it = new Intent(this, Italiana.class);
        startActivity(it);

    }

    public void tipica (View view){
        Intent it = new Intent(this, Tipica.class);
        startActivity(it);

    }

    public void lanches (View view){
        Intent it = new Intent(this, lanches.class);
        startActivity(it);

    }

    public void mostrarCupons (View view){
        CuponsFragment cupons = new CuponsFragment();
        FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainer, cupons);
        transaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
