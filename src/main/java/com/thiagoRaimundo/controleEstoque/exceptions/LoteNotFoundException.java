package com.thiagoRaimundo.controleEstoque.exceptions;

public class LoteNotFoundException extends RuntimeException {

    public LoteNotFoundException(){
        super();
    }

    public LoteNotFoundException(String s){
        super(s);
    }

}
