package morseCode;

public class RunnerClass {
	public static void main(String[] args) {
		String s = "twelve";
		System.out.println(s.substring(2,3));
		
		String b = s.substring(2,3) + s.substring(3,4);
		b = b +s.substring(4,5);
		System.out.println(b);

	}
}
