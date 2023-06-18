// String Encrypt Decrypt Using XOR with a key

import java.util.Scanner;

public class Exp8_StringXOR {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StringBuffer sb=new StringBuffer();
        
        int i=0;
        System.out.println("Enter plaintext string");
        String st=sc.next();

        StringBuffer arr=new StringBuffer();
        for(byte b:st.getBytes())
            arr.append(Integer.toBinaryString(b));
        System.out.println("Binary of plaintext is:"+arr);

        System.out.println("Enter key string:");
        String st1=sc.next();

        StringBuffer arr1=new StringBuffer();
        for(byte c:st1.getBytes()){
           arr1.append(Integer.toBinaryString(c));
        } 
        System.out.println("Binary of key is:"+arr1);

        for(i=0;i<arr.length();i++){
           sb.append(arr.charAt(i)^arr1.charAt(i));
           
        }
        System.out.println("binary of encrypted text is:" +sb);

        String s="";
        for(int index=0;index<sb.length();index+=7){
            String temp=sb.substring(index,index+7);
            int num=Integer.parseInt(temp,2);
            System.out.println("Num="+num);
            char letter=(char)num;
            s=s+letter;
        }
        System.out.println("Encrypted text is:"+s);

        StringBuffer sb1=new StringBuffer();

        for(i=0;i<sb.length();i++)
           sb1.append(sb.charAt(i)^arr1.charAt(i));

        s="";
        for(int index=0;index<sb1.length();index+=7)
        {
            String temp=sb1.substring(index,index+7);
            int num=Integer.parseInt(temp,2);
            System.out.println("Num="+num);
            char letter=(char)num;
            s=s+letter;

        }   
        System.out.println("Decrypted text is:"+s);

}
}
