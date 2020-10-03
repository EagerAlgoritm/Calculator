import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Для вычисления введите арабские или римские цифры от 1 до 10 и знак операции" + ", " +
                "например 1 + 7:");

        RomeNumbers.Translate(scan.next(), scan.next().charAt(0), scan.next());

    }
}
