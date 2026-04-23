package com.thiagoRaimundo.controleEstoque.models.DTOs;

import com.thiagoRaimundo.controleEstoque.models.Product;

public class StockReportDTO {

    private Product product;
    private Integer quantidadeAtual;
    private Integer quantidadeMinima;
    private Integer quantidadeMaxima;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(Integer quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    public Integer getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(Integer quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    public Integer getQuantidadeMaxima() {
        return quantidadeMaxima;
    }

    public void setQuantidadeMaxima(Integer quantidadeMaxima) {
        this.quantidadeMaxima = quantidadeMaxima;
    }
}
