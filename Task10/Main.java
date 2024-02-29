import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int[] arr = {1,2,2,3,3,3,4,9,16,16,16,16};

        occurrence(s);
        System.out.println(notRepeated(s));
        System.out.println(moreFrq(arr));
    }

    public static int moreFrq (int[] arr) {
        ChainingHashTable hash = new ChainingHashTable(10);

        int frq = 0;
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            hash.frqValue(key);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!hash.nullIndex(arr[i]) && hash.getFrq(arr[i]) > frq) {
                frq = hash.getFrq(arr[i]);
                max = arr[i];
            }
        }
        return max;
    }

    public static void occurrence (String s) {
        LinearHashTable hash = new LinearHashTable(26);
        System.out.print("[ ");
        for (int i = 0; i < s.length(); i++) {
            int key = s.charAt(i) - 'a';
            hash.frqValue(key);
        }
        for (int i = 0; i < hash.size(); i++) {
            if (!hash.nullIndex(i))
                System.out.print((char)(i+'a')+ ":" + hash.getFrq(i) + " ");
        }
        System.out.println("]");
    }

    public static char notRepeated (String s) {
        LinearHashTable hash = new LinearHashTable(26);

        for (int i = 0; i < s.length(); i++) {
            int key = s.charAt(i) - 'a';
            hash.frqValue(key);
        }
        for (int i = 0; i < s.length(); i++) {
            int key = s.charAt(i) - 'a';
            if (hash.getFrq(key) == 1)
                return (char) s.charAt(i);
        }
        return 0;
    }

}