package com.learn.designPattern.creationalPatterns.factory.abstractFactory.concreteFactory;

import com.learn.designPattern.creationalPatterns.factory.abstractFactory.abstractFactory.PeripheralFactory;
import com.learn.designPattern.creationalPatterns.factory.abstractFactory.abstractProduct.InputAble;
import com.learn.designPattern.creationalPatterns.factory.abstractFactory.abstractProduct.OutputAble;
import com.learn.designPattern.creationalPatterns.factory.abstractFactory.concreteProduct.Display;
import com.learn.designPattern.creationalPatterns.factory.abstractFactory.concreteProduct.Keyboard;
import com.learn.designPattern.creationalPatterns.factory.abstractFactory.concreteProduct.Mouse;
import com.learn.designPattern.creationalPatterns.factory.abstractFactory.concreteProduct.VoiceBox;

public class ConcreteFactory1 extends PeripheralFactory{
	
	private static final String FACTORYNAME = "ConcreteFactory1";
	
	private ConcreteFactory1() {
		
	}
	
	public static ConcreteFactory1 getInstance() {
		return new ConcreteFactory1();
	}

	@Override
	public InputAble createMouse() {
		Mouse mouse = new Mouse();
		mouse.setMadeIn(FACTORYNAME);
		return mouse;
	}

	@Override
	public InputAble createKeyboard() {
		Keyboard keyboard = new Keyboard();
		keyboard.setMadeIn(FACTORYNAME);
		return keyboard;
	}

	@Override
	public OutputAble createVoiceBox() {
		VoiceBox voiceBox = new VoiceBox();
		voiceBox.setMadeIn(FACTORYNAME);
		return voiceBox;
	}

	@Override
	public OutputAble createDisplay() {
		Display display = new Display();
		display.setMadeIn(FACTORYNAME);
		return display;
	}
	
}
