public class Recursion
{
	public static void main(String [] args)
	{
		System.out.println(iterativeFactorial(3));
		System.out.println(recursiveFactorial(4));

	}
	// 1! = 0! * 1 = 1
	// 2! = 2 * 1 = 2 * 1!
	// 3! = 3 * 2 * 1 = 3 * 2!

	public static int recursiveFactorial(int num)
	{
		//Base Case which breaks the condition
		if(num == 0)
		{
			return 1;
		}
		return num * recursiveFactorial(num - 1);
	}

	//static because it is being called from the main method/driver class
	public static int iterativeFactorial(int num)
	{

		if(num == 0)
		{
			return 1;
		}

		int factorial = 1;
		for(int i =1 ; i <= num; i++)
		{
			factorial *= i;
		}
		return factorial;
	}
}