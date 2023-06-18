// Monoalphabetic cipher

import java.util.Scanner;

public class Exp14 {
    public static char p[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public static char ch[]={'N','0','A','T','R','B','E','C','F','U','X','D','Q','G','Y','L','K','H','V','J','M','I','P','Z','S','W'};
	
public static String doEncryption(String s)	{
   char c[] =  new char[(s.length())];
   for(int i=0 ; i<s.length(); i++){
	   for(int j=0; j<26;j++){
		   if(p[j]==s.charAt(i)){
			   c[i]=ch[j];
			   break;
		   }
	   }
   } 
  return (new String(c));   

	}
	public static String doDicryption(String s){
		char p1[] = new char[(s.length())];
	for(int i=0 ; i<s.length(); i++){
	   for(int j=0; j<26;j++){
		   if(ch[j]==s.charAt(i)){
			   p1[i]=p[j];
			   break;
		   }
	   }
   } 
return (new String (p1));   
	}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the message  = ");
String en=doEncryption(sc.next().toLowerCase());
System.out.println("encrypted  message "+en);
System.out.println("decrypt message  "+doDicryption(en));	
}	
}	
