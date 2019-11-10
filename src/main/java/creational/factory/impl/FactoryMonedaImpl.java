package creational.factory.impl;

import creational.factory.FactoryMoneda;
import creational.product.IMoneda;
import creational.product.impl.PesoArgentino;
import creational.product.impl.SGDolar;
import creational.product.impl.USDolar;

public class FactoryMonedaImpl extends FactoryMoneda {

    protected IMoneda getMoneda(String pais) {
        switch (pais){
            case "ARGENTINA":
                return  new PesoArgentino();
            case "EEUU":
                return new USDolar();
            case "SINGAPUR":
                return new SGDolar();
            default:
                throw new IllegalArgumentException("Tipo de pais desconocido");
        }
    }
}
