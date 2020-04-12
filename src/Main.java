import java.util.Scanner;

public class Main {
    String str;
    public static void main(String[] args) {
        CountCharInString controller = new CountCharInString(Main.inputStr());
        System.out.print("The character which appears most is :");
        System.out.println(controller.find());
    }

    public static String inputStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        return scanner.nextLine();
    }
}
