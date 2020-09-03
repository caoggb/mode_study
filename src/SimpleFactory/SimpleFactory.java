package SimpleFactory;

/**
 * 简单工厂
 */
public class SimpleFactory {

    public Product createProduct(int type) {
        if (type == 2) {
            return new ConcreteProduct2();
        } else if (type == 3) {
            return new ConcreteProduct3();
        }
        return new ConcreteProduct1();
    }
}

/**
 * client
 */
class Client {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(1);
    }
}
