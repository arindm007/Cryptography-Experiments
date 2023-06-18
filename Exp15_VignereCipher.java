//vigenere cipher
import java.util.Scanner;
public class Exp15_VignereCipher{
	public static String encrypt(String text, String key){
		String res="";
		for(int i =0,j=0; i<text.length();i++){
			char c= text.charAt(i);
			if(c<'a' || c> 'z')
				  continue;
			res=res+(char)((((int)c-97 )+((int)key.charAt(j)-97))%26+97);
             j=++j%key.length();			
		}
		return res;
	}
	public static String decrypt(String text, String key){
		String res="";
		for(int i =0,j=0; i<text.length();i++){
			char c= text.charAt(i);
			if(c<'a' || c> 'z')
				  continue;
			res=res+(char)((((int)c-97 )+((int)key.charAt(j)-97)+26)%26+97);
             j=++j%key.length();			
		}
		return res;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string to encrypt = ");
		String message = sc.nextLine();
		System.out.println("enter key = ");
		String key = sc.nextLine();
		String encryptedMsg=encrypt(message,key);
		System.out.println("encrypt message  = "+encryptedMsg);
		System.out.println("decrypt message = "+decrypt(encryptedMsg,key));
	}
}