//import java.util.Scanner;
//
//public class Calculator1 {
//
//
//    public static Scanner scanner;
//
//    public static void main (String[] args){
//
//        scanner = new Scanner(System.in);
//
//        int num1;
//        int num2;
//        String operator;
//
//        System.out.print("введите 2 целых числа от 1-10:");
//
//        num1 = scanner.nextInt();
//        operator = scanner.next();
//        num2 = scanner.nextInt();
//
//
//        if ((num1 < 11 && num1 > 0)  && (num2 < 11 && num2 > 0) ) {
//
//            if (operator.equals("*")) {
//                System.out.println("ответ: " + (num1 * num2));
//            }
//            if (operator.equals("/")) {
//                System.out.println("ответ: " + (num1 / num2));
//            }
//            if (operator.equals("+")) {
//                System.out.println("ответ: " + (num1 + num2));
//            }
//            if (operator.equals("-")) {
//                System.out.println("ответ: " + (num1 - num2));
//            }
//        }
//        else
//            System.out.println("error!");
//
//    }
//}
