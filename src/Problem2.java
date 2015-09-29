/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns6971
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] n = new int[]{25, 30, 20, 80, 40, 60};

        boolean swapped = false;
        do {
            swapped = false;
            for (int i = 0; i < n.length - 1; i++) {
                if (n[i] > n[i + 1]) {
                    int temp = n[i];
                    n[i] = n[i + 1];
                    n[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        
        for(int i = 0; i < n.length; i ++) {
            System.out.print(n[i] + ", ");
        }
        System.out.println();

    }
}
