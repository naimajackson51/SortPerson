import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		Person first = null;
		Person last = null;
		
		System.out.println("Enter first names of ten people");
		for(int i = 1; i <= 10; i++)
		{
			String name = in.nextLine();
			System.out.println();
			Person p = new Person(name);
			
			if(first == null)
				{
				first = last = p;//sets the value of person to first Person and 
				}
			else
			{
				if(first.compareTo(p) > 0)
				{
					first = p;
			    }
				if(last.compareTo(p) < 0)
				{
					last = p;
				} //end of if else
			} //end of for loop
		    System.out.println("First " + first);
		    System.out.println("Last " + last);
		    }
		in.close();

	}// end of main

} //end of class
