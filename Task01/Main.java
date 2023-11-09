import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input Numbers");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            String chars = input.next();
            filter(chars);
        }

        System.out.println("Done");
    }

    public static void filter (String word){

        if (word.length() < 10) {
            System.out.println(word);
        }
        else {
            System.out.println(word.charAt(0)+""+(word.length()-2)+""+word.charAt(word.length()-1));
        }
    }
}