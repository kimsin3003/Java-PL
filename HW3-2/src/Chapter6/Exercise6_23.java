package Chapter6;


public class Exercise6_23 {
	
	static int max(int[] data){
		
		int max = -999999;
		
		if(data == null)
			return max;
		
		for(int i = 0; i < data.length; i++){
			if(max < data[i])
				max = data[i];
		}
		
		return max;
		
	}

	public static void main(String[] args) {
		int[] data =  {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최댓값:"+max(data));
		System.out.println("최댓값:"+max(null));
		System.out.println("최댓값:"+max(new int[]{}));

	}

}
