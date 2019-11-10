import creational.factory.FactoryMoneda;
import creational.factory.impl.FactoryMonedaImpl;
import creational.product.IMoneda;

public class Cliente {
    public static void main(String[] args) {

        FactoryMoneda factory = new FactoryMonedaImpl();

        IMoneda moneda = factory.crearMoneda("ARGENTINA");
        String simbolo = moneda.getSimbolo();
        System.out.println(simbolo);
    }
}
