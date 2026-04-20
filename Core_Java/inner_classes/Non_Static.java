package inner_classes;

class M {

    int age;
    public void show() {
        System.out.println("In show");
    }

    class N {
        public void config(){
            System.out.println("In config");
            show(); //Works since there is a direct reference to outer class
        }
    }
}


public class Non_Static {
    public static void main(String[] args) {
        M objM = new M();
        objM.show();

        M.N objN = objM.new N(); //Linked to outer class, therefore you have to link the objects
        objN.config();
    }
}
