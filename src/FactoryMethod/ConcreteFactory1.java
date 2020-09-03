package FactoryMethod;

import SimpleFactory.ConcreteProduct1;
import SimpleFactory.Product;


public class ConcreteFactory1 extends Factory {

    public Product factoryMethod() {
        return new ConcreteProduct1();
    }

}
