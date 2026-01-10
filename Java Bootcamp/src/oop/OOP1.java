package oop;

import java.util.Arrays;

public class OOP1 {
    public static void main(String[] args) {
        Students[] students = new Students[5];
        System.out.println(Arrays.toString(students));

        Students tejas = new Students();
        System.out.println(tejas.rollno);
        System.out.println(tejas.name);
        System.out.println(tejas.marks);

        Students mani = new Students(24,"Tejas Bansal",91.0f);
        System.out.println(mani.rollno);
        System.out.println(mani.name);
        System.out.println(mani.marks);

        mani.changeNameWrong("Tejas");
        System.out.println(mani.name);

        mani.changeName("Tejas");
        System.out.println(mani.name);

        Students random = new Students(tejas); // random will replace this and tejas will replace other in constructor
        System.out.println(random.name);
        System.out.println(random.rollno);
        System.out.println(random.marks);
    }

}

class Students{
    int rollno;
    String name;
    float marks;

//    Students(){
//        this.rollno = 0;
//        this.name = "Random";
//        this.marks = 0.0f;
//    }
    // constructor calling constructor
    Students(){
        this(1,"Random",0.0f);
    }

    Students(int rollno,String name,float marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    Students(Students other){
        this.rollno = other.rollno;
        this.name = other.name;
        this.marks = other.marks;
    }

    void greeting(){
        System.out.println("Hello "+this.name);
    }

    void changeNameWrong(String name){
        name = name;
    }

    void changeName(String name){
        this.name = name;
    }
}
