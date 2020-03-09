/* 4.Given a positive integer n and you can do operations as follow:
1.	If n is even, replace n with n/2.
2.	If n is odd, you can replace n with either n + 1 or n - 1.
What is the minimum number of replacements needed for n to become 1?
Example 1:
Input:
8

Output:
3

Explanation:
8 -> 4 -> 2 -> 1  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Steps {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number: ");
		int n=Integer.parseInt(br.readLine());
		System.out.println(noOfSteps(n));
		
	}
	
	static int noOfSteps(int n)
	{
		if((n&1)==1)
			n=n-1;
		int c=0;
		while(n!=1)
		{
			n=n>>1;
			c++;
		}
		return c;
	}

}
