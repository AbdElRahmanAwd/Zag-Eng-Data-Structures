import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        help_methods c1 = new help_methods();

        c1.setNumber(259);
        System.out.println(c1.getRevers_Number());

        c1.setValue(11);
        System.out.println(c1.getRandom());

        c1.setTwo_Value(20,10);
        System.out.println(c1.getRandom_Range());

        System.out.println((char) c1.getCharacter());

    }
}