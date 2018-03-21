package FirstRecurring;

public class runnerClass {
	public static void main(String[] args) {

		String input = "ACDEBC";
		int i = 0;
		
		while (i < input.length() && input.indexOf(input.charAt(i)) == i)
			i++;
		System.out.println((i == input.length())? "There are no recurring characters"
				: ("Found recurring character " + input.charAt(i) + " at position "
						+ (input.indexOf(input.charAt(i)) + 1)));
	}
}
