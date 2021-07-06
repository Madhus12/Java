package revision;


class encapsulate
{
	private int a;
	private int b;
	
	public void setdata(int a1,int a2)
	{
		a=a1;
		b=a2;
	}
	
	public int getdata()
	{
		return a;
		
	}
	public int getdata1()
	{
		return b;
	}
}


public class Encapsulation 
{

	public static void main(String[] args) 
	{
		encapsulate obj1 = new encapsulate();
		obj1.setdata(10, 5);
		System.out.println(obj1.getdata());
		System.out.println(obj1.getdata1());
		
	}

}
