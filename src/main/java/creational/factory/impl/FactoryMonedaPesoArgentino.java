package creational.factory.impl;

import creational.factory.FactoryMoneda;
import creational.product.IMoneda;
import creational.product.impl.PesoArgentino;

public class FactoryMonedaPesoArgentino extends FactoryMoneda {

    public IMoneda getMoneda() {
        return new PesoArgentino();
    }
}
