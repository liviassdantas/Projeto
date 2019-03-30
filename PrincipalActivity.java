package com.example.liviadantas.projeto;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class PrincipalActivity extends AppCompatActivity {
    private FloatingActionButton adicionar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        setTitle("Tela Principal");
        adicionar = findViewById(R.id.principal_adicionar);

        adicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adicionar= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(adicionar);
            }
        });
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.ajuda){
            String clique = "http://www.sinapseinformatica.com.br/";
            Intent clicarAjuda = new Intent(Intent.ACTION_VIEW);
            clicarAjuda.setData(Uri.parse(clique));
            startActivity(clicarAjuda);
        }
        if(item.getItemId()==R.id.enviar_email){
            String gmail = "https://mail.google.com/mail/u/0/#inbox";
            Intent clicarEmail = new Intent(Intent.ACTION_VIEW);
            clicarEmail.setData(Uri.parse(gmail));
            startActivity(clicarEmail);
        }
        return super.onOptionsItemSelected(item);
    }
}
