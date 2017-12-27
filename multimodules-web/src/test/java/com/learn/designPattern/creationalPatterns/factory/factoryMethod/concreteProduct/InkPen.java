package designPattern.creationalPatterns.factory.factoryMethod.concreteProduct;

import designPattern.creationalPatterns.factory.factoryMethod.product.Writable;

public class InkPen implements Writable {

	@Override
	public void write(String content) {
		System.out.println("write with Ink Pen => " + content);
	}
}
