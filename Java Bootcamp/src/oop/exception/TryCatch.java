package oop.exception;

public class TryCatch {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
//        int c = a/b;
        try{
//            int c = a/b;
            divide(a,b);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This is finally. Execute always");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException("please don't divide by 0");
        }
        return a/b;
    }
}
