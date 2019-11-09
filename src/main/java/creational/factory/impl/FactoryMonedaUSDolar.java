package creational.factory.impl;

import creational.factory.FactoryMoneda;
import creational.product.IMoneda;
import creational.product.impl.USDolar;

public class FactoryMonedaUSDolar extends FactoryMoneda {

    public IMoneda getMoneda() {
        return new USDolar();
    }

}

