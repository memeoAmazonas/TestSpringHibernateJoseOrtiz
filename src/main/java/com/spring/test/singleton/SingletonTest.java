package com.spring.test.singleton;

public class SingletonTest {

    private static SingletonTest singletonTest;
    private String name;

    public static SingletonTest getInstance(String name) {
        if (singletonTest == null){
            singletonTest = new SingletonTest(name);
        }
        return singletonTest;
    }

    public String getName() {
        return name;
    }

    private SingletonTest(String name) {
        this.name = name;
    }

}
