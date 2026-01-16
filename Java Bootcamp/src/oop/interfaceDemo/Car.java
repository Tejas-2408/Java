package oop.interfaceDemo;

public class Car implements Engine, Break{
    @Override
    public void breake() {
        System.out.println("I am Brake and braking");
    }

    @Override
    public void start() {
        System.out.println("Engine Starting");
    }

    @Override
    public void stop() {
        System.out.println("Engine Stop");
    }

    @Override
    public void acc() {
        System.out.println("Accelarating");
    }
}
