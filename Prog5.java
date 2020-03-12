import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Prog5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		//System.out.println(0&-1);
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
