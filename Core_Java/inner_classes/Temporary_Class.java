package inner_classes;


class Temp {

    int age = 35;
    public void show() {

        class Temp_inner { // Temporary Helper
        

            public void config(){
                System.out.println("In config");
            }
        }

        Temp_inner obj = new Temp_inner(); // Has to be instantiated
        obj.config();
    }
}
public class Temporary_Class {
    public static void main(String[] args) {
        Temp obj = new Temp();
        obj.show();
    }
}
