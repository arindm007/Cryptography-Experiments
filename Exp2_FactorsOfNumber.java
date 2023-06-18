// find the factor of given number

import java.util.Scanner;

public class Exp2_FactorsOfNumber {
 public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number for which factor need to be calculated : ");
    int input = sc.nextInt();

    System.out.println("Factors of the given number are: ");
    for (int i = 1; i <= input; i++) {
        if (input%i == 0) {
            System.out.println(i);
        }
        
    }
 }   
}
