public class InsertionSort
{
	public static void main(String [] args)
	{

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		//Assumes element at position 0 is sorted. Unsorted is at 1
		for(int firstUnsortedIndex = 1;  firstUnsortedIndex < intArray.length; firstUnsortedIndex++)
		{

			int newElement = intArray[firstUnsortedIndex];

			int i;
										//front of array
			for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--)
			{

				intArray[i] = intArray[i -1];
			}

			intArray[i] = newElement;

		}

		for(int i = 0; i < intArray.length; i++)
		{
			System.out.println(intArray[i]);
		}



	}



}