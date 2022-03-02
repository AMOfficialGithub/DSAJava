public class CountingSort
{
	public static void main(String[] args)
	{
	int[] intArray = {2,5,9,8,2,8,7,10,4,3};

	countingSort(intArray, 1, 10);

for(int i = 0; i < intArray.length; i ++)
{
	System.out.println(intArray[i]);
}
}

public static void countingSort(int[] input, int min, int max)
{

//Array that will keep track of the counts
int[] countingArray = new int[(max - min) +1];

for( int i = 0; i < input.length; i ++)
{
	//Index to count each value
	countingArray[input[i] - min]++;
}

//Index to write to input array
 int j = 0;
 //traverse count array
 for (int i = min; i <= max; i ++)
 {
	 while (countingArray[i - min] > 0)
	 {
		 input[j++] = i;
		 countingArray[i- min]--;
	 }
 }

}
}

