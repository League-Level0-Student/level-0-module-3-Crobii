package _03_remainder._1_intro_to_remainder;

public class IntroToRemainder {
	public static void main(String[] args) {
		for(int i = 1; i <= 20; i++) {
			if(i % 3 == 0) {
				System.out.println("fizz");
			}
			else if (i % 5 == 0) {
				System.out.println("buzz");
			}
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("fizzbuzz");
			}
			else {
				System.out.println(i);
			}
		}
		
	}
}
