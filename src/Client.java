import FactoryMethod.ConcreteFactory1;
import SimpleFactory.Product;

public class Client {
    public static void main(String[] args) {

        Product product = new ConcreteFactory1().factoryMethod();

    }
}
