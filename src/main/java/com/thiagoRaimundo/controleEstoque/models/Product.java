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
    @Column(name = "predictDescription")
    private String Description;

    @OneToOne
    private Category category;

    @OneToMany(mappedBy = "product")
    private Collection<Lote> lotes;

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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Collection<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(Collection<Lote> lotes) {
        this.lotes = lotes;
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
