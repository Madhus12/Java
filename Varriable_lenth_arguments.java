package revision;

class math
{
	int sum =0;
	public int add(int ...i)
	{	
		for(int j:i)
		{
			sum = sum +j;
		}
		return sum;
	
	}
	
}

public class Varriable_lenth_arguments
{

	public static void main(String[] args)
	{
		math obj1 = new math();
		System.out.println(obj1.add(2,34,5,6,7,7,8,8));

	}

}
