package com.example.liviadantas.projeto;

import java.util.ArrayList;

public class OS {
    private Integer num_os;
    private String lista_servico;
    private String prod;
    private String cliente;
    private String endereco;
    private String numEndereco;
    private String bairro;
    private String cidade;


    public OS() {

    }
    public OS(Integer num_os, String lista_servico, String prod, String cliente, String endereco, String numEndereco,
              String bairro, String cidade ){
        this.num_os = 0;
        this.lista_servico = lista_servico;
        this.prod=prod;
        this.cliente=cliente;
        this.endereco=endereco;
        this.numEndereco=numEndereco;
        this.bairro=bairro;
        this.cidade=cidade;
    }

    public void Salvar(){

    }

    public Integer getNum_os() {
        return num_os;
    }

    public void setNum_os(Integer num_os) {
        this.num_os = num_os;
    }

    public String getLista_servico() {
        return lista_servico;
    }

    public void setLista_servico(String lista_servico) {
        this.lista_servico = lista_servico;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumEndereco() {
        return numEndereco;
    }

    public void setNumEndereco(String numEndereco) {
        this.numEndereco = numEndereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }





}
