package designPattern.creationalPatterns.factory.factoryMethod.creater;

import designPattern.creationalPatterns.factory.factoryMethod.product.ProductID;
import designPattern.creationalPatterns.factory.factoryMethod.product.Writable;

/**
 * <p>
 * Abstract Factory
 * </p>
 * 2017-11-3
 *
 * @author smartBun
 * @version 0.1
 */
public abstract class Creator {
	public abstract Writable create(ProductID id);
}