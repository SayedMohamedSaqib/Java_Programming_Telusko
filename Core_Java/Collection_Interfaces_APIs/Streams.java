package Collection_Interfaces_APIs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Streams {
    
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        Stream <Integer> s1 = nums.stream();
        Stream <Integer> s2 = s1.filter((n) -> n % 2 == 0);
        Stream <Integer> s3 = s2.map(n -> n * 2);

        // s1.forEach((n) -> System.out.println(n)); //Cannot print together, due to one time use
        // s2.forEach((n) -> System.out.println(n));
        s3.forEach((n) -> System.out.println(n));

    }

}
