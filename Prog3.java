import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 3.Given a non-empty array of numbers, a0, a1, a2, … , an-1, where 0 ≤ ai < 231.
Find the maximum result of ai XOR aj, where 0 ≤ i, j < n.
Could you do this in O(n) runtime?
Example:
Input: [3, 10, 5, 25, 2, 8]

Output: 28  */

public class Prog3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		String[] nums=line.split(" ");
		int size=nums.length;
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=Integer.parseInt(nums[i]);
		}
		System.out.println(maxXor(arr));
		
	}
	
	static int maxXor(int[] arr)
	{
		int size=arr.length;
		int max=0;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if((arr[i]^arr[j])>max)
					max=(arr[i]^arr[j]);
			}
		}
		return max;
	}

}
