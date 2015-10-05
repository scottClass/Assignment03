
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
        for(int i = 0; i < array.length; i++) {
            if(array[i].charAt(0) > array[i+1].charAt(0)) {
                
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
        
        for(int i = 0; i < array.length; i++) {
            System.out.println("Enter word " + i + ": ");
            array[i] = input.nextLine();
        }
        String[] done = new String[length];
        
        done = (alphaSort(array));
        
        for(int i = 0; i < done.length; i ++) {
            System.out.println(done[i]);
        }
        
    }
}
