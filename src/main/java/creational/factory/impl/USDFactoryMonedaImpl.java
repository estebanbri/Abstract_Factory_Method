package creational.factory.impl;

import creational.factory.AbstractFactoryMoneda;
import creational.product.IMoneda;
import creational.product.impl.USDolar;

public class USDFactoryMonedaImpl extends AbstractFactoryMoneda {

    @Override
    protected IMoneda getMoneda() {
        return new USDolar("USD");
    }

}
