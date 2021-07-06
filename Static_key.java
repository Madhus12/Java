package revision;


class stat
{
	
	int id;
	String name;
	static String ceo;
	
	static
	{
		ceo = "Madhu";
	}
	
	stat()
	{
		id = 10;
		name = "sample";
	}
	
	void show()
	{
		System.out.println("id:   " +id);
		System.out.println("name: " +name);
		System.out.println("ceo:  " +ceo);
	}

}

public class Static_key {

	public static void main(String[] args) 
	{
		stat obj = new stat();
		//obj.id= 20;
		obj.name="sample1";
		
		stat obj1=new stat();
	
		obj.show();
		
		obj1.show();

	}

}
