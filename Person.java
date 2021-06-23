

public class Person implements Comparable
{
	private String name;
	
	//Constructor of Person obj
	public Person(String aName)
	{
		name = aName;
	}
	/*
	 compares one obj to another
	 @param otherObject
	 @return int 
	 */
	public int compareTo(Object otherObject)
	{
		Person other = (Person) otherObject;
		
		if(name.compareTo(other.name) < 0)
			return -1; //less than
		if(name.compareTo(other.name) > 0)
			return 1; //greater than
		else
			return 0; //two values are equal
		
	}
	//@return string name
	public String getName()
	{
		return name;
	}
	//@return string name
	public String toString()
	{
		return "Person [name = " + name + "]";
	}
} //end of Person Class
