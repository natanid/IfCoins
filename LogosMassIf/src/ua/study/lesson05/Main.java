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
		int count = 0;
		if (number > _50) {
			count = number / _50;
			System.out.println("50 coins - " + count);
			number = number % _50; // 127%50 = 27
		}
		if (number > _25) {
			count = number / _25;
			System.out.println("25 coins - " + count);
			number = number % _25; // 27%25 = 2
		}
		if (number > _10) {
			count = number / _10;
			System.out.println("10 coins - " + number);
			number = number % _10;
		}
		if (number > _5) {
			count = number / _5;
			System.out.println("5 coins - " + number);
			number = number % _5;
		}
		if (number > _2) {
			count = number / _2;
			System.out.println("2 coins - " + number);
			number = number % _2;
		}
		if (number > _1) {
			count = number / _1;
			System.out.println("1 coins - " + number);
			number = number % _1;
		}
		// System.out.println("fff \n \r \\ \' \" \t \b \f fff");
	}
}