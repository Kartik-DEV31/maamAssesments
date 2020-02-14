
import java.util.HashMap;

import java.util.Scanner;



public class test2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		Scanner str = new Scanner(System.in);
		Scanner num = new Scanner(System.in);
		HashMap<String,String > data = new HashMap<String,String>();
		
		String string = new String();
		
		String number ;
		System.out.print("Enter the number of entries : ");
		int n  = num.nextInt();

		int count =1;
		for(int i =0;i<n;i++)
		{
			
			System.out.print("Enter the Name: ");
			string = str.nextLine();
			System.out.print("Enter the Number: ");
			number = str.nextLine();
			
		
			if (number.length()==10) 
			{
			data.put( string,number);
			}
			
			else {System.out.println("Enter 10 digit number");count=0;break;}
			
		}
		
		
		if (count ==1)
		{
			int k = 0;
			while(k==0) {
			System.out.println("Enter the name to search : ");
		String nameSearch = str.nextLine();
		
		if(data.containsKey(nameSearch))
		{
		System.out.println("Required Data =  "+data.get(nameSearch));
		}
		else System.out.println("Entry not Exist");
		System.out.println("to exit enter any digit other than 0 : " );	
		 k = num.nextInt();
		}
		
		}
		

	}

}
