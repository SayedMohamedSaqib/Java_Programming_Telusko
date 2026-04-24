package Collection_Interfaces_APIs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        // for(int i = 0; i < nums.size(); i++) {

        //     System.out.println(nums.get(i));

        // }

        // for(Integer n : nums) {

        //     System.out.println(n);

        // }

        // Consumer <Integer> con = new Consumer<Integer>() {
        //     public void accept(Integer n) {
        //         System.out.println(n);
        //     }
        // };

        // nums.forEach(con);

        // Lambda Expression -

        nums.forEach((n) -> System.out.println(n));

    }

}
