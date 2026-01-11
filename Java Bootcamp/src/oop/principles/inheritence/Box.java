package oop.principles.inheritence;

public class Box {
    double l;
    double w;
    double h;
    private String shape;

    public Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
        this.shape = "Cube";
    }

    // if the shape is cube
    public Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public Box(double l, double w, double h, String shape) {
        this.l = l;
        this.w = w;
        this.h = h;
        this.shape = shape;
    }

    public Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
        this.shape = old.shape;
    }

    private void testGreet(){
        System.out.println("I am private method");
    }

    void testGreet2(){
        System.out.println("I am public method");
    }
}
