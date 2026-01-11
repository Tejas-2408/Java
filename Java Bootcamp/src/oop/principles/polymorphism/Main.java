package oop.principles.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Square sq = new Square();
        Shape sh2 = new Circle();

        shape.area();
        circle.area();
        sq.area();
        sh2.area();
    }
}
