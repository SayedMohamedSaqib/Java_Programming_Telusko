sealed class A_1 permits B_1, C_1 {

}

final class B_1 extends A_1{

}

sealed class C_1 extends A_1 permits D_1 {

}

final class D_1 extends C_1{
    
}

public class Sealed_Classes {
    public static void main(String[] args) {
        
    }
}
