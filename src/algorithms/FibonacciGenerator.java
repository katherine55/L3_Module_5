package algorithms;

import javax.swing.JOptionPane;

public class FibonacciGenerator {

	public static void main(String[] args) {
		long a = 0;
		long b = 1;
		int length = Integer.parseInt(JOptionPane.showInputDialog("How many numbers of the Fibonacci Sequence Do you want to Know?"));
		System.out.println(a);
		System.out.println(b);
		for(int i = 0; i < length-2; i++) {
			long n = a + b;
			System.out.println(n);
			a = b;
			b = n;

		}
	}
}
