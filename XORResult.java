/* 1.Given the array arr of positive integers and the array queries where queries[i] = [Li, Ri], for each query i compute the XOR of elements from Li to Ri (that is, arr[Li] xor arr[Li+1] xor ... xor arr[Ri] ). Return an array containing the result for the given queries.

Input: arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]
Output: [2,7,14,8] */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XORResult {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1=br.readLine();
		String[] nums1=line1.split(" ");
		String line2=br.readLine();            //input example: 1 3 4 8
		String[] nums2=line2.split(" ");		//				0 1 1 2 0 3 3 3
		int size1=nums1.length;
		int size2=nums2.length;
		int[] arr=new int[size1];
		int[] queries=new int[size2];
		for(int i=0;i<size1;i++)
		{
			arr[i]=Integer.parseInt(nums1[i]);
		}
		for(int i=0;i<size2;i++)
		{
			queries[i]=Integer.parseInt(nums2[i]);
		}
		int[] result=xorFunc(arr,queries,size1,size2);
		for(int i=0;i<size2/2;i++)
		{
			System.out.print(result[i]+" ");
		}
		
	}
	
	static int[] xorFunc(int[] arr,int[] queries,int size1,int size2)
	{
		int[] result=new int[size2/2];
		for(int i=0;i<size2;i+=2)
		{
			for(int j=queries[i];j<=queries[i+1];j++)
			{
				result[i/2]=result[i/2]^arr[j];
			}
		}
		return result;
	}

}
