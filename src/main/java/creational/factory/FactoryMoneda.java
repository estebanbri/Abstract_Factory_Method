package creational.factory;

import creational.product.IMoneda;

public abstract class FactoryMoneda {

    public IMoneda crearMoneda(String pais){
        return this.getMoneda(pais);
    }

    // Factory Method
    protected abstract IMoneda getMoneda(String pais);
}
