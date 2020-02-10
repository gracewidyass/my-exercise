
package exercise_02;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Exercise_02 {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        int [] array = new int [10];
        int sum = 0;
        System.out.print("Masukkan Array: ");
        for (int i=0; i<10; i++){
            array[i]= s.nextInt();
        }
        for (int num : array){
            sum = sum + num;
        }
        System.out.print("Sum = "+sum);
    }
}
        