import java.util.ArrayList;
import java.util.Scanner;

// ArrayList is used when we don't know about the size of array we have to use
public class ArrayListExample {
    public static void main(String[] args) {

        /*
        Syntax : -  ArrayList<data_type_wrapper_class> list = new ArrayList<>(initialCapacity);
         */

        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);    // we can add directly in ArrayLists using .add method
        list.add(1);
        list.add(167);
        list.add(10);

        System.out.println(list); // don't need Arrays.toString(list) as it internally already applied so, we can print list directly
        System.out.println(list.contains(10)); // true
        list.set(0, 13);  // list.set(index_number, element)
        list.remove(2); // list.remove(index_number)
        System.out.println(list);


        // ************************************************************** //

        ArrayList<Integer> list2 = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        // input
        for (int i=0; i < 5; i++){
            list2.add(in.nextInt());
        }

        // reading inputs
        for (int i=0; i < 5; i++){
            System.out.print(list2.get(i) + " ");
        }

    }
}
