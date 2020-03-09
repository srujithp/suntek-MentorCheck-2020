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
