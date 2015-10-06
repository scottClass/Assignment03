/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns6971
 */
public class Problem6 {

    public static int[] sort(int[] a) {
        int[] bucket = new int[101];

        
        int place = a.length - 1;
        
        for(int i = 0; i < bucket.length; i++) {
            bucket[i] = a[place];
            place--;
        }
        
        return bucket;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[101];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        
        int[] answer = new int[array.length];
        
        answer = sort(array);
        
        for(int i = 0; i < answer.length; i ++) {
            System.out.print(answer[i] + ", ");
        }
        System.out.println();
        System.out.println();


    }
}
