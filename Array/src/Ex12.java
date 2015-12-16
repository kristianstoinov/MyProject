
public class Ex12 {

	public static void main(String[] args) {
		int[] array = {10,6,8,7,9,1,19};
		int temp=0;
		for (int index = 0; index <= array.length - 1; index++){
			System.out.print(array[index]+ " ");
		}
		
		temp=array[0];
		array[0]=array[1];
		array[1]=temp;
		
		array[2]=array[2]+array[3];
		array[3]=array[2]-array[3];
		array[2]=array[2]-array[3];
		
		array[4]=array[4]*array[5];
		array[5]=array[4]/array[5];
		array[4]=array[4]/array[5];
		
		
		System.out.println("\n\n");
		for (int index = 0; index <= array.length - 1; index++){
			System.out.print(array[index]+ " ");
		}

	}

}
