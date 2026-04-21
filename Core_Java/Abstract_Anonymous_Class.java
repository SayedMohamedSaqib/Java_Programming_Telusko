abstract class Absanonymous {

    public abstract void show();
}

public class Abstract_Anonymous_Class {
    public static void main(String[] args) {
        Absanonymous obj = new Absanonymous() {
            public void show() {
                System.out.println("In new show");
            }
        };

        obj.show();
    }
}
