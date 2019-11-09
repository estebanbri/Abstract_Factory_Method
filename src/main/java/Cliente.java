import creational.factory.FactoryMoneda;
import creational.factory.impl.FactoryMonedaPesoArgentino;
import creational.factory.impl.FactoryMonedaSGDolar;
import creational.factory.impl.FactoryMonedaUSDolar;
import creational.product.IMoneda;

public class Cliente {
    public static void main(String[] args) {

        FactoryMoneda factory =
                //new FactoryMonedaPesoArgentino();
                //new FactoryMonedaSGDolar();
                new FactoryMonedaUSDolar();

        // getMoneda() es el Abstract Factory Method
        IMoneda moneda = factory.getMoneda();
        String simbolo = moneda.getSimbolo();
        System.out.println(simbolo);
    }
}
