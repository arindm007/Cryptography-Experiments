// To find the prime number in between the given range

import java.util.Scanner;

/**
 * Exp1
 */
public class Exp1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Starting Number: ");
        int start = sc.nextInt();

        System.out.println("Enter the Ending Number: ");
        int end = sc.nextInt();
        
        System.out.println("Prime number between "+start+" and "+end+" is :");
        

        for (int i = start; i <= end; i++) {
            if (i==1 || i==0) {
                continue;    
            }

        int temp = 1;
         
        for (int j = 2; j <= i/2; j++) {
            if (i%j == 0) {
                temp =0;
                break;
            }
        }
        
        if (temp == 1){
            System.out.println(i);
        }
        }
        
    }
}