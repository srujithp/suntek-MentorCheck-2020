/* 5.Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.
Example 1:
Input: 2
Output: [0,1,1]
•	It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
•	Space complexity should be O(n). */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Prog5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		System.out.println(noOfOnes(num));
		
	}
	
	static ArrayList<Integer> noOfOnes(int num)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(0);
		if(num==0)
			return al;
		al.add(1);
		if(num==1)
			return al;
		for(int i=0;i<=num-2;)
		{
			int k=0;
			int s=al.size();
			while(k<s)
			{
				al.add(al.get(k)+1);
				k++;
				i++;
				if(i>num-2)
					break;
			}
		}
		return al;
	}

}
