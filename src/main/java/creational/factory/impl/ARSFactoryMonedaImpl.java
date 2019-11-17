package creational.factory.impl;

import creational.factory.AbstractFactoryMoneda;
import creational.product.IMoneda;
import creational.product.impl.PesoArgentino;

public class ARSFactoryMonedaImpl extends AbstractFactoryMoneda {

    @Override
    protected IMoneda getMoneda() {
        return new PesoArgentino("AR$");
    }

}
