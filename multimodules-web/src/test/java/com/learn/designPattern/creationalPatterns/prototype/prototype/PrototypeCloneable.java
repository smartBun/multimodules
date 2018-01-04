package com.learn.designPattern.creationalPatterns.prototype.prototype;

public interface PrototypeCloneable extends Cloneable{
	Object clone() throws CloneNotSupportedException;
}