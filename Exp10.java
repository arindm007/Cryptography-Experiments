// Additive Cipher 

import java.util.Scanner;

public class Exp10 {

    public static String encrypt(String text,int s  ){
		String result="";
		for(int i=0;i<text.length();i++){
			if(Character.isUpperCase(text.charAt(i))){
				char ch=(char)(((int)text.charAt(i)+s-65)%26+65);
				result = result+ch;
				
			}else{
				char ch=(char)(((int)text.charAt(i)+s-97)%26+97);
				result=result+ch;
			}
		}
		return result;
	}
	public static String decrypt(String text,int s){
		String result="";
		s=(-s+26);
		for(int i=0;i<text.length();i++){
			if(Character.isUpperCase(text.charAt(i))){
				char ch=(char)(((int)text.charAt(i)+s-65)%26+65);
				result = result+ch;
			}else{
				char ch=(char)(((int)text.charAt(i)+s-97)%26+97);
				result=result+ch;
			}
		}
		return result;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input data to encrypt =  ");
		String text =sc.nextLine();
		System.out.println("enter the key =  " );
		int s = sc.nextInt();
		for(;;){
			System.out.println("1.encrypt\n2.decrypt\n3.exit");
			int choice = sc.nextInt();
			switch(choice){
				case 1: System.out.println("encrypted message = "+encrypt(text,s));
				break;
				case 2: System.out.println("decrypted message = "+decrypt(encrypt(text,s),s));
				break;
				case 3: System.exit(0);
				break;
				case 4: System.out.println("wrong option");
				
			}
		}
	}
}