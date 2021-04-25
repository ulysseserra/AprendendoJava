package br.com.devmidia.aprendendojava.dominio;

import java.util.List;
import java.util.ArrayList;

public class Colecionador {

    private String nome;
    private List<Item> colecao;

    public Colecionador(String nome) {
        this.nome = nome;
        colecao = new ArrayList<Item>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Item> getColecao() {
        return colecao;
    }

    public void setColecao(List<Item> colecao) {
        this.colecao = colecao;
    }

}
