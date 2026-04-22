package Exception_Handling;

import java.io.*;

public class Finally {
    public static void main(String[] args) throws IOException {

        BufferedReader br = null;

        try {
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);

            int num = Integer.parseInt(br.readLine());
            System.out.println(num);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Execution ended...");
            if (br != null) {
                br.close();
            }
        }
    }
}