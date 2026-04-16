import java.util.*;

// Three possible types, Multilevel Inheritance, Single Inheritance & Hierarchial Inheritance

class Car {
    void build(){
        System.out.println("The car has been built");
    }
}

// Single Inheritance

class Bugatti extends Car {
    void machinery() {
        System.out.println("Added Machinied Parts");
    }

    void brand() {
        System.out.println("Bugatti V1");
    }
}

// Multilevel Inheritance

class Ferrari extends Bugatti {

    void brand() {
        System.out.println("Ferrari V1");
    }
}

// Hierarchial Inheritance i.e Multiple childs of the parent class


class EVs extends Car {
    void engine() {
        System.out.println("Battery Powered, Go Green!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();
        ferrari.build();
        ferrari.machinery();
        ferrari.brand();

        EVs ev = new EVs();
        ev.build();
        ev.engine();
    }
}
