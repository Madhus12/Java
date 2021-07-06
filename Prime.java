package revision;
import java.util.*;

public class Prime {

	public static void main(String[] args)
	{
		int a,flag=0;
		System.out.println("ente the number to check prime");
		Scanner obj1 = new Scanner(System.in);
		a=obj1.nextInt();
		
		System.out.println(a);
		
		for(int i=2;i<a;i++)
		{
			if(i%a==0)
			{
				flag = 1;
			}
			
		}
		
		if(flag == 1)
		{
			System.out.println("Non prime");
		}
		else
		{
			System.out.println("Prime");
		}
	
		

	}

}
