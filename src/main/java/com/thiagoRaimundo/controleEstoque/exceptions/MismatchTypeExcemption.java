package com.thiagoRaimundo.controleEstoque.exceptions;

public class MismatchTypeExcemption extends RuntimeException{

    public MismatchTypeExcemption(){
        super();
    }

    public MismatchTypeExcemption(String s){
        super(s);
    }

}
