package Exception_Handling;

import java.util.Scanner;

class MyExecption extends Exception {
    public MyExecption (String string) {
        super(string);
    }
}


public class Throw{
    
    public static void main(String[] args) {
        int j = 1;
        int i = 10;

        try {

            if(j == 0) {
                throw new MyExecption("I dont want to print 0");

            }

            if(i == 10) {
                throw new ArithmeticException("Invalid Values");
            }
        }

        catch(MyExecption e) {
            System.out.println("thats the default output: " + e);

        }

        catch(ArithmeticException e){
            System.out.println(e);
        }
        // Exception class is parent to the classes above therefore it must be declared at end
        catch (Exception e) {
            System.out.println("Something went wrong... " + e);
        }

        System.out.println("Execution Complete...");
    }
}
