import java.util.*;

public class Quick_Brown_Fox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numLines; i++) {
            String s = scanner.nextLine();

            // adding letters from line
            HashSet<Character> charSet = new HashSet<>();
            for (int j = 0; j < s.length(); j++) {
                charSet.add(Character.toLowerCase(s.charAt(j)));
            }

            // checking for missing letters
            StringBuilder missing = new StringBuilder();
            for (int j = 'a'; j <= 'z'; j++) {
                if (!charSet.contains((char) j)) {
                    missing.append((char) j);
                }
            }
            System.out.println(missing.length() == 0 ? "pangram" : "missing " + missing);
        }
    }
}


