package designPattern.creationalPatterns.factory.simpleFactory.simpleFactory;

import designPattern.creationalPatterns.factory.simpleFactory.concreteProduct.Apple;
import designPattern.creationalPatterns.factory.simpleFactory.concreteProduct.Orange;

public class SimpleFactory {
  
    public Object create(Class<?> clazz) {  
        if (clazz.getName().equals(Orange.class.getName())) {
            return createPlane();  
        } else if (clazz.getName().equals(Apple.class.getName())) {
            return createBroom();  
        }  
          
        return null;  
    }  
      
    private Apple createBroom() {
        return new Apple();
    }  
      
    private Orange createPlane() {
        return new Orange();
    }  
}  