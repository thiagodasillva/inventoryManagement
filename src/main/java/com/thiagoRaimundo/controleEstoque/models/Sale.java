package com.thiagoRaimundo.controleEstoque.models;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "tb_sale")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dataVenda;
    private BigDecimal valorTotal;
    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "sale", cascade = CascadeType.ALL)
    private Collection<SaleItem> itens;

    public Sale() {
    }

    public Long getId() {
        return id;
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

    public Collection<SaleItem> getItens() {
        return itens;
    }

    public void setItens(Collection<SaleItem> itens) {
        this.itens = itens;
    }
}
