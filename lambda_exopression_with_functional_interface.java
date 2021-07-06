package revision;


//types of interface
//Normal interface which has mere than one method
//Functional interface or only one method
//marker interface which has no method
interface mad
{
	void show();
}

public class lambda_exopression_with_functional_interface 
{

	public static void main(String[] args) 
	{
		mad obj = () ->
		{
			System.out.println("Lambda with functional interface");
		};
		
		obj.show();

	}

}
