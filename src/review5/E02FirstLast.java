package review5;

public class E02FirstLast {

	//Write a method that takes in an array of ints and
	//returns the sum of the first and last values of 
	//the array. Call your method to ensure that it works!
	
	public static void main(String[] args) {
		int[] testArray = {1, 2, 3, 4};
		int result = sumFirstLast(testArray);
		System.out.println(result);
	}

	public static int sumFirstLast(int[] array){
		int first = array[0];
		int last = array[array.length - 1];
		int sum = first + last;

		return sum;
	}

}
