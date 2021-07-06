package revision;


class a1
{
	public void display() {
		System.out.println("in a");
		
	}
}

class b1 extends a1
{
	
	
	public void display() 
	{

		System.out.println("in b");
		
	}
}

class c1 extends b1
{
	
	
	public void display() 
	{

		System.out.println("in c");
		
	}
}



public class overriding {

	public static void main(String[] args)
	{
		a1 obj1 = new b1();
		obj1.display();

		obj1 = new c1();
		obj1 .display();
		
	}

}
