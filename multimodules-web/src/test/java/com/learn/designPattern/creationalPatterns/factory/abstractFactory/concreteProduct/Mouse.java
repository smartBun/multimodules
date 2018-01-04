package com.learn.designPattern.creationalPatterns.factory.abstractFactory.concreteProduct;

import com.learn.designPattern.creationalPatterns.factory.abstractFactory.abstractProduct.AbstractPeripheralProduct;
import com.learn.designPattern.creationalPatterns.factory.abstractFactory.abstractProduct.InputAble;

public class Mouse extends AbstractPeripheralProduct implements InputAble{

	@Override
	public void input(String content) {
		System.out.println("This is a mouse. Made In " + getMadeIn());
		System.out.println("You click [ " + content + " ] by mouse");
	}
}
