package com.example.liviadantas.projeto;

import android.app.Activity;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText os;
    private Spinner lista_servico;
    private EditText prod;
    private EditText cliente;
    private EditText endereco;
    private EditText numEndereco;
    private EditText bairro;
    private EditText cidade;
    private Button salvar;
    OS novaOS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Cadastrar OS");
        os = findViewById(R.id.n_os);
        lista_servico= findViewById(R.id.lista_servico);
        prod= findViewById(R.id.produto);
        cliente = findViewById(R.id.cliente);
        endereco = findViewById(R.id.endereco);
        numEndereco = findViewById(R.id.num);
        bairro = findViewById(R.id.bairro);
        cidade = findViewById(R.id.cidade);
        salvar = findViewById(R.id.salvar);



        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            novaOS = new OS();
                if (os.getText().toString().isEmpty()){
                    os.setError(getString(R.string.erroTexto));
                    return;
                }else {

                    novaOS.setNum_os(Integer.parseInt(os.getText().toString()));
                }
            novaOS.setLista_servico(lista_servico.getSelectedItem().toString());
            novaOS.setProd(prod.getText().toString());
            novaOS.setCliente(cliente.getText().toString());
            novaOS.setEndereco(endereco.getText().toString());
            novaOS.setNumEndereco(numEndereco.getText().toString());
            novaOS.setBairro(bairro.getText().toString());
            novaOS.setCidade(cidade.getText().toString());
                Toast.makeText(MainActivity.this,"OS Salva",Toast.LENGTH_SHORT).show();
            }
        });




    }
}
