package br.com.unicuritiba;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Favor digitar o primeiro número");
		int number1 = scanner.nextInt();
		
		System.out.println("Favor digitar o segundo número");
		int number2 = scanner.nextInt();
		
		System.out.println("Favor digitar:\n"
				+ "1 - soma\n"
				+ "2 - subtracao\n"
				+ "3 - multiplicacao\n"
				+ "4 - divisao ");
		int operation = scanner.nextInt();
		
		
		int result = 0;
		switch (operation) {
		case 1: {
			sumNumbers(number1, number2);
			break;
		}
		
		case 2: {
			subNumbers(number1, number2);
			break;
		}
		
		case 3 : {
			result = number1 * number2;
			break;
		}
		
		case 4: {
			result = number1 / number2;
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + operation);
		}
		
	}

	private static void sumNumbers(int number1, int number2) {
		
		int result = 0;
		
		int[] numbers = checkIfFirstIsGreater(number1, number2);
		number1 = numbers[0];
		number2 = numbers[1];
			
		result = number1 + number2;			
		
		if(numberIsGreater99(result) || 
				numberIsNegative(result)) {
			// TODO ERROR
			return;
		}
		
		// TODO Success	
	}
	
	private static void subNumbers(int number1, int number2) {
		
		int[] numbers = checkIfFirstIsGreater(number1, number2);
		number1 = numbers[0];
		number2 = numbers[1];
			
		int result = number1 - number2;		
		
		// TODO Success
	}
	
	private static boolean numberIsNegative(int number) {
		return number < 0;
	}
	
	private static boolean numberIsGreater99(int number) {
		return number > 99; 
	}
	
	private static int[] checkIfFirstIsGreater(int number1, int number2) {
		
		int[] vector = new int[2];
		
		if(number2 > number1) {
			vector[0] = number2;
			vector[1] = number1;
		}else {
			vector[0] = number1;
			vector[1] = number2;
		}
		
		return vector;
	}
}
