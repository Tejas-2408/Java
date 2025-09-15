package string;

public class Basics {
    public static void main(String[] args) {
        String name = "Tejas";
        System.out.println(name);
        String name2 = "Tejas";
        System.out.println(name==name2);  // because in String pool both will pointed to same object
        System.out.println(name.contains(name2));

        String a = new String("Tejas");
        String b = new String("Tejas");
        System.out.println(a==b);  // now objects are created in heap and points to different objects
        System.out.println(a.contains(b));
        System.out.println(a.equals(b));
    }
}
