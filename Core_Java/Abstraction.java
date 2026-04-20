abstract class Cars {

    public abstract void drive();

    public void playMusic() {
        System.out.println("Playing Music");
    }
}

class WagnonR extends Cars {

    public void drive() {
        System.out.println("Driving...");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Cars obj = new WagnonR();
        obj.drive();
    }
}
