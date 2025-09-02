package conditional.loops;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit){
            case "mango":
                System.out.println("King of fruits");
                break;
            case "apple":
                System.out.println("Red good fruit");
                break;
            case "orange":
                System.out.println("round fruit");
                break;
            default:
                System.out.println("Enter a valid fruit");
        }
    }
}
