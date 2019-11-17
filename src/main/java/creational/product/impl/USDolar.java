package creational.product.impl;

import creational.product.IMoneda;

public class USDolar implements IMoneda {

    private String simbolo;

    public USDolar(String simbolo){
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return this.simbolo;
    }

}
