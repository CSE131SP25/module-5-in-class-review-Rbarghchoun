package review5;

public class E03AddArrays {

	//Write a method that will take in two arrays of ints
	//and add them together. Note that the arrays may not
	//be the same size! For example:
	
	//[3, 4, 5, 1]
	//	+
	//[1, 6]
	//	=
	//[4, 10, 5, 1] 

	public static void main(String[] args){
		int[] first = {3, 4, 5, 1};
		int[]second = {1, 6};
		int[] result = addArrays(first, second);

		for(int i = 0; i < result.length; i++){
			System.out.println(result[i]);
		}
	}

	public static int[] addArrays(int[] first, int[] second){
		int max = first.length;

		if(second.length > first.length){
			max = second.length;
		}

		int[] result = new int[max];
		for(int i = 0; i < max; i++){
			if(i < first.length){
				result[i] += first[i];
			}

			if(i < second.length){
				result[i] += second[i];
			}
		}

		return result;
	}
}
