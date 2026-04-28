import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Etudiant {

    private String name;
    private int age;

    public Etudiant() {
    }

    public Etudiant(String name) {
        this.name = name;
    }

    public Etudiant(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Etudiant [name=" + name + ", age=" + age + "]";
    }

    
    
}
public class Constructor_Reference {

    
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Saqib", "Pratibha", "Nupoor", "Aditya", "Aryan");

        //Ways to create constructor for all the names inside
        //For Loop

        List<Etudiant> students = new ArrayList<>();
        // for(String name : names) {

        //     students.add(new Etudiant(name));
        // }

        //Map

        // students = names.stream().map(name -> new Etudiant(name)).toList();

        //Constructor Reference

        students = names.stream()
                        .map(Etudiant::new)
                        .toList();

        System.out.println(students);
    }
}