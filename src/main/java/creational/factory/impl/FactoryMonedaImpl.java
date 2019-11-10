package creational.factory.impl;

import creational.factory.FactoryMoneda;
import creational.product.IMoneda;
import creational.product.impl.PesoArgentino;
import creational.product.impl.SGDolar;
import creational.product.impl.USDolar;

public class FactoryMonedaImpl extends FactoryMoneda {

    @Override
    protected IMoneda getMoneda(String pais) {
        IMoneda moneda = null;

        switch (pais){
            case "ARGENTINA":
                moneda =  new PesoArgentino(); break;
            case "EEUU":
                moneda = new USDolar(); break;
            case "SINGAPUR":
                moneda = new SGDolar(); break;
            default:
                throw new IllegalArgumentException("Tipo de pais desconocido");
        }

        return moneda;
    }
}
