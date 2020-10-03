public class Calculator {

    public static int calc(int num1, int num2, char operation) {

        int result;

        if ((num1 < 11 && num1 > 0) && (num2 < 11 && num2 > 0) ) {

            System.out.println();

        } else {
            throw new IllegalArgumentException("Два числа должны быть либо арабскими, либо римскими, и быть " +
                    "в интервале 1-10.");
        }


        result = switch (operation) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> throw new IllegalArgumentException("Неверный знак операции.");
        };
        return result;
    }
}
