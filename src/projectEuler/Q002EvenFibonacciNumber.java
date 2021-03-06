package projectEuler;

public class Q002EvenFibonacciNumber {

	/**
	 * Each new term in the Fibonacci sequence is generated by adding the
	 * previous two terms. By starting with 1 and 2, the first 10 terms will be:
	 * 
	 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	 * 
	 * By considering the terms in the Fibonacci sequence whose values do not
	 * exceed four million, find the sum of the even-valued terms.
	 * 
	 * */
	
	public static void main(String [] args) {
		long n1 = 1, n2 = 2, sum = 0, max = 4000000, temp = 0;
		sum = n2;
		while (n2 < max) {
			temp = n2;
			n2 += n1;
			n1 = temp;
			sum += (n2 & 1) == 0 ? n2 : 0;
		}
		sum -= (n2 & 1) == 0 ? n2 : 0;
		System.out.println(sum);
	}
}
