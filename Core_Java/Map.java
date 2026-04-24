import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        // Function<Integer, Integer> fun = new Function<Integer, Integer>() {

        //     @Override
        //     public Integer apply(Integer n) {
        //         // TODO Auto-generated method stub
        //         return n * 2;
        //     }
            
        // };

        // Stream<Integer> s1 = nums.stream().map(fun);
        // s1.forEach(n -> System.out.println(n));

        // //Lambda Expression
        // Function<Integer, Integer> fun = (n) -> n * 2;
        // Stream<Integer> s1 = nums.stream().map(fun);
        // s1.forEach(n -> System.out.println(n));
        
        //Even Shorter
        Stream<Integer> s1 = nums.stream().map(n -> n * 2);
        s1.forEach(n -> System.out.println(n));

    }
}
