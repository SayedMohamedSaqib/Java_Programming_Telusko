final class Eta {
    final void show() {
        System.out.println("In Eta class");
    }
}

class Phi extends Eta { // Inheritance prevented
    public void show() {
        System.out.println("In Phi show"); // Method overriding prevented
    }
}

public class final_keyword {
        public static void main(String[] args) {
            
        }
}
