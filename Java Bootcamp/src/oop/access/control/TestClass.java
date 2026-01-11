package oop.access.control;

public class TestClass {
    private int num;
    // will accessible only in this class

    protected String name;
    // accessible in this class, same package, subClasses (child class even in different package)

    public int salary;
    // accessible everywhere

    int age;
    // accessible only in this class, package or subclass in same package

    public TestClass() {
    }

    public TestClass(int num, String name, int salary, int age) {
        this.num = num;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
