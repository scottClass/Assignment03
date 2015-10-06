
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns6971
 */
public class Problem7 {

    
    static String[] alphaSort(String[] array) {
        for(int f = 0; f < array.length; f++) {
        
            for (int i = 0; i < array.length; i++) {
                if (i + 1 != array.length) {
                    String a = array[i];
                    String b = array[i + 1];
                    int compare = a.compareTo(b);
                
                    int j = 1;
                    while(a.charAt(j) == b.charAt(j) && !a.equals(b)) {
                        String sub = a.substring(j);
                        String sub2 = b.substring(j);
                        compare = sub.compareTo(sub2);
                        j++;
                    }
                
                    if (compare > 0) {
                        String temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }
                }

            }   
        }
        
        return array;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of words to sort: ");

        int length = input.nextInt();

        String[] array = new String[length];

        input.nextLine();

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter word " + i + ": ");
            array[i] = input.nextLine();
        }
        String[] done = new String[length];

        done = (alphaSort(array));
        
        System.out.println();
        System.out.println();
        for (int i = 0; i < done.length; i++) {
            System.out.println(done[i]);
        }

    }
}
