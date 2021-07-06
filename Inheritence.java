package revision;

class calc
{
	int sum;
	int add(int a,int b) 
	{
		sum = a+b;
		return sum;
	}
	
}

class advcalc extends calc
{
	int sub;
	int subt(int a,int b)
	{
		sub = a-b;
		return sub;
	}
	
}

class ultadvcalc extends advcalc
{
	int mul;
	int multi(int a,int b)
	{
		mul = a*b;
		return mul;
	}
	
}


public class Inheritence
{

	public static void main(String[] args) 
	{
		ultadvcalc obj1 = new ultadvcalc();
		System.out.println(obj1.add(2,4));
		System.out.println(obj1.subt(6,2));
		System.out.println(obj1.multi(4,6));

	}

}
