package Collection_Interfaces_APIs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student {

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    
    
}
public class Collections_Comparator {
    public static void main(String[] args) {
        Comparator <Integer> com = new Comparator<Integer>() {
            public int compare (Integer i, Integer j) {
                if(i % 10 > j % 10) {

                    return 1;
                }

                else {

                    return -1;
                }
            }
        };

        Comparator <Student> com_stud = (i, j) -> i.age > j.age? 1 : -1; 

        List<Integer> nums = new ArrayList<>();

        nums.add(29);
        nums.add(72);
        nums.add(43);
        nums.add(31);

        List <Student> studs = new ArrayList<>();
        studs.add(new Student(21, "John"));
        studs.add(new Student(18, "Jack"));
        studs.add(new Student(23, "Ryan"));
        studs.add(new Student(17, "James"));

        Collections.sort(nums, com);
        Collections.sort(studs, com_stud);

        for(Student s : studs) {
            System.out.println(s);
        }
        System.out.println(nums);
    }
}
