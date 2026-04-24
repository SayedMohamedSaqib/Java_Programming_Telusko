import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        // Predicate<Integer> p = new Predicate<Integer>() {

        //     @Override
        //     public boolean test(Integer n) {
        //         if(n % 2 == 0) {

        //             return true;
        //         }

        //         else {

        //             return false;
        //         }
        //     }
            
        // };

        // Lambda Expression
        // Predicate <Integer> p = n -> n % 2 == 0;

        // Stream<Integer> s1 = nums.stream().filter(p);
        // s1.forEach(n -> System.out.println(n));

        // Even shorter
        Stream<Integer> s1 = nums.stream().filter(n -> n % 2 == 0);
        s1.forEach((n -> System.out.println(n)));

    }
}
