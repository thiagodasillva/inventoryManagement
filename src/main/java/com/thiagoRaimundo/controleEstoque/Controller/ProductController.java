package com.thiagoRaimundo.controleEstoque.Controller;

import com.thiagoRaimundo.controleEstoque.Service.ProductService;
import com.thiagoRaimundo.controleEstoque.models.Product;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public ResponseEntity<Product> getById(@PathVariable Long id){
        return ResponseEntity.ok(productService.getProduct(id));
    }


    public ResponseEntity<Product> getByName(@PathVariable String name){
        return ResponseEntity.ok(productService.getByName(name));
    }

    public ResponseEntity<List<Product>> listProducts(){
        return ResponseEntity.ok(productService.getProducts());
    }


    public ResponseEntity<Product> creat(@Valid @RequestBody Product product){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.CreatProduct(product));
    }

    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable Long id){
        return ResponseEntity.;
    }

    public ResponseEntity<Product> updateProduct(@RequestBody Product product, @PathVariable Long id){

    }

}
