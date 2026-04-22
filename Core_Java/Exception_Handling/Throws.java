package Exception_Handling;


class Ducking_Errors {
    public void show() throws ClassNotFoundException {
        Class.forName("Demo");
    }
}
public class Throws {
    public static void main(String[] args) {
        Ducking_Errors obj = new Ducking_Errors();
        obj.show();
    }
}
