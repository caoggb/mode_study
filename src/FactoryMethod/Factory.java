package FactoryMethod;

import SimpleFactory.Product;

/**
 * 抽象的工厂
 */
public abstract class Factory {

    public abstract Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        // do something with the product
    }

}
