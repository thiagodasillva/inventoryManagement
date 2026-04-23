package com.thiagoRaimundo.controleEstoque.models.DTOs;

import com.thiagoRaimundo.controleEstoque.models.Enum.TipoStockMoviment;
import com.thiagoRaimundo.controleEstoque.models.Lote;
import com.thiagoRaimundo.controleEstoque.models.Product;
import com.thiagoRaimundo.controleEstoque.models.User;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class StockMovementDTO {

    private Long id;
    private TipoStockMoviment tipo;
    private Integer quantidade; // quantidade de produtos na operação
    private String observacao;
    private LocalDateTime dataHora;
    private User user;
    private Lote lote;
    private Product product;

    public StockMovementDTO() {
    }

    public TipoStockMoviment getTipo() {
        return tipo;
    }

    public void setTipo(TipoStockMoviment tipo) {
        this.tipo = tipo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}


