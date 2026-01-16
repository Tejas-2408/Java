package oop.interfaceDemo;

public interface Engine {
    static final int PRICE = 90000; // even if static and final is not declared the variables of Interface is by default static and final

    void start();
    void stop();
    void acc();
}
