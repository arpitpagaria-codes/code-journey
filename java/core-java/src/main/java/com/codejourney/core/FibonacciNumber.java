/**
 * 
 */
package com.codejourney.core;

/**
 * 
 */
public class FibonacciNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("0 "+FibonacciNumber.fib(0));
		System.out.println("1 "+FibonacciNumber.fib(1));
		System.out.println("2 "+FibonacciNumber.fib(2));
		System.out.println("3 "+FibonacciNumber.fib(3));
		System.out.println("4 "+FibonacciNumber.fib(4));
		System.out.println("5 "+FibonacciNumber.fib(5));
		System.out.println("6 "+FibonacciNumber.fib(6));
		System.out.println("7 "+FibonacciNumber.fib(7));
		FibonacciNumber.printFibSeries(10);

	}
	
	/**
	 * @param n
	 * @return
	 */
	public static int fib(int n) {
		int firstNumb = 0;
		int secondNumb = 1;
		int finalNumb = 0;
		if(n == 0) return 0;
		else if(n == 1) return 1;
		else {
			while(n>=2) {
				finalNumb = firstNumb + secondNumb;
				firstNumb = secondNumb;
				secondNumb = finalNumb;
				n--;
			}
		}
        return finalNumb;
    }
	
	/**
	 * @param n
	 * @return
	 */
	int fibV2(int n) {
	    if (n <= 1) return n;
	    return fibV2(n - 1) + fibV2(n - 2);
	}
	
	/**
	 * @param n
	 * @param dp
	 * @return
	 */
	int fibV3(int n, int[] dp) {
	    if (n <= 1) return n;
	    if (dp[n] != 0) return dp[n];
	    return dp[n] = fibV3(n - 1, dp) + fibV3(n - 2, dp);
	}
	
	/**
	 * @param n
	 */
	public static void printFibSeries(int n) {
		if(n == 0) System.out.println("0");
		else if (n==1) System.out.println("1");
		else {
			String str = "0 1";
			int firstNumber = 0;
			int secondNumber = 1;
			int finalNumber = 0;
			while(n>=2) {
				finalNumber = firstNumber + secondNumber;
				str += " "+finalNumber;
				firstNumber = secondNumber;
				secondNumber = finalNumber;
				n--;
			}
			System.out.println(str);
		}
	}


}
