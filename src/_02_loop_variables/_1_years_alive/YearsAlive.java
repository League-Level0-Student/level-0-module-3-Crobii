package _02_loop_variables._1_years_alive;

import java.util.Scanner;


public class YearsAlive {
	public static void main(String[] args) {
	int birth;
	int year;
	int yearsAlive;
		Scanner scnr = new Scanner(System.in);
	System.out.println("What year were you born?");
	birth = scnr.nextInt();
	System.out.println("What year is it");
	year = scnr.nextInt();
	for(int i = birth; i <= year; i++) {
		System.out.println(i);
	
	}
	}

}
