import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.next();

        int[] freq = new int[26];

        for (int i = 0; i < S.length() ; i++) {
            freq[S.charAt(i) - 'a']++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i]!=0)
                for (int j = 0; j < freq[i]; j++) {
                    System.out.print((char) (i + 'a'));
                }
        }
    }
}