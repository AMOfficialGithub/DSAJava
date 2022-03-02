public class BubbleSort {
	public static void main(String[] args) {

		// Array
		int[] myArray = { 20, 35, 76, 44, 24, 54 };

		for (int lastUnsortedIndex = myArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

		}

	}

	// swap method involving elements to swap as i and j from the array

	public static void swap(int[] array, int i, int j) {

		if (i == j) {
			return;
		}

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}