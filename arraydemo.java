package revision;
import java.util.*;

public class arraydemo
{

	public static void main(String[] args) 
	{
		int arr[] = new int[4];
		
		Scanner myobj = new Scanner(System.in);
		System.out.println("The array elements are");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=myobj.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
		
			}
		}
		System.out.println("After sorting");
		
		for(int i:arr)
		{
			System.out.println("The array elements are"+arr[i]);
		}
	}

}
