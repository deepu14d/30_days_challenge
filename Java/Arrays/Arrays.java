
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] rollNo = {12, 23, 34, 45};
        System.out.println(rollNo[2]);

        String[] name = new String[5];
        // input using for loop
        for(int i=0; i < name.length; i++){
            name[i] = in.next();
        }
        // output those inputted items
        for(int i=0; i < name.length; i++){
            System.out.print(name[i] + " ");
        }

//        for (String s : name) {           ouput can be achieved like this also
//            System.out.println(s);
//        }

    }
}
