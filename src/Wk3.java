
public class Wk3 {

	public static void main(String[] args) {
		// 1. Create an array of int called ages that contains the following values: 3,
		// 9, 23, 64, 2, 8, 28, 93.
//		a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
//		b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
//		c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.

		int[] ages = new int[9];

		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;

		System.out.println(ages[ages.length - 1] - ages[0]);

		ages[8] = 27;
		System.out.println(ages[ages.length - 1] - ages[0]);
//		2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//		a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//		b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.

//		double total = 0;
//		for (int i = 0; i < ages.length; i++) {
//			total = total + ages[i];
//			double average = total / ages.length;
//			System.out.println(average);
//		}

		String[] names = new String[] { "Sam", "Sally", "Tim", "Buck", "Tommy", "Bob" };

		
		double sumOfLetters = 0;

		for (String name : names) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters / names.length);

		String concatNames = "";
		for (String name : names) {
			concatNames += name + " ";
		}

///	3.	How do you access the last element of any array?
		System.out.println(names[names.length - 1]);
////	4.	How do you access the first element of any array?
		System.out.println(names[0]);
//		
////  5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.		
		int[] nameLengths = new int[names.length];
		
		for (int i =0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		
		
			 
////	6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.		
		int sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
		}

		int n = 3;
		System.out.println();

		int[] showTime = new int[5];

		showTime[0] = 25;
		showTime[1] = 25;
		showTime[2] = 25;
		showTime[3] = 25;
		showTime[4] = 25;

		double[] digitArray = { 5.8, 6.9, 2.5, 8.6 };
		System.out.println(calculateAverage(digitArray));

		String[] cupMeasurements = new String[5];

		cupMeasurements[0] = "1 Cup";
		cupMeasurements[1] = "2 Cups";
		cupMeasurements[2] = "3 Cups";
		cupMeasurements[3] = "4 Cups";
		cupMeasurements[4] = "5 Cups";
	}

// 7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).			

	public static String createGreeting(String word, int n) {
		String createGreeting = "";
		for (int i = 0; i < n; i++) {
			createGreeting += word;
		}
		return createGreeting;
	}

//  8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	public static String createFullName(String x, String y) {
		String fullName = x + " " + y;
		return fullName;

	}

//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static double showTime(int[] showTime) {
		int sum = 0;
		return sum / showTime.length;
	}
		
			
	

//10.	Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double num : numbers) {
			sum += num;
		}
		return sum / numbers.length;
	}

//11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	public static double calculateAverages(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}

//12.	Write a method called willBuyDrink that takes a  boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

	public static String willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		String willBuyDrink = "";
		if (isHotOutside &&  moneyInPocket > 10.50) {
			
		}
		return "true";
	}
	
	//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

	public static String createMeasuring(String[] cupMeasurements) {
		double recipes = 0;
		for (double recipe : recipes) {
			recipes += recipe;

		}

	}
}
