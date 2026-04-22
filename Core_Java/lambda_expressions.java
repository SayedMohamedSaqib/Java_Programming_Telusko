// Works only with Functional Interface (SAM)

@FunctionalInterface
interface Q {
    int add(int i, int j);
}

public class lambda_expressions {
    public static void main(String[] args) {
        Q obj = (i,j) -> i + j;
        System.out.println(obj.add(7,3));
    }
}
