package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter year");
		int x = in.nextInt();
		boolean isTrue = (x%4 == 0);
		boolean isTrue2 = (x%100 != 0);
		boolean answer = isTrue && isTrue2;
		boolean isTrue3 = (x%400==0);
		boolean answer2 = answer || isTrue3;
		System.out.println(x + "is a leap year: " + answer2);
	}

}
