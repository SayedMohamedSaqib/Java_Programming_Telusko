import java.util.*;

/* By default every constructor in Java has a super method that is hidden, the super method calls
the constructor of the Parent class automatically, also it is noteworthy that every class in Java
extends the object class.*/

// Understanding the need for super method()

class A {

    public A() {
        System.out.println("in A");
    }

    public A(int n) {

        System.out.println("in A int");
    }

}

class B extends A {

    public B() {
        System.out.println("in B");
    }

    public B(int n) {
        System.out.println("in B int");
    }

}

class C extends A {

    public C() {
        System.out.println("in C");
    }
     
    public C(int n) {
        this();
        System.out.println("in C int");
    }     
}

public class this_super {

    public static void main(String[] args) {
        B obj = new B(); // This calls the constructor of the parent class due to super()
    
        B obj_parameterized = new B(5); // Again The parameterized constructor is called

        C obj_c = new C(5); // this() method executes constructor of same class


    }
}
