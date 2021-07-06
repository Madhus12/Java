package revision;


class a
{
	a()
	{
		System.out.println("Default in a");
	}
	a(int a)
	{
		System.out.println("parameterized in a");
	}
}

class b extends a
{


	b()
	{
		super(10);
		System.out.println("Default in b");
	}
	b(int a)
	{
		super();
		System.out.println("Parametirized in b");
	}
}

public class Super_keyword 
{

	public static void main(String[] args) 
	{
		b obj1 = new b();

	}

}
