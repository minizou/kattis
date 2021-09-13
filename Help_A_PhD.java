import java.util.*;

public class Help_A_PhD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numLines; i++) {
            String s = scanner.nextLine();
            if (!s.equals("P=NP")) {
                System.out.println(
                        Integer.parseInt(s.split("\\+")[0])
                        + Integer.parseInt(s.split("\\+")[1]));
            } else {
                System.out.println("skipped");
            }
        }
    }
}
