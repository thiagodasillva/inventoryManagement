package com.thiagoRaimundo.controleEstoque.Service;

import com.thiagoRaimundo.controleEstoque.models.Lote;
import com.thiagoRaimundo.controleEstoque.models.Product;
import com.thiagoRaimundo.controleEstoque.repository.LoteRepository;
import com.thiagoRaimundo.controleEstoque.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository productRepository;
    private LoteRepository loteRepository;

    public ProductService(ProductRepository productRepository, LoteRepository loteRepository) {
        this.productRepository = productRepository;
        this.loteRepository = loteRepository;
    }

    public Product GetProfuct(Long id){
        return productRepository.getReferenceById(id);
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Product CreatProduct(Product p, Long idLote){
        Optional<Lote> loteOpt = loteRepository.findById(idLote);
        if (loteOpt.isPresent()){
            p.setLote(loteOpt.get());
            return productRepository.save(p);
        }
        return null;
    }

    public void DeleteProduct (Long id){
        Optional<Product> pOps = productRepository.findById(id);
        if (pOps.isPresent()){
            Product product = pOps.get();
            product.setStatus(false);
        }

    }

    public Product updateProduct(Product product,Long idProduct){

        Optional<Product> pOps = productRepository.findById(idProduct);
        if (pOps.isPresent()){

            Product p = pOps.get();

//            p.setName(product.getName());
//            p.setCategory(product.getCategory());
//            p.setCusto(product.getCusto());
//            p.setDescription(product.getDescription());
//            p.sobescreverLote(product.getLote());
//            p.setDateVencimento(product.getDateVencimento());
//            p.setPrecoDenda(product.getPrecoDenda());
//            p.setQuant(p.getQuant());

            productRepository.save(productToProduct(p,product));

            return p;

        }

        return null;

    }

    private Product productToProduct(Product a, Product b){
        a.setName(b.getName());
        a.setCategory(b.getCategory());
        a.setCusto(b.getCusto());
        a.setDescription(b.getDescription());
        a.sobescreverLote(b.getLote());
        a.setDateVencimento(b.getDateVencimento());
        a.setPrecoDenda(b.getPrecoDenda());
        a.setQuant(b.getQuant());
        return a;


    }
}
