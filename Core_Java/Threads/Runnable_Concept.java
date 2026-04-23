package Threads;

public class Runnable_Concept {
    public static void main(String[] args) {
        
        Runnable obj1 = () -> {
            for(int i = 1; i <= 1000; i++) {
                System.out.println("hi");
            }

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        };

        Runnable obj2 = () -> {
            for(int i = 1; i <= 1000; i++) {
                System.out.println("hello");
            }

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        
        t1.start();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        t2.start();

    }
}
