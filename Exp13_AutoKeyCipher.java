// Auto-Key Cipher

import java.util.Scanner;

public class Exp13_AutoKeyCipher {
  
	public static void main(String args[]){ 
	Scanner sc = new Scanner(System.in);
	System.out.println("Input text to encrypy= ");
	String text = sc.nextLine();
	System.out.println("Input the key = ");
	int s = sc.nextInt();
	int len = text.length();
	System.out.println("Length of input string = "+len);
	int tempkey[] = new int [len];
	String emessage="";
	tempkey[0]=s;
	for(int i=1;i<=len-1;i++){
		tempkey[i]=(int)text.charAt(i-1)-97;
	}
	System.out.print("\nplain text is = ");
	for(int i =0; i<len;i++){
		System.out.print(text.charAt(i)-97+" ");
	}
	System.out.print("\ntemprary key is = ");
	for(int i =0; i<len;i++){
		System.out.print(tempkey[i]+" ");
	}
	System.out.println(" ");
	for(int i=0;i<len;i++){
		char ch = (char)((((int)text.charAt(i)-97)+tempkey[i])%26+97);
		emessage=emessage+ch;
	}
	System.out.println("\nencrypt text is = "+emessage);
	String dmessage="";
	for(int i=0;i<len;i++){
		char ch = (char)((((int)emessage.charAt(i)-97)-tempkey[i]+26)%26+97);
		dmessage=dmessage+ch;
	}
	System.out.println("\nDecrypt text is = "+dmessage);
	}
}