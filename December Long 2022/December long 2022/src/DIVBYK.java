/**
 * DIVBYK
 */

import java.util.ArrayList;
import java.util.Scanner;

public class DIVBYK {

    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		int notc = input.nextInt();
		
		while (notc-- > 0){
		    
            int n = input.nextInt();
            int k = input.nextInt();

            ArrayList <Integer> list = new ArrayList<>();
            
            for (int i = 0; i < n; i++){
                list.add(input.nextInt());
            }

            if (check(list, k)){
                System.out.println("YES");
            }
            else{

                long rem = list.get(0) % k;;
                long mul = 1;

                for (int i = 1; i < n; i++){
                    mul = rem * list.get(i);
                    rem = mul % k;
                    if (rem == 0){
                        System.out.println("YES");
                        break;
                    }
                }

                if (rem != 0 ){
                    System.out.println("NO");
                }
            }
            
		}
		
		input.close();	
	}
    
    public static boolean check (ArrayList<Integer> list, int k){

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % k  == 0){
                return true;
            }
        }
        return false;
    }
}