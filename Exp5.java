/*
 * Write a java program to take binary number as
 * input and a key and perform encryption decryption
 * using XOR operation 
 */

import java.util.Scanner;

public class Exp5 {

    public static String xor(String a,String b){
        int length = Math.min(a.length(), b.length());
        String result = "";
        for (int i = 0; i < length; i++) {
            result=result+(a.charAt(i)^b.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String b,b1;
    System.out.println("Enter the Binary Numnber: ");
    b=sc.next();
    System.out.println("Enter another binary number: ");
    b1=sc.next();

    String ret="";
    ret=xor(b, b1);
    System.out.println("Encrypted Text is : "+ ret);
    ret=xor(xor(b,b1),b1);
    System.out.println("Decrypted Text is : "+ ret);
    }
}
