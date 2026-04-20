package inner_classes;

class P {
    int age;
    public void show() {
        System.out.println("In P");
    }

    static class Q {
        public void config() {
            System.out.println("In config");
        }
    }
}

public class Static_Class {
    public static void main(String[] args) {
        P.Q obj  = new P.Q();
        obj.config(); // Doesnt need P object, however cant access P's Methods, no direct reference
    }
}
