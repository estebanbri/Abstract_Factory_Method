package creational.product.impl;

import creational.product.IMoneda;

public class SGDolar  implements IMoneda {

    private String simbolo;

    public SGDolar(String simbolo){
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return this.simbolo;
    }

}
