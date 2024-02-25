import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        int[] frq = new int[26];
        for (int i = 0; i < word.length(); i++) {
            frq[word.charAt(i) - 'a']++;
        }

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (frq[index] == 1) {
                System.out.println(word.charAt(i));
                break;
            }
        }

    }
}