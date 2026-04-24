import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Reduce {
    

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        int result = nums.stream().reduce(0, (c,e) -> c + e);
        System.out.println(result);

    }
}
