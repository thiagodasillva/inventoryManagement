package com.thiagoRaimundo.controleEstoque.exceptions;

import com.thiagoRaimundo.controleEstoque.models.Product;

import java.util.List;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException() {
        super();
    }

    public ResourceNotFoundException(String s) {
        super(s);
    }

    public ResourceNotFoundException(String s,Throwable t) {
        super(s,t);
    }

    public ResourceNotFoundException(Throwable t) {
        super(t);
    }


}
