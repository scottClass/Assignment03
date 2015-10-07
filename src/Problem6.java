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


        int thing = 90;
        int thing1 = 80;
        int thing2 = 70;
        int thing3 = 60;
        int thing4 = 50;
        int thing5 = 40;
        int thing6 = 30;
        int thing7 = 20;
        int thing8 = 10;
        int thing9 = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0 && a[i] < 10) {
                bucket[thing] = a[i];
                thing++;
            }
            
            
            if (a[i] >= 10 && a[i] < 20) {
                bucket[thing1] = a[i];
                thing1++;
            }
            if (a[i] >= 20 && a[i] < 30) {
                bucket[thing2] = a[i];
                thing2++;
            }
            if (a[i] >= 30 && a[i] < 40) {
                bucket[thing3] = a[i];
                thing3++;
            }
            if (a[i] >= 40 && a[i] < 50) {
                bucket[thing4] = a[i];
                thing4++;
            }
            if (a[i] >= 50 && a[i] < 60) {
                bucket[thing5] = a[i];
                thing5++;
            }
            if (a[i] >= 60 && a[i] < 70) {
                bucket[thing6] = a[i];
                thing6++;
            }
            if (a[i] >= 70 && a[i] < 80) {
                bucket[thing7] = a[i];
                thing7++;
            }
            if (a[i] >= 80 && a[i] < 90) {
                bucket[thing8] = a[i];
                thing8++;
            }
            if (a[i] >= 90 && a[i] <= 100) {
                bucket[thing9] = a[i];
                thing9++;
            }
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

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }


    }
}
