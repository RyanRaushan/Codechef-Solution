/**
 * DIVBYK
 */

import java.util.Scanner;

public class DIVBYK {

    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		int notc = input.nextInt();
		
		while (notc-- > 0){
		    
            int n = input.nextInt();
            int k = input.nextInt();

            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++){
                arr[i] = input.nextInt();
            }
            
            int mul = 1;

            for (int i = 0; i < n; i++){
                mul = mul * (arr[i] % k);
            }

            if (mul % k == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
		}
		
		input.close();	
	}
    
}