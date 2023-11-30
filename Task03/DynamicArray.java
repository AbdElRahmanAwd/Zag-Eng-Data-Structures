public class DynamicArray {

    int [] array;
    int size = 0;
    int lastItem = 0;

    public DynamicArray(int n) {
        array = new int[n];
        size = n;
    }

    public DynamicArray() {
        array = new int[10];
        size = 10;
    }

    public void print_Array() {
        for (int elements: this .array)
            System.out.print(elements+" ");

        System.out.println();
    }

    public void insert(int element) {
        if (lastItem == size) {
            size *= 2;
            int [] newArray = new int[size];
            copyArray(array, newArray);
            array = newArray;
        }

        array[lastItem] = element;
        lastItem++;
    }

    private void copyArray(int [] array,int [] newArray) {
        for (int i = 0; i < array.length; i++)
            newArray[i] = array[i];
    }

    public void removeAt(int index) {
        if (!isValidIndex(index))
            throw new IllegalStateException("WRONG INDEX");

        for (int i = index; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
        lastItem--;
    }

    private boolean isValidIndex(int index) {
        return index >=0 && index < size ;
    }

    public int indexOf(int element) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == element)
                return i;
            else if (i == array.length-1)
                throw new IllegalStateException("NOT EXISIT");
        }

        return -1;
    }

    public int at(int index) {
        if (!isValidIndex(index))
            throw new IllegalStateException("WRONG INDEX");

        return array[index];
    }

    public int max() {
        int max = this.array[0];

        for (int i = 0; i < this.array.length; i++) {
            if (max < this.array[i])
                max = this.array[i];
        }

        return max;
    }

    public int min() {
        int min = this.array[0];

        for (int i = 0; i < this.array.length; i++) {
            if (min > this.array[i])
                min = this.array[i];
        }

        return min;
    }

    public void remove(int element) {
        removeAt(indexOf(element));
    }

}
