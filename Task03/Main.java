
public class Main {
    public static void main(String[] args) {

        DynamicArray array1 = new DynamicArray(5);

        array1.insert(12);
        array1.insert(15);
        array1.insert(19);
        array1.insert(55);
        array1.insert(100);
        array1.insert(123);

        array1.print_Array();
        System.out.println(array1.indexOf(123));
        System.out.println(array1.at(0));
        array1.removeAt(3);
        array1.print_Array();



    }
}