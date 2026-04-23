package Collection_Interfaces_APIs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class Array_list {
    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);

        System.out.println(nums.get(0));
        System.out.println(nums.indexOf(8));
        System.out.println("Looping over..");

        for(int n : nums) {
            System.out.println(n);
        }
    }
}
