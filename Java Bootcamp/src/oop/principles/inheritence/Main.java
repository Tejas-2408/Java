package oop.principles.inheritence;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(3);
        Box box3 = new Box(2,3,4);
        Box box4 = new Box(4,6,8,"Box");
        Box box5 = new Box(box4);

//        box1.shape    because the shape is private
//        System.out.println(box3.l + "  "+ box3.w + "   "+ box3.h);
//        System.out.println(box5.l + "  "+ box5.w + "  "+ box5.h + "  ");

        BoxWeight bw1 = new BoxWeight();
        BoxWeight bw2 = new BoxWeight(2,4,6,8);

        System.out.println(bw1.l + "  "+ bw1.w+ "  "+ bw1.h+ "  "+ bw1.weight);
        System.out.println(bw2.l + "  "+ bw2.w+ "  "+ bw2.h+ "  "+ bw2.weight);

//        bw2.testGreet();  cannot access because declared as private
        bw2.testGreet2();

        Box box6 = new BoxWeight(2,4,6,8);
        System.out.println(box6.l + "  "+ box6.w + "  "+ box6.h);
//        System.out.println(box6.weight);  //weight cannot be access because was present in child class
        // Child class can access all public variables and methods

//        BoxWeight bw3 = new Box(2,4,6);  // this will also throw error

    }
}
