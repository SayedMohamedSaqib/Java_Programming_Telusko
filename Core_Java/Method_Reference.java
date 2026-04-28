import java.util.Arrays;
import java.util.List;

public class Method_Reference {

    
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Saqib", "Pratibha", "Nupoor", "Aditya", "Aryan");

        List<String> uname = names.stream()
                            .map(String::toUpperCase)
                            .toList();

        uname.forEach(System.out::println);
    }
}