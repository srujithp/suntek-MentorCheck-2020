/* 6.Given a non-empty array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
Example 1:
Input: [2,2,3,2]
Output: 3 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;
import java.io.IOException;

public class SingleOne {
	
	static String oneElement(String[] nums)
	{
		Hashtable<String, Integer> h = new Hashtable<String, Integer>(); 
		int size=nums.length;
		for(int i=0;i<size;i++)
		{
			if(h.get(nums[i])==null)
					h.put(nums[i],1);
			else
			{
				h.put(nums[i],h.get(nums[i])+1);
			}
		}
		
		Enumeration enu = h.keys(); 
		while (enu.hasMoreElements()) { 
			
			String str1=(String)enu.nextElement();
			if(h.get(str1)==1)
				return str1;
        } 
		return "0";
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the numbers");
		String line=br.readLine();
		String[] str=line.split(" ");
		System.out.println(oneElement(str));
	
	}

}
