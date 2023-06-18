// Multiplicative Cipher

//wap to multiplicative cipher
import java.util.Scanner;
class Exp11_MultiplicativeCipher{
	public static String encrypt(String text,int s  ){
		String result="";
		for(int i=0;i<text.length();i++){
			if(Character.isUpperCase(text.charAt(i))){
				char ch=(char)((((int)text.charAt(i)*s)-65)%26+65);
				result = result+ch;
				
			}else{
				char ch=(char)((((int)text.charAt(i)*s)-97)%26+97);
				result=result+ch;
			}
		}
		return result;
	}
	public static String decrypt(String text,int s){
		String result="";
	//	s=findInverse(n,s);
		for(int i=0;i<text.length();i++){
			if(Character.isUpperCase(text.charAt(i))){
				char ch=(char)((((int)text.charAt(i)*s)-65)%26+65);
				result = result+ch;
			}else{
				char ch=(char)((((int)text.charAt(i)*s)-97)%26+97);
				result=result+ch;
			}
		}
		return result;
	}
	public static int findInverse(int n, int b){
		int r1=n,r2=b,t1=0,t2=1,t=0,q,r;
		while(r2>0){
			q=r1/r2;
			r=r1-q*r2;
			r1=r2;
			r2=r;
			t=t1-q*t2;
			t1=t2;
			t2=t;
		}
		t=t1;
		if(t<0){
			t=n+t;
		}
		return t;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("multiplicative cipher");
		System.out.println("Input data to encrypt =  ");
		String text =sc.nextLine();
		System.out.println("enter the key =  " );
		int s = sc.nextInt();
		System.out.println("enter the modulus :");
		int mod = sc.nextInt();
		int invS=findInverse(mod,s);
		System.out.println("Inverse of a key is : "+invS);
		for(;;){
			System.out.println("1.encrypt\n2.decrypt\n3.exit");
			int choice = sc.nextInt();
			switch(choice){
				case 1: System.out.println("encrypted message = "+encrypt(text,s));
				break;
				case 2: System.out.println("decrypted message = "+decrypt(encrypt(text,s),invS));
				break;
				case 3: System.exit(0);
				break;
				case 4: System.out.println("wrong option");
				
			}
		}
	}
}