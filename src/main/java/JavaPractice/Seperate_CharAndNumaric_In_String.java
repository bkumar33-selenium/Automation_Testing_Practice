package JavaPractice;

import java.util.Scanner;

public class Seperate_CharAndNumaric_In_String {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Any String");
		String input=s.next();
		String str1="";
		String str2="";
		String str3="";
		
		for(int i=input.length();i>0;i--)
		{
			char c=input.charAt(i-1);
			if(c>='a' && c<='z')
			{
				str1=c+str1;
			}
			else if(c>='0' && c<='9')
			{
				str2=c+str2;
			}
			else
			{
				str3=c+str3;
			}
		}
		System.out.println("Chars: "+str1);
		System.out.println("Numbers: "+str2);
		System.out.println("Symbols: "+str3);
		

	}

}
