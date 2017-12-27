package designPattern.creationalPatterns.factory.simpleFactory.client;

import designPattern.creationalPatterns.factory.simpleFactory.concreteProduct.Apple;
import designPattern.creationalPatterns.factory.simpleFactory.simpleFactory.SimpleFactory;

/**
 * Created by Yang on 2017/11/3.
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Apple broom = (Apple) simpleFactory.create(Apple.class);
        broom.eat();
    }
}
