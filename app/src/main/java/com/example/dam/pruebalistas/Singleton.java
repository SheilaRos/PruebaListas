package com.example.dam.pruebalistas;

/**
 * Created by dam on 22/12/16.
 */

public class Singleton {
    public static Singleton instance;

    public static Singleton getInstance() {
        if(instance != null) return instance;
        instance = new Singleton();
        return instance;
    }
    public static void main(){
        Singleton s = Singleton.getInstance();
    }
}
