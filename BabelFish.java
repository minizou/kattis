import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class BabelFish {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String,String> dict = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            if (s.length() != 0) {
                String[] temp = s.split(" ",2);
                dict.put(temp[1],temp[0]);
            } else {
                break;
            }
        }

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            System.out.println(dict.containsKey(s) ? dict.get(s) : "eh");
        }
    }
}
