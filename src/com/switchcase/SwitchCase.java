package com.switchcase;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter The Number Between The '1' and '5'");
		int number = scanner.nextInt();

		switch (number) {
		case 1:
			System.out.println("Blue");
			break;
		case 2:
			System.out.println("White");
			break;
		case 3:
			System.out.println("Green");
			break;
		case 4:
			System.out.println("Red");
			break;
		case 5:
			System.out.println("Gray");
			break;
		default:
			System.out.println("Enter Valid Number");
			break;
		}



	}
}
