import java.util.Arrays;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner str = new Scanner (System.in);
		
		System.out.print("Enter the string :");
		String string = str.nextLine();
		String name = new String();
		
		String string1[] = string.split(" ");
		String string2[]  = new String[string1.length];
		System.out.println(string1.length);
		
			string2[string2.length-1]= string1[string1.length-1];
		
			System.out.println(string2[string2.length-1]);
			
		for(int i =0;i<=string1.length-2;i++ )	
			string2[i] = string1[i].substring(0,1);
		
	
		for(int i =string2.length-2 ;i>=0;i--)
		{
			
			name += string2[i]+".";
			
		}
		
		System.out.println(string2[string2.length-1]+" "+name);
		
	
	
			
		
	}

}
