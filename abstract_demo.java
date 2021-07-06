package revision;

abstract class phone
{
	public void call()
	{
		System.out.println("calling...");
	}
	
	public abstract void feature();

	
}

class iphone extends phone
{
	public void feature()
	{
		System.out.println("ios 1.3");
	}
	
}

class samsong extends phone
{
	public void feature()
	{
		System.out.println("android 1.2");
	}
	
}


public class abstract_demo
{

	public static void main(String[] args) 
	{
		iphone obj=new iphone();
		samsong obj1 = new samsong();
		obj1.feature();
		
	
	}
	static void show(phone obj)
	{
		obj.feature();
	}
}
