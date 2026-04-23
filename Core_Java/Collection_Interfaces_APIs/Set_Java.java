package Collection_Interfaces_APIs;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Java {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(55);
        nums.add(9);
        nums.add(7);
        nums.add(8);
        nums.add(8); // takes in only unique values, there is no index values in a set.


        for(int n : nums) {

            System.out.println(n);

        }
        System.out.println();
        
        // For printing in order

        Set <Integer> orderednums = new TreeSet<Integer>();
        orderednums.add(55);
        orderednums.add(97);
        orderednums.add(73);
        orderednums.add(18);
        orderednums.add(22);        
        for(int n : orderednums) {

            System.out.println(n);
        }
    }
}

