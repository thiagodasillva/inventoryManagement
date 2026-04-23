package com.thiagoRaimundo.controleEstoque.models.DTOs;

import com.thiagoRaimundo.controleEstoque.models.SaleItem;
import com.thiagoRaimundo.controleEstoque.models.User;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;

public class SaleRequestDTO {

    private LocalDateTime dataVenda;
    private BigDecimal valorTotal;
    private User user;
    private Collection<SaleItemDTO> itens;

    public SaleRequestDTO(LocalDateTime dataVenda, BigDecimal valorTotal, User user, Collection<SaleItemDTO> itens) {
        this.dataVenda = dataVenda;
        this.valorTotal = valorTotal;
        this.user = user;
        this.itens = itens;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Collection<SaleItemDTO> getItens() {
        return itens;
    }

    public void setItens(Collection<SaleItemDTO> itens) {
        this.itens = itens;
    }
}
