// Affine Cipher

import java.util.Scanner;

/**
 * Exp12
 */
public class Exp12 {

    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter plain text to encrypt");
		String text = sc.nextLine();
		System.out.println("Enter key k1 @ k2 = ");
		int sk1 = sc.nextInt();
		int sk2 = sc.nextInt();
		System.out.println("Enter the modulo to find inverse =  ");
		int mod = sc.nextInt();
		int inv = findInverse(mod,sk1);
		System.out.println("inverse of the key is = "+ inv);
		for(;;){
			System.out.println("1.encrypt\n2.decrypt\n3.exit");
			int choice = sc.nextInt();
			switch(choice){
				case 1: System.out.println("Encrypted message is = "+ encrypt(text,sk1,sk2));
				break;
				case 2 : System.out.println("decrypted message is = "+ decrypt(encrypt(text,sk1,sk2),inv,sk2));
				break;
				case 3 : System.exit(0);break;
				default : System.out.println("Invalid choice");
			}
		}
	}
	public static int findInverse(int n, int b){
		int r1=n,r2=b,t1=0,t2=1,r,q,t;
		while(r2>0){
			q=r1/r2;
			r=r1-q*r2;
			r1=r2;
			r2=r;
			t=t1-q*t2;
			t1=t2;
			t2=t;
		}
		if(r1!=1){
			System.out.println("Inverse is not available");
			System.exit(0);
		}
		if(t1<0){
			t1=n+t1;
			
		}
		return t1;
	}
	public static String encrypt(String text, int s, int t){
		String result = "";
		for(int i=0;i<text.length();i++){
			if(Character.isUpperCase(text.charAt(i))){
				char ch =(char)((((int)text.charAt(i)-65)*s+t)%26+65);
				result=result+ch;
			}else{
				char ch =(char)((((int)text.charAt(i)-97)*s+t)%26+97);
				result=result+ch;
			}
			
		}
		return result;
	}
	public static String decrypt(String text,int inv,int sk2){
			String result = "";
			sk2=26-sk2;
		for(int i=0;i<text.length();i++){
			if(Character.isUpperCase(text.charAt(i))){
				char ch =(char)((((int)text.charAt(i)-65+sk2)*inv)%26+65);
				result=result+ch;
			}else{
				char ch =(char)((((int)text.charAt(i)-97+sk2)*inv)%26+97);
				result=result+ch;
			}
	   }
	   return result;
	}
}
