package ua.study.lesson05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// int[] numbers = { -121, -44, -55, -44, -778, -11545, -774, 0, 55555
		// };
		// int maxInt = numbers[0];
		// for (int i = 0; i < numbers.length; i++) {
		// if (numbers[i] > maxInt) {
		// maxInt = numbers[i];
		// }
		// }
		// System.out.println(maxInt);

		// Scanner scanner = new Scanner(System.in);
		// System.out.println("enter word");
		// String text ="";
		// String text1 ="";
		// text = scanner.nextLine();
		// for (int i = text.length()-1; i >= 0; i--) {
		// text1 = text1 + text.charAt(i);
		// }
		// if(text.equals(text1)){
		// System.out.println("палиндром");
		// } else {
		// System.out.println("not a палиндром");
		// }

		int _1 = 1;
		int _2 = 2;
		int _5 = 5;
		int _10 = 10;
		int _25 = 25;
		int _50 = 50;
		int number = 127;
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		int count50 = 0;
		int count25 = 0;
		if (number > _50) {
			number1 = number % _50; // 127%50 = 27
			count50 = number / _50;
			System.out.println(number1);
			System.out.println("50 coins - " +count50);
			System.out.println("fff \n \r \\ \' \" \t \b \f fff");
		}
		if (number1 > _25) {
			number2 = number % _25; // 27%25 = 2
			count25 = number1 / _25;
			System.out.println(number2);
			System.out.println("25 coins - " +count25);
		}
		if (number2 > _10) {
			number3 = number % _25;
			System.out.println("\n" +number3);
			
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}