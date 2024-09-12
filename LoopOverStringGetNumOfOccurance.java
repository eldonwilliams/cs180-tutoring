import java.util.Scanner;

public class StringOp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inp = scanner.next();
        char ch = scanner.next().charAt(0);
        int occurances = 0;

        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == ch) {
                occurances++;
            }
        }

        System.out.println(occurances);
    }
}