import java.util.Scanner;

public class XORMAX {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int notc = input.nextInt();

        while (notc-- > 0) {
            String str1 = input.next();
            String str2 = input.next();

            int zerostr1 = 0, zerostr2 = 0, onestr1 = 0, onestr2 = 0;

            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == '1') {
                    onestr1++;
                } else {
                    zerostr1++;
                }
            }

            for (int i = 0; i < str2.length(); i++) {
                if (str2.charAt(i) == '1') {
                    onestr2++;
                } else {
                    zerostr2++;
                }
            }

            int max = Math.min(Math.max(onestr1, onestr2), Math.max(zerostr1, zerostr2))
                    + Math.min(Math.min(onestr1, onestr2), Math.min(zerostr1, zerostr2));

            int min = str2.length() - max;

            for (int i = 0; i < max; i++) {
                System.out.print("1");
            }
            for (int i = 0; i < min; i++) {
                System.out.print("0");
            }
            System.out.println();

        }

        input.close();
    }
}
