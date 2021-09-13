import java.util.*;

public class Cryptographer_Conundrum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        char c = 'P';
        int days = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                days++;
            }
            c = nextLetter(c);
        }
        System.out.println(days);
    }

    public static char nextLetter(char c) {
        switch (c) {
            case 'P':
                return 'E';
            case 'E':
                return 'R';
            case 'R':
                return 'P';
            default:
                return 'X';
        }
    }
}
