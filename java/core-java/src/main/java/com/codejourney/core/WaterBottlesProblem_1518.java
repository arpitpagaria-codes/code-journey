/**
 * 
 */
package com.codejourney.core;

/**
 * 1518. Water Bottles
Solved
Easy
Topics
premium lock icon
Companies
Hint
There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.

The operation of drinking a full water bottle turns it into an empty bottle.

Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.

 

Example 1:


Input: numBottles = 9, numExchange = 3
Output: 13
Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
Number of water bottles you can drink: 9 + 3 + 1 = 13.
Example 2:


Input: numBottles = 15, numExchange = 4
Output: 19
Explanation: You can exchange 4 empty bottles to get 1 full water bottle. 
Number of water bottles you can drink: 15 + 3 + 1 = 19.
 

Constraints:

1 <= numBottles <= 100
2 <= numExchange <= 100
 */
public class WaterBottlesProblem_1518 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("0,0 - " + numWaterBottles(0, 0));
		System.out.println("0,3 - " + numWaterBottles(0, 3));
		System.out.println("2,3 - " + numWaterBottles(2, 3));
		System.out.println("3,3 - " + numWaterBottles(3, 3));
		System.out.println("5,3 - " + numWaterBottles(5, 3));
		System.out.println("7,3 - " + numWaterBottles(5, 3));
		System.out.println("9,3 - " + numWaterBottles(9, 3));

		System.out.println("15,4 - " + numWaterBottles(15, 4));
	}

	/**
	 * @param numBottles
	 * @param numExchange
	 * @return
	 */
	public static int numWaterBottles(int numBottles, int numExchange) {
		if (numBottles <= 0)
			return 0;
		else if (numBottles < numExchange)
			return numBottles;
		else {
			int totalDrink = numBottles;
			int emptyBottles = 0;
			while (numBottles >= numExchange) {
				// totalDrink += (numBottles - emptyBottles);
				if (numBottles % numExchange != 0) {
					emptyBottles = numBottles % numExchange;
				} else {
					emptyBottles = 0;
				}
				numBottles = numBottles / numExchange;
				totalDrink += numBottles;
				numBottles += emptyBottles;
			}
			return totalDrink;
		}
	}

}
