package inner_classes;

class Anon {
    public void show() {
        System.out.println("In show");
    }
}
public class Anonymous_Class {
    public static void main(String[] args) {
        Anon obj = new Anon() { // No new class created, method overriden once
            public void show() {
                System.out.println("In new show!");
            }
        };

        obj.show();
    }
}
