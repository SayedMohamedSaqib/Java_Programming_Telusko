import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optional_Class {

    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Saqib", "Pratibha", "Nupoor", "Reach");
        Optional<String> name = Optional.of(names.stream()
        .filter(str -> str.contains("S"))
        .findFirst()
        .orElse("Not Found"));

        System.out.println(name);
                                    
    }
}