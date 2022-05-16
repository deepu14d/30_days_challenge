import java.util.ArrayList;
import java.util.Scanner;

public class MutiAL {
    // MultiDimensional ArrayList - ArrayList of ArrayLists
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        // initialization
        for (int i =0; i < 3; i++){
            list.add(new ArrayList<>());
        }

        // add element
        for (int i =0; i < 3; i++){
            for (int j=0; j <3; j++){
                list.get(i).add(in.nextInt());
            }
        }

        System.out.print(list);
    }
}
