package com.thiagoRaimundo.controleEstoque.Service;

import com.thiagoRaimundo.controleEstoque.exceptions.ResourceNotFoundException;
import com.thiagoRaimundo.controleEstoque.models.DTOs.StockReportDTO;
import com.thiagoRaimundo.controleEstoque.models.Product;
import com.thiagoRaimundo.controleEstoque.models.Stock;
import com.thiagoRaimundo.controleEstoque.repository.ProductRepository;
import com.thiagoRaimundo.controleEstoque.repository.StockRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StockService {

    private StockRepository stockRepository;
    private ProductRepository productRepository;


    public StockService(StockRepository stockRepositor, ProductRepository productRepository) {
        this.stockRepository = stockRepository;
        this.productRepository = productRepository;

    }


    public Stock creatStock(Stock stock){
        Product product = productRepository.findById(stock.getProduct().getId()).orElseThrow(()-> new ResourceNotFoundException("Produto informado não existe"));
        if(stock.getQuantidadeAtual()<0){
            throw new IllegalArgumentException("O valor de produtos informado não pode ser menor que zero");
        }
        return stockRepository.save(stock);

    }


    public Stock getStock(Long id){
        return stockRepository.findById(id).orElseThrow(()-> new RuntimeException("O estoque informado não existe"));
    }

    public Stock getStoctByProductId(Long id){
        Product product = productRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Produto informado não existe"));
        Stock stock = stockRepository.findByProduct_Id(id).orElseThrow(() -> new ResourceNotFoundException("Não existe um estoque com para esse produto"));
        return stock;
    }


    // Gerar relatório de estoque
    public List<Stock> gerarRelatorio() {
        List<Stock> stockList = stockRepository.findAll();
        return stockList;
    }

    private StockReportDTO stockToDTO(Stock stock){
        StockReportDTO stockReportDTO = new StockReportDTO();
        stockReportDTO.setProduct(stock.getProduct());
        stockReportDTO.setQuantidadeAtual(stock.getQuantidadeAtual());

        return stockReportDTO;

    }


}
