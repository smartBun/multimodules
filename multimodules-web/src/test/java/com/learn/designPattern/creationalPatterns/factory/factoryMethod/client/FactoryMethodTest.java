package designPattern.creationalPatterns.factory.factoryMethod.client;

import designPattern.creationalPatterns.factory.factoryMethod.concreteCreater.PenCreator;
import designPattern.creationalPatterns.factory.factoryMethod.product.ProductID;
import designPattern.creationalPatterns.factory.factoryMethod.creater.Creator;
import designPattern.creationalPatterns.factory.factoryMethod.product.Writable;

public class FactoryMethodTest {
	public static void main(String[] args) {
		Creator factory = PenCreator.getInstance();
		Writable inkPen = factory.create(ProductID.InkPen);
		Writable ballPen = factory.create(ProductID.BallPen);
		inkPen.write("123");
		ballPen.write("456");
	}
}
