package designPattern.creationalPatterns.factory.abstractFactory.client;

import designPattern.creationalPatterns.factory.abstractFactory.abstractFactory.PeripheralFactory;
import designPattern.creationalPatterns.factory.abstractFactory.abstractProduct.InputAble;
import designPattern.creationalPatterns.factory.abstractFactory.abstractProduct.OutputAble;
import designPattern.creationalPatterns.factory.abstractFactory.concreteFactory.ConcreteFactory1;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		PeripheralFactory peripheralFactory;
		System.out.println("====================================================");
		System.out.println("Get peripherals from ConcreteFactory\n");
		peripheralFactory = ConcreteFactory1.getInstance();
		InputAble keyboard = peripheralFactory.createKeyboard();
		InputAble mouse = peripheralFactory.createMouse();
		OutputAble display = peripheralFactory.createDisplay();
		OutputAble voiceBox = peripheralFactory.createVoiceBox();

		keyboard.input("abc");
		mouse.input("Button A");
		System.out.println(display.output());
		System.out.println(voiceBox.output());
	}
}
