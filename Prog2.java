/* 2. Given 3 positives numbers a, b and c. Return the minimum flips required in some bits of a and b to make ( a OR b == c ). (bitwise OR operation).
Input: a = 2, b = 6, c = 5
Output: 3 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prog2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1=br.readLine();
		String[] nums=line1.split(" ");
		int size=nums.length;
		int a=Integer.parseInt(nums[0]);
		int b=Integer.parseInt(nums[1]);
		int c=Integer.parseInt(nums[2]);
		System.out.println(minFlips(a,b,c));
	}
	
	static int minFlips(int a,int b,int c)
	{
		int count=0;
		while(Math.max(a,Math.max(b,c))>0)
		{
			if((a%2==0)&&(b%2==0)&&(c%2==1))
				count++;
			else if(((a%2)!=(b%2))&&(c%2==0))
				count++;
			else if((a%2==1)&&(b%2==1)&&(c%2==0))
				count+=2;
			a=a>>1;
			b=b>>1;
			c=c>>1;
		}
		return count;
	}
}
			