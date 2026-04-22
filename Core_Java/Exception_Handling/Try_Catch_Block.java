package Exception_Handling;

public class Try_Catch_Block {
    
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        int arr[] = new int[5];
        String s = null;

        try {

            j = 18/i;
            System.out.println(s.length());
            System.out.println(arr[5]);

        }

        catch (ArithmeticException e) {

            System.out.println(e);
        }

        catch( NullPointerException e) {
            System.out.println(e);
        }

        catch(ArrayIndexOutOfBoundsException e) {

            System.out.println(e);
        }

        // Exception class is parent to the classes above therefore it must be declared at end
        catch (Exception e) {
            System.out.println("Something went wrong... " + e);
        }

        System.out.println("Execution Complete...");
    }
}
