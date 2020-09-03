package FactoryMethod;

import SimpleFactory.ConcreteProduct2;
import SimpleFactory.Product;

public class ConcreteFactory2 extends Factory {

    public Product factoryMethod() {
        return new ConcreteProduct2();
    }

}
