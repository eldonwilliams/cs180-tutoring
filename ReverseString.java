import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRev = scanner.nextLine();
        String reversed = "";

        for (int i = 0; i < toRev.length(); i++) {
            char reversedChar = toRev.charAt(toRev.length() - i - 1);
            reversed += reversedChar;
        }

        System.out.println(reversed);
        reversed = "";

        for (int i = toRev.length() - 1; i >= 0; i--) {
            reversed += toRev.charAt(i);
        }
        System.out.println(reversed);

    }
}