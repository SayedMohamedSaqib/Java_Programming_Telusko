class Zeta {

    public void show() {
        System.out.println("In Zeta Show");
    }
}

class Omega extends Zeta {

    public void show() {

        System.out.println("In Omega Show");
    }
}

public class Dynamic_Memory_Dispatch {
    
    public static void main(String[] args) {
        Zeta obj = new Zeta();

        obj.show();

        obj = new Omega();

        obj.show(); // Memory link breaks, example of runtime polymorphism
    }
}
