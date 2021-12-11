
import java.util.*;
package Practice_Dec_10;
public class PerfectSquare{

	public static void main(String args[]) 
  {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int count = 0;
		for(int i=1;i<=num;i++ ) {
			if(num%i==0)
			{
				count+=1;
				
			}
			
		}
		if(count%2==0)
		{
			System.out.println(" NOT perfect square");
		}
		else
		{
			System.out.println("Perfect Square");
		}
		

	}

}
