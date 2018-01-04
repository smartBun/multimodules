package com.learn.designPattern.creationalPatterns.factory.abstractFactory.abstractFactory;

import com.learn.designPattern.creationalPatterns.factory.abstractFactory.abstractProduct.InputAble;
import com.learn.designPattern.creationalPatterns.factory.abstractFactory.abstractProduct.OutputAble;

/**
 * <p>
 * Abstract Factory
 * </p>
 * 2017-11-3
 *
 * @author smartBun
 * @version 0.1
 */
public abstract class PeripheralFactory {
	public abstract InputAble createMouse();
	public abstract InputAble createKeyboard();
	public abstract OutputAble createVoiceBox();
	public abstract OutputAble createDisplay();
}
