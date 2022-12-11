import java.util.Scanner;

public class ReachFast {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int notc = input.nextInt();

        while (notc-- > 0) {

            int x = input.nextInt();
            int y = input.nextInt();
            int k = input.nextInt();

            int max = Math.max(x, y);
            int min = Math.min(x, y);
            int ans = 0;
            
            for (int i = 0;; i++) {
                if (max - (i * k) <= min) {
                    ans = i;
                    break;
                }
            }
            System.out.println(ans);

        }

        input.close();
    }
}