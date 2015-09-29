/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns6971
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initializing the array
        int[] array = new int[] {23, 27, 40, 34, 41, 51, 55, 57, 60, 67, 72, 78, 83, 96};
        
        String a = null;
        String b = null;
        String c = null;
        
        for(int i = 0; i < array.length; i ++) 
        {
            if(array[i] == 72) 
            {
                a = "A)" + array[i];
            }
            if(array[i] == 41) 
            {
                b = "B)" + array[i];
            }
            if(array[i] == 50) {
                c = "C)" + array[i];
            }
            
        }
        System.out.print("Found: ");
        if(a != null) {
            System.out.print(a + " ");
        } else if(a == null) {
            System.out.println("Did not find A)");
        }
        if(b != null) {
            System.out.print(b + " ");
        } else if(b == null) {
            System.out.println("Did not find B)");
        }
        if(c != null) {
            System.out.print(c);
        } else if(c == null) {
            System.out.println();
            System.out.println("Did not find C)");
        }
        System.out.println();
    }
}
