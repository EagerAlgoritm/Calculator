import java.util.Scanner;

public class Calculator {

    static Scanner scan = new Scanner(System.in);


    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

       int First;
       char operation1;
       int Second;

//       First = RomanToArabic.romanToArabic(scan.next());
//       operation1 = scan.next().charAt(0);
//       Second = RomanToArabic.romanToArabic(scan.next()) ;
//       System.out.println(RomanToArabic.arabicToRoman(calc(First, Second, operation1)));

       int one = getInt();
       char operation = getOperation();
       int two = getInt();
       int result = calc(one,two,operation);
       System.out.println("Результат операции " + result);



    }

    public static int getInt() {
        int num;
        if(scan.hasNextInt()) {
            num = scan.nextInt();
        } else {
            throw new IllegalArgumentException("error1");
        }

        return num;
    }
    public static char getOperation() {
        char operation;
        if(scan.hasNext()) {
            operation = scan.next().charAt(0);
        } else {
            throw new IllegalArgumentException("error");
        }
        return operation;
    }


    public static int calc(int num1, int num2, char operation) {
        int result;

        if ((num1 < 11 && num1 > 0) && (num2 < 11 && num2 > 0) ) {

        } else {
            throw new IllegalArgumentException("11");
        }
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("Не верный знак операции");
        }
        return result;


    }
}

