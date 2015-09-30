
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johns6971
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of numbers to sort: ");
        int length = input.nextInt();

        int[] n = new int[length];

        for (int i = 0; i < n.length; i++) 
        {
            System.out.println("Enter number " + i);
            n[i] = input.nextInt();
        }



        for (int i = 1; i < n.length; i++) 
        {
            int d = i;
            //while d is bigger than 0
            //and while the d-1 spot in the array is smaller than the d spot
            //switch them
            while (d > 0 && n[d - 1] < n[d]) 
            {
                int temp = n[d];
                n[d] = n[d - 1];
                n[d - 1] = temp;
                d--;
            }
        }
        
        for(int i = 0; i < n.length; i ++) {
            System.out.print(n[i] + ", ");
        }

    }
}
