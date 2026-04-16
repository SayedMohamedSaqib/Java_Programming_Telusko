import java.util.*;

// Please note static methods cannot be overwritten, hence we dont use any static methods here
class Animal{
    public void sound() {
        System.out.println("Animal Sound");
    }
}

/* Make sure the class extends superclass and the method has same name and parameters as
as the super class' method*/

class Cat extends Animal{
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Animal obj = new Cat();
        obj.sound();
    }    
}
