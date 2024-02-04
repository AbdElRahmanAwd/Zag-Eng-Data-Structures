import java.util.Scanner;

public class HotPotatos {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number of children : ");
        int numberOfChilds = input.nextInt();

        System.out.println("Enter Names : ");
        Queue<Object> queue = new Queue<>(numberOfChilds);
        for (int i = 0; i < numberOfChilds; i++) {
            queue.enQueue(input.next());
        }

        System.out.println("Enter Time of Tosses : ");
        int times = input.nextInt();

        int count = 1;
        while (queue.getSize()>1){
            if (count == times) {
                queue.deQueue();
                count = 1;
                continue;
            }
            Object temp = queue.deQueue();
            queue.enQueue(temp);
            count++;
        }

        System.out.println("The Winner is : "+queue.deQueue());

    }
}
