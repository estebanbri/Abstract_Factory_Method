package creational.product.impl;

import creational.product.IMoneda;

public class PesoArgentino  implements IMoneda {

    private String simbolo;

    public PesoArgentino(String simbolo){
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return this.simbolo;
    }

}
