public class Array
{
public static void main(String [] args)
{

//Creating integer array with a maximum size of 7
//Arrays are not dynamic(size)
	int[] intArray = new int[7];

	intArray[0] = 20;
	intArray[1] = 35;
	intArray[2] = -15;
	intArray[3] = 7;
	intArray[4] = 55;
	intArray[5] = 1;
	intArray[6] = 79;

	//Traversing the array with a for loop
	for(int i = 0; i < intArray.length; i++)
	{
		System.out.println(intArray[i]);

	}
}
}