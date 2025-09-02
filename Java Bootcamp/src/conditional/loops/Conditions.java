package conditional.loops;

public class Conditions {
    public static void main(String[] args) {
        /*

        Syntax of if statements:
        if(boolean expression T or F){
            //body
        }
        else{
            //body
           }

         */

        int salary = 30000;

        if(salary>20000){
            salary += 10000;
        }
        else{
            salary+= 2000;
        }

        System.out.println(salary);

    }
}
