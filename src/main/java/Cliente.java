import creational.factory.AbstractFactoryMoneda;
import creational.factory.impl.ARSFactoryMonedaImpl;
import creational.factory.impl.SGDFactoryMonedaImpl;
import creational.factory.impl.USDFactoryMonedaImpl;
import creational.product.IMoneda;

public class Cliente {
    public static void main(String[] args) {

        AbstractFactoryMoneda factory
                = new ARSFactoryMonedaImpl();    // Fabrica de peso argentino
                //= new SGDFactoryMonedaImpl();  // Fabrica de dolar de singapur
                //= new USDFactoryMonedaImpl();  // Fabrica de dolar usa
        IMoneda moneda = factory.crearMoneda(); // crearMoneda() es el factory method
        String simbolo = moneda.getSimbolo();
        System.out.println(simbolo);
    }
}
