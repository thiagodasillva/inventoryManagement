package com.thiagoRaimundo.controleEstoque.models;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name= "tb_produto")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "quant")
    private int quant;
    @Column(name = "vencimento")
    private Date dateVencimento;

    @Column(name = "predictDescription")
    private String Description;
    @Column(name = "Saleprice")
    private Double precoDenda;

    @Column(name = "custo")
    private Double custo;

    private Category category;

    private Collection<Lote> lote;

    private Boolean status = true;


    public Product() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public Date getDateVencimento() {
        return dateVencimento;
    }

    public void setDateVencimento(Date dateVencimento) {
        this.dateVencimento = dateVencimento;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Double getPrecoDenda() {
        return precoDenda;
    }

    public void setPrecoDenda(Double precoDenda) {
        this.precoDenda = precoDenda;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Collection<Lote> getLote() {
        return lote;
    }

    public void sobescreverLote(Collection<Lote> lote) {
        this.lote = lote;
    }

    public void setLote(Lote lote) {
        this.lote.add(lote);
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product produto = (Product) o;
        return Objects.equals(id, produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
