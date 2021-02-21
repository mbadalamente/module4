package module4;

import java.util.*;

public class test {
	public static void main(String[] args) {
		System.out.println("Welcome to maddie's quiz!");
		Scanner scan = new java.util.Scanner(System.in);
		System.out.println("This program will ask you a series of questions about maddie.");
		String[] questions = {"What is maddie's least favorite color?", "What is maddie's favorite number?", "What is maddie's favorite fruit?", "What is maddie's middle name?"};
		String[] answerStrings = {"red", "doesn't have one", "apple", "lee"};
		int correctCount = 0;
		for(int i = 0; i < questions.length; i ++) {
			System.out.println(questions[i]);
			String input = scan.next();
			if(input.equals(answerStrings[i])) {
				System.out.println("correct");
				correctCount ++;
			}
			else {
				System.out.println("incorrect");
			}
		}
		System.out.println("You finished the quiz with a score of "+ correctCount + "/"+questions.length+"!");
		System.out.println("Did you enjoy the quiz?");
		String rating = scan.next();
		System.out.println("Thank you for your feedback!");
	}
}
