package Protected_Keyword;

import package_1.Alpha;

// protected methods can only be accessed by creating a subclass of the original class in the other package

public class Beta extends Alpha {

    public void display() {
        show();
    }

    public static void main(String[] args) {
        Beta obj = new Beta();
        obj.display();
    }
}