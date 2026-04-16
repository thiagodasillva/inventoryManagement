package com.thiagoRaimundo.controleEstoque.Service;

import com.thiagoRaimundo.controleEstoque.models.Lote;
import com.thiagoRaimundo.controleEstoque.models.StockMovement;
import com.thiagoRaimundo.controleEstoque.models.User;
import com.thiagoRaimundo.controleEstoque.repository.LoteRepository;
import com.thiagoRaimundo.controleEstoque.repository.StockMovimentRepository;
import com.thiagoRaimundo.controleEstoque.repository.StockRepository;
import com.thiagoRaimundo.controleEstoque.repository.UserRepository;

import java.util.Optional;

public class StockMovimentService {

    private StockMovimentRepository STRepository;
    private LoteRepository loteRepository;
    private UserRepository userRepository;

    public StockMovimentService(StockMovimentRepository STRepository, LoteRepository loteRepository, UserRepository userRepository) {
        this.STRepository = STRepository;
        this.loteRepository = loteRepository;
        this.userRepository = userRepository;
    }

    /*um stockMovimento guarda as informações VENDA, COMPRA, GASTO INTERNO

COMPRA-> precisa de um lote para ser registrado, precisa de um usuario para registrar, precisa de informações de data
e hora da entrada, e precisa ser registrada como tipo compra.

VENDA -> precisa de dados do produto que foi vendido, a quantidade, possivelmente o valor da venda, precisa de dado
do usuario que operou a venda, precisa de dados de data e hora, e precisa ser registrado como sendo uma venda.

GASTO INTERNO -> precisa ser registrado data e hora, possivelmente uma descrição, registrar o usuario, registra
o produto que esta sendo retirado, a quantidade do produto
*/

    // OPERAÇÂO DE ENTRADA
    public StockMovement EntradaStock(StockMovement stockMoviment, Long idLote, Long idUser){
        Optional<Lote> lOps = loteRepository.findById(idLote);
        Optional<User> userOpt =  userRepository.findById(idUser);
        if(lOps.isPresent() && userOpt.isPresent()){
            return STRepository.save(stockMoviment);
        }

        return null;
    }

    // OPERAÇÂO DEVENDA

    public


}
