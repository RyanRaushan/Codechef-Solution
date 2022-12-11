import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// brute force solution.
public class NOTD {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);

        int notc = input.nextInt();

        while (notc-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    list.add(Math.abs(arr[i] - arr[j]));
                }
            }

            int max = Collections.max(list);
            int k = 1;

            while (k <= max + 1) {
                boolean flag = true;

                for (int j = 0; j < list.size(); j++) {

                    if (list.get(j) % k == 0) {
                        flag = false;
                        break;
                    }

                }
                if (flag) {
                    System.out.println(k);
                    break;
                }
                k++;
            }
        }

        input.close();
    }
}
