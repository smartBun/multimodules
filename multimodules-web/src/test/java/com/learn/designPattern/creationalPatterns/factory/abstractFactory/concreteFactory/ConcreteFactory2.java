package designPattern.creationalPatterns.factory.abstractFactory.concreteFactory;

import designPattern.creationalPatterns.factory.abstractFactory.abstractFactory.PeripheralFactory;
import designPattern.creationalPatterns.factory.abstractFactory.abstractProduct.InputAble;
import designPattern.creationalPatterns.factory.abstractFactory.abstractProduct.OutputAble;
import designPattern.creationalPatterns.factory.abstractFactory.concreteProduct.Display;
import designPattern.creationalPatterns.factory.abstractFactory.concreteProduct.Keyboard;
import designPattern.creationalPatterns.factory.abstractFactory.concreteProduct.Mouse;
import designPattern.creationalPatterns.factory.abstractFactory.concreteProduct.VoiceBox;

public class ConcreteFactory2 extends PeripheralFactory{
	
	private static final String FACTORYNAME = "ConcreteFactory2";
	
	private ConcreteFactory2() {
		
	}
	
	public static ConcreteFactory2 getInstance() {
		return new ConcreteFactory2();
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
