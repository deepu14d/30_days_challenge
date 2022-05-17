
// In strings
import java.util.Arrays;
public class linearSearch2 {
    public static void main(String[] args) {
        String name = "Amit";
        System.out.println(name);
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));

        // string search
        String str = "Naruto";
        char target = 'u' ;
        System.out.println(search(str, target));
        System.out.println(search2(str, target));
    }

// ********************************************************************************************** //
    static boolean search(String str, char target){
        if (str.length() == 0){
            return false;
        }

        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

// ********************************************************************************************** //
    static boolean search2(String str, char target){
        if (str.length() == 0){
            return false;
        }

        for (char ch: str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}