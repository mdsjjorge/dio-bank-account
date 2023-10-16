import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the account number: ");
        int account = scanner.nextInt();

        System.out.println("Please, enter the agency number: ");.
        String agency = scanner.next();

        scanner.nextLine();

        System.out.println("Please, enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Great, " + name + "! To finish, enter your balance: ");
        double balance = scanner.nextDouble();
        NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String formatBalance = format.format(balance);

        System.out.println("Very good, " + name + "! Thank you for creating an account with our bank. " +
                " Your agency is " + agency + ", account " + account + " and your balance " + formatBalance +
                " is now available for withdraw. ");
    }
}
