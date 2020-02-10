
package exercise_03;

import static java.lang.Double.sum;
import static java.lang.Integer.sum;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Exercise_03 {

    public static void main(String[] args) {
        int n;
        int [] array = new int [10];
        int sum = 0;
        int avg;
    Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Array: ");
        n = s.nextInt();
        System.out.print("Masukkan tiap angka: \n");
        for (int i=0; i<10; i++){
            array[i]= s.nextInt();
            sum = sum + array[i];
        }
        avg= sum/n;
        System.out.print("avg = "+avg);
    }
}
    
