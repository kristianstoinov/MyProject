public class Ex13 {

	public static int[] combineArrays(int[] array1, int[] array2) {

		int[] newArray = new int[array1.length + array2.length];

		for (int i = 0; i < array1.length; i++) {
			newArray[i] = array1[i];
		}
		for (int i = array1.length, k = 0; k< array2.length; i++, k++) {
			newArray[i] = array2[k];
		}

		return newArray;
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 3, 2, 5, 1, 5 };
		int[] array2 = { 7, 6, 89, 4, 5, 2 };
		int[] newArray = new int[array1.length + array2.length];
		newArray = combineArrays(array1, array2);
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");

		}

	}

}
