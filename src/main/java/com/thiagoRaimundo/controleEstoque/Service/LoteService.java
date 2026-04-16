package com.thiagoRaimundo.controleEstoque.Service;

import com.thiagoRaimundo.controleEstoque.models.Lote;
import com.thiagoRaimundo.controleEstoque.models.Product;
import com.thiagoRaimundo.controleEstoque.repository.LoteRepository;
import com.thiagoRaimundo.controleEstoque.repository.ProductRepository;

import javax.sound.sampled.Port;
import java.util.Collection;
import java.util.Optional;

public class LoteService {

    private LoteRepository loteRepository;
    private ProductRepository productRepository;

    public LoteService(LoteRepository loteRepository, ProductRepository productRepository) {
        this.loteRepository = loteRepository;
        this.productRepository = productRepository;
    }

    public Lote creatLote(Lote l, Long idProduct){
        Optional<Product> product = productRepository.findById(idProduct);
        if (product.isPresent()){
            l.setProduto(product.get());
            loteRepository.save(l);
            return l;
        }
        return null;
    }

    public Collection<Lote> getLotes(){
        return loteRepository.findAll();
    }
    public Lote getLote(Long idLote){
        Optional<Lote> l = loteRepository.findById(idLote);
        if(l.isPresent()){
            return l.get();
        }
        return null;

    }

    public void deleteLote (Long idLote){
        Optional<Lote> lOpt = loteRepository.findById(idLote);
        if (lOpt.isPresent()){
            Lote lote = lOpt.get();
            lote.setStatus(false);
        }

    }

    public Lote updateLote(Lote l, Long id){
        Optional<Lote> lOpt = loteRepository.findById(id);
        if(lOpt.isPresent()){
            Lote lote = lOpt.get();
            lote.setQuant(l.getQuant());
            lote.setProduto(l.getProduto());
            lote.setDate(l.getDate());
            lote.setValidate(l.getValidate());
            loteRepository.save(lote);
            return lote;

        }

        return null;
    }




}
