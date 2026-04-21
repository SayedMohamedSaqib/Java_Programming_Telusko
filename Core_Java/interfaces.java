interface X {

    int age = 99; // final and static
    void show(); // public abstract
    void config(); 
}

interface Y extends X {

    void run();
}

class Z implements X, Y {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Running");
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("In Show");
    }

    @Override
    public void config() {
        // TODO Auto-generated method stub
        System.out.println("Configuring");
    }

    
}

public class interfaces {
    public static void main(String[] args) {
        X obj = new Z();
        obj.show();
        obj.config();
        
        Y obj1 = new Z();
        obj1.run();
    }
}
