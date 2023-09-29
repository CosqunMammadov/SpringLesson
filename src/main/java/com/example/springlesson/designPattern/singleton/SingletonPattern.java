package com.example.springlesson.designPattern.singleton;

public class SingletonPattern {
    private static SingletonPattern instance;
    private SingletonPattern(){
        System.out.println("object created");
    }

    public static SingletonPattern getInstance(){
        if (instance == null){
            synchronized (SingletonPattern.class){
                if (instance == null)
                    instance = new SingletonPattern();
            }
        }
        return instance;
    }
}
