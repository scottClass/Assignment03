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

        int outPos = 100;
        for (int i = 100; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                a[outPos++] = i;
            }
        }
        return a;
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
        
        for(int i = 100; i != - 1; i--) {
            System.out.println(answer[i]);
        }



    }
}
