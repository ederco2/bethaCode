package Desafio05;

import java.util.ArrayList;

public class Descontos {
    Integer id;
    String descricao;
    Double valor;

    ArrayList<Descontos> lista = new ArrayList<>();



    public Descontos(Integer id, String descricao, Double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
