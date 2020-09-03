package FactoryMethod;

import SimpleFactory.Product;

/**
 * 工厂方法
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory1();
        Product product = factory.factoryMethod();

    }
}
