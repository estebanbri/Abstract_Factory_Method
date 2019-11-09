package creational.factory.impl;

import creational.factory.FactoryMoneda;
import creational.product.IMoneda;
import creational.product.impl.SGDolar;

public class FactoryMonedaSGDolar extends FactoryMoneda {

    public IMoneda getMoneda() {
        return new SGDolar();
    }

}
