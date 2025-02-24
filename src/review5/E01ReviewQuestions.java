package review5;

public class E01ReviewQuestions {
	
	public static void main(String[] args) {
		
		//1. What are the parts of a method definition?
		
		//2. What is an argument / parameter?
		
		//3. What is a method call?
			//3a. How do you call a method?
		sayHello("Rayan");

		//4. What is scope?
			//4a. How do we determine the scope of a variable?
		
		//5. What does it mean to return something?
			//1. Stops the method, goes back to method call
			//2. Signify the output of a method
		int results = addInts(2, 7);
		System.out.println(results);
		//6. What is the main method used for?
		
	}

	public static void sayHello(String name){
		System.out.println("Hello, " + name + "!");
	}

	public static int addInts(int x, int y){
		int sum = x + y;
		return sum;
	}
}
