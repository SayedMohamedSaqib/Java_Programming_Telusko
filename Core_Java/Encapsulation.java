import java.util.*;

class Student {

    private String name;
    
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        
        Student obj = new Student();
        String name = "Sayed";
        obj.setName(name);
        System.out.println(obj.getName());
        System.out.println(obj.getClass());

    }
}
