package oop.principles.inheritence;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight(){
        this.weight = -1;
//        this.shape   // this will give error as shape is decalred as private in parent class
    }

    public BoxWeight(double l, double w, double h, double weight){
        super(l,w,h);
        this.weight = weight;
    }

}
