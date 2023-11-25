import java.lang.reflect.Array;
import java.util.ArrayList;

public class help_methods {

    private int number;
    private int value;
    private int max_value;
    private int min_value;


    public int getRevers_Number() {
        int temp = 0;
        while (number != 0) {
            int digit = number % 10;
            temp = temp * 10 + digit;
            number /= 10;
        }

        return temp;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRandom() {
        this.value = (int)(Math.random()*value);
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getRandom_Range() {
        return (int)(min_value+(max_value-min_value)*Math.random());
    }

    public void setTwo_Value(int min_value , int max_value) {
        this.max_value = max_value;
        this.min_value = min_value;
    }

    public int getCharacter() {
        return (int)(97+(123-97)*Math.random());
    }


}
