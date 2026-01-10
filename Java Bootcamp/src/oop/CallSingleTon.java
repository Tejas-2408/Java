package oop;

public class CallSingleTon {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        Singleton c = Singleton.getInstance(); // In all three variables only single object is retruned

    }
}
