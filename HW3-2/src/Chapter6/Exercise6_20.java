package Chapter6;

import java.util.Random;

public class Exercise6_20 {

	static int[] shuffle(int[] arr){
		
		Random random = new Random();
		for(int i = 0; i < arr.length; i++){
			int rand = random.nextInt(arr.length);
			int temp =  arr[rand];
			arr[rand] = arr[i];
			arr[i] = temp;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result =  shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
