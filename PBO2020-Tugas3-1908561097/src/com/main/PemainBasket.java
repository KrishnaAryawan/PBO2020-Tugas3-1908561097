package com.main;

import java.io.Serializable;

public class PemainBasket implements Serializable {
    private String namaPemain;

    public PemainBasket(String namaPemain) {
        this.namaPemain = namaPemain;
    }

    public String getNamaPemain() {
        return namaPemain;
    }
}
