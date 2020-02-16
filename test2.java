import java.util.HashMap;

import java.util.Scanner;



public class collection6 {

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
			System.out.println("How many names you want to search :-  ");
			int nameN = num.nextInt();
			String nameSearch =new String();
		
			String search_Results[] = new String[nameN];
			for(int i =0;i<nameN;i++) {
			System.out.println("Enter the name to search : ");
		 nameSearch = str.nextLine();
		search_Results[i] = nameSearch;
		
		
		
			}
			
			for(int i =0;i<nameN;i++) {
			if(data.containsKey(search_Results[i]))
			{
			System.out.println("Required Data =  "+data.get(search_Results[i]));
			}
			else System.out.println("Entry not Exist");
		
		}
		
		}
		

	}
}
