// class Alien {

//     private final int age;
//     private final String name;

//     public Alien(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public String toString() {
//         return "Alien [age=" + age + ", name=" + name + "]";
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + age;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Alien other = (Alien) obj;
//         if (age != other.age)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }

    
    
// }

record Alien (int id, String name){
    public Alien {
        if(id == 0) throw new IllegalArgumentException("ID cannot be zero");
    }
}

public class Record_Classes {
    

    public static void main(String[] args) {
        
        Alien a1 = new Alien(2, "Saqib");
        System.out.println(a1);
    }
}
