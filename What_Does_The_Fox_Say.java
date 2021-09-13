import java.util.HashSet;
import java.util.Scanner;

public class What_Does_The_Fox_Say {
    public static void main(String[] args) {

        HashSet<String> sounds = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cases; i++) {
            String[] recordSounds = scanner.nextLine().split(" ");

            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                if (!s.equals("what does the fox say?")) {
                    sounds.add(s.substring(s.lastIndexOf(" ") + 1));
                } else {
                    break;
                }
            }

            StringBuilder ans = new StringBuilder();
            for (String sound : recordSounds) {
                if (!sounds.contains(sound)) {
                    ans.append(sound);
                    ans.append(" ");
                }
            }
            System.out.println(ans.toString());
        }
        scanner.close();
    }
}
