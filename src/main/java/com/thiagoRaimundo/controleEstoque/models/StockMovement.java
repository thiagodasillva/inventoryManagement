package com.thiagoRaimundo.controleEstoque.models;

import java.time.format.DateTimeFormatter;

public class StockMovement {

    private Long id;
    private Enum tipo;
    private int quantidade;
    private DateTimeFormatter dataHora;
    private User user;
    private Lote lote;
    private Product product;
    private Stock stock;






    public StockMovement() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
