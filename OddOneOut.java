/* 6.Given a non-empty array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
Example 1:
Input: [2,2,3,2]
Output: 3 */

import java.util.*;
import java.io.*;
public class OddOneOut {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the numbers");
		String str=br.readLine();
		String[] nums= str.split(" ");
		int n=(str.length()+1)/2;
		for(int i=0;i<n;i++)
		System.out.print(nums[i]+" ");
		Hashtable<String, Integer> h = new Hashtable<String, Integer>(); 
		for(int i=0;i<n;i++)
		{
			if(h.get(nums[i])==null)
					h.put(nums[i],1);
			else
			{
				h.put(nums[i],h.get(nums[i])+1);
			}
		}
		System.out.println();
		Enumeration enu = h.keys(); 
		while (enu.hasMoreElements()) { 
			String str1=(String)enu.nextElement();
			if(h.get(str1)==1)
            System.out.println(str1); 
        } 
	}

}
