public class SelectionSort
{
	public static void main(String[] args)
	{
		int[] intArray = {4,-5,66,32,41};

		for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--)
		{
			//Largest index
			int largest = 0;

			//Traverse the unsorted partition for largest element
			for(int i = 1; i <= lastUnsortedIndex; i++)
			{
				if(intArray[i] > intArray[largest])
				{
					largest = i;
				}
			}
			swap(intArray, largest, lastUnsortedIndex);

		}

		//Traversing the array
		for(int i = 0; i < intArray.length; i++)
		{
			System.out.println(intArray[i]);
		}

	}
	//All methods in the main driver must be static methods
	public static void swap(int [] array, int i, int j)
	{
		if (i == j)
		{
			return;
		}

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}