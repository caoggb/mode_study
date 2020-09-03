package FactoryMethod;

import SimpleFactory.ConcreteProduct3;
import SimpleFactory.Product;

public class ConcreteFactory3 extends Factory {

    public Product factoryMethod() {
        return new ConcreteProduct3();
    }
}
