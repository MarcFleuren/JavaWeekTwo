package code;

import java.sql.Array;
import java.util.Collections;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class OfflineExercises {
	public static void main(String[] args) {

		System.out.println(getSandwich("breadjambread"));
	}
	// Given a string, return a string where
	// for every char in the original,
	// there are two chars.

	// doubleChar("The") → "TThhee"
	// doubleChar("AAbb") → "AAAAbbbb"
	// doubleChar("Hi-There") → "HHii--TThheerree"

	public String doubleChar(String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {

			char ch1 = input.charAt(i);
			char ch2 = input.charAt(i);
			output = output + "" + ch1 + "" + ch2;

		}
		return output;
	}
	//
	// A sandwich is two pieces of bread with something in between. Return the
	// string that is between the first and last appearance of "bread" in the
	// given string, or return the empty string "" if there are not two pieces
	// of bread.

	// getSandwich("breadjambread") → "jam"
	// getSandwich("xxbreadjambreadyy") → "jam"
	// getSandwich("xxbreadyy") → ""

	public static String getSandwich(String input) {

		String[] output = input.split("bread");
		if(output.length == 2 && output[0].equals("")) {
			return output[1];
		}
		if(output.length>2) {
			return output[1];
			
		} 
		return "";
	}
	

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false

	public boolean evenlySpaced(int a, int b, int c) {

		if (Math.abs(a - b) == Math.abs(b - c) || Math.abs(b - a) == Math.abs(c - a)
				|| Math.abs(a - c) == Math.abs(c - b)) {
			return true;
		}
		return false;
	}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {
		String output = "";
		for (int i = 0; i < a; i++) {
			output = output + "" + input.charAt(i);
		}
		for (int j = input.length() - a; j < input.length(); j++) {
			output = output + "" + input.charAt(j);
		}

		return output;
	}

	// Given a string, return true if it ends in "ly".

	// endsLy("oddly") → true
	// endsLy("y") → false
	// endsLy("oddy") → false

	public boolean endsly(String input) {
		if (input.length() < 2) {
			return false;
		} else {
			String endsly = "";
			for (int i = input.length() - 2; i < input.length(); i++) {
				char ch1 = input.charAt(i);
				endsly = endsly + "" + ch1;
			}
			System.out.println(endsly);
			if (endsly.equals("ly")) {
				System.out.println(input);
				return true;
			} else {
				return false;
			}
		}
	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "yyzzza"
	// yields "yza".

	// stringClean("yyzzza") → "yza"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Hello") → "Helo"
	public String stringClean(String input) {
		String output = "";
		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == (input.charAt(i + 1))) {
				output = output + "";
			} else {
				output = output + input.charAt(i);
			}
		}
		output = output + "" + input.charAt(input.length() - 1);

		return output;
	}

	// The fibonacci sequence is a famous bit of mathematics, and it happens to
	// have a recursive definition. The first two values in the sequence are 0
	// and 1 (essentially 2 base cases). Each subsequent value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the nth
	// fibonacci number, with n=0 representing the start of the sequence.

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 1

	public int fibonacci(int input) {
//		int a =fibonacci(input -1);
//		int b =fibonacci(input -2);
//		return a+b;
		
		int counter = 1;
		int counter2 =1;
		for(int i=1;i<input;i++) {
		counter = counter2 + counter;
		counter2= counter;
		
		}
		return counter2;
	}

	// We have a number of bunnies and each bunny has two big floppy ears. We
	// want to compute the total number of ears across all the bunnies
	// recursively (without loops or multiplication).
	//
	// bunnyEars(0) → 0
	// bunnyEars(1) → 2
	// bunnyEars(2) → 4

	public int bunnyEars(int input) {

		return input + input;
	}

}
