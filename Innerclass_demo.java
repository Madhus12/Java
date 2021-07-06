package revision;

class outer
{
	int a = 10;
	public void display()
	{
		System.out.println("inside display "+a);
	}
	
	class inner
	{
		int b = 20;
		public void display()
		{
			System.out.println("inside display "+b);
		}
	}
}

public class Innerclass_demo 
{
	public static void main(String args[])
	{
		outer obj = new outer();
		obj.display();
		
		outer.inner obj1 = obj.new inner();
		
		obj1.display();
	}

}
