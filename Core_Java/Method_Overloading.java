import java.util.*;


class Overload{
// Method we are going to overload
public static void add(int a, int b){
    System.out.println(a + b);
}

public static void add(int a, int b, int c) {
    System.out.println(a + b + c);
}

public static void add(double a, double b) {
    System.out.println(a + b );
}

}
public class Method_Overloading {
    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.add(1,2);
        obj.add(2, 4.5);
        obj.add(1,2,3);
    }
    
}