import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Ordered Array
        int[] x = {12,43,64,121,440,801};

        // Search Term
        int search = 43;

        // Iterate

        for(int i=0;i<x.length;i++) {
            // System.out.println(x[i]);

            if (x[i] == search) {
                System.out.println("Found: "+search+" at "+i);
                break;
            }
            else {
                // System.out.println("Not Found");



            }



        }


    }

}
