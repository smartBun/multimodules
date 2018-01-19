package com.learn.designPattern.creationalPatterns.singleton.enumSingleton;

public class EnumSingleton {

    private EnumSingleton() {}

    public static EnumSingleton getInstance() {
        return Singleton.Instance.getInstance();
    }

    private enum Singleton {
        Instance;
        private EnumSingleton singleton;
        Singleton () {
            singleton = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return singleton;
        }
    }
}
