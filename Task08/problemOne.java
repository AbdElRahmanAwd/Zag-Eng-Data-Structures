import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N,M;
        N= input.nextInt();
        M= input.nextInt();

        int[] array = new int[N];
        int[] freq = new int[M+1];

        for (int i = 0; i < array.length ; i++) {
            array[i] = input.nextInt();
            freq[array[i]]++;
        }

        for (int i = 1; i < freq.length; i++) {
            System.out.println(freq[i]);
        }
    }
}