package creational.factory.impl;

import creational.factory.AbstractFactoryMoneda;
import creational.product.IMoneda;
import creational.product.impl.SGDolar;

public class SGDFactoryMonedaImpl extends AbstractFactoryMoneda {

    @Override
    protected IMoneda getMoneda() {
        return new SGDolar("SGD");
    }

}
