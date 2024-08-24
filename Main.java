
public class Main
{
	public static void main(String[] args) {
		class Solution {
			public int addDigits(int num) {
				if(num<10) {
					return num;//base case the recursion will stop if the condition is met
				}
				int DON = num/10;//division of num
				int RON = num%10;//reminder of num
				int resum=RON+DON;//re-sum the RON and DON if condtion is not met in the base case
				return addDigits(resum);//recursion statement
				//test cases
				/*
				input num = 38
				output 2
				(38 --> 3+8 -->11
				11 --> 1+1 -->2)
				input num=0
				output 0
				disclaimer *** the test cases and its explantion and the proplem itself is from leetcode website
				i just implemented my soloution.
				*/

			}
		}

	}
}