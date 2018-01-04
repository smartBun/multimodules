package com.learn.designPattern.creationalPatterns.factory.simpleFactory.concreteProduct;

import com.learn.designPattern.creationalPatterns.factory.simpleFactory.AbstractProduct.edible;

public class Orange implements edible {
  
    @Override  
    public void eat() {
        System.out.println("This is an orange, taste acid.");
    }  
  
}  