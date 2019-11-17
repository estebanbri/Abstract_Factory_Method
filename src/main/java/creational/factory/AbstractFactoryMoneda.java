package creational.factory;

import creational.product.IMoneda;


public abstract class AbstractFactoryMoneda {

    public IMoneda crearMoneda(){ // Este metodo sirve unicamente para agregar logica pre/post al creado de la moneda antes de retornarla al cliente
        return this.getMoneda();
    }

    protected abstract IMoneda getMoneda();  // Factory Method
}
