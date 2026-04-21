@Deprecated
class I {
    public void showMethodThatBelongsToI(){
        System.out.println("In I Show");
    }
}

class J extends I {

    @Override //Early warning given at Compile time
    public void showMethodThatBelongstoI(){
        System.out.println("In J show");
    }
}

public class Core_Java_Annotations {

    public static void main(String[] args) {
        J obj = new J();
        obj.showMethodThatBelongsToI();
    }
}