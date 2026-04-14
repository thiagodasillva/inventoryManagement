package com.thiagoRaimundo.controleEstoque.models;

import java.time.format.DateTimeFormatter;

public class StockMovement {

    private Long id;
    private Product produto;
    private Enum tipo;
    private int quantidade;
    private DateTimeFormatter dataHora;
    private User user;


    public StockMovement() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduto() {
        return produto;
    }

    public void setProduto(Product produto) {
        this.produto = produto;
    }

    public Enum getTipo() {
        return tipo;
    }

    public void setTipo(Enum tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public DateTimeFormatter getDataHora() {
        return dataHora;
    }

    public void setDataHora(DateTimeFormatter dataHora) {
        this.dataHora = dataHora;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
