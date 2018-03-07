package SquareSpiral;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class RunnerClass {
	public static void main(String[] args) {

		int input = 5;
		int start = 1;
		int[][] spiral = new int[input][input];

		// for (int i = 0; i < input; i++) {
		// for (int j = 0; j < input; j++) {
		// spiral[i][j] = start++;
		// }
		// }

		for (int j = 0; j < input; j++) {
			spiral[0][j] = start++;
		}
		for (int i = 1; i < input; i++) {
			spiral[i][input - 1] = start++;

		}
		for (int d = input - 2; d >= 0; d--) {
			spiral[input - 1][d] = start++;

		}
		for (int c = input - 2; c >= 1; c--) {
			spiral[c][0] = start++;
		}
		for (int a = 1; a <= input - 2; a++) {
			spiral[1][a] = start++;
		}
		for (int b = 2; b <= input - 2; b++) {
			spiral[b][input - 2] = start++;
		}
		for (int e = input - 3; e >= 1; e--) {
			spiral[input - 2][e] = start++;
		}
		for (int f = 2; f >= input - 3; f--) {
			spiral[f][1] = start++;
		}
		for (int g = 2; g <= input - 3; g++) {
			spiral[input - 3][g] = start++;
		}

		for (int j = 0; j < input; j++) {
			System.out.println();
			for (int i = 0; i < input; i++) {
				System.out.print(spiral[j][i] + "	");
			}
		}
	}
}
