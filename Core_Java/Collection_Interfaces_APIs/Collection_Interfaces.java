package Collection_Interfaces_APIs;

import java.util.ArrayList;
import java.util.Collection;
public class Collection_Interfaces {
    public static void main(String[] args) {
        
        Collection <Integer> nums = new ArrayList<Integer>();

        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);

        for(Object n : nums) {
            System.out.println(n);
        }
    }
}
