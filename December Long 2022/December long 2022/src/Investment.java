import java.util.*;

public class Investment {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		int notc = input.nextInt();
		
		while (notc-- > 0){
		    
		   int x = input.nextInt();
           int y = input.nextInt();

           if (2*y <= x){
            System.out.println("YES");
           }
           else{
            System.out.println("NO");
           }
		   
		}
		
		input.close();	
	}
}


/* package codechef; // don't place package name! */

