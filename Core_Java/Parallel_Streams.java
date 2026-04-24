import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Parallel_Streams {
    
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(10000);
        Random rand = new Random();

        for(int i = 1; i <= 10000; i++) {
            nums.add(rand.nextInt(100));
        }

        long startStream = System.currentTimeMillis();

        int sum1 = nums.stream()
        .map(n -> {

            try {
                Thread.sleep(1);
            } catch (Exception e) {
                // TODO: handle exception
            }

            return n * 2;
        })
        .mapToInt(i -> i)
        .sum();
        
        long endStream = System.currentTimeMillis();

        long startPara = System.currentTimeMillis();

        int sum2 = nums.parallelStream()
          .map(n -> {

            try {
                Thread.sleep(1);
            } catch (Exception e) {
                // TODO: handle exception
            }

            return n * 2;
        })
        .mapToInt(i -> i)
        .sum();
        
        long endPara = System.currentTimeMillis();

        long res1 = (endStream - startStream);
        long res2 = (endPara - startPara);

        System.out.println("Sum1: " + sum1 + " " + "sum2: " + sum2 );
        System.out.println("Time taken for operation 1 is: " + res1 + " ms, Time taken for operation 2: " + res2 + "ms");
    }

}
