class Atta {

    public void show1() {
        System.out.println("In A show");
    }
}

class Batta extends Atta {

    public void show2() {
        System.out.println("In show 2");
    }
}

public class upcasting_downcasting {
    public static void main(String[] args) {
        Atta obj =  (Atta) new Batta(); //Upcasting
        obj.show1();

        Batta obj1 = (Batta) obj; //Downcasting
        obj1.show2();
    }
}
