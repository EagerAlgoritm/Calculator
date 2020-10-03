public class RomeNumbers {
    static String [] romeInputNumbers = {"0","I","II","III","IV","V","VI","VII","VIII","IX","X"};
    static String [] romeResultNumbers = {"0","I","II","III","IV","V","VI","VII","VIII","IX","X",
            "XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX",
            "XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX",
            "XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL",
            "XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L",
            "LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX",
            "LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX",
            "LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX",
            "LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC",
            "XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"};



    static int countRome = 0;
    static int fInput;
    static int sInput;
    static int result;

    public static void Translate(String firstInput, char operation, String secondInput){
        try
        {
            for (String romeInputNumber : romeInputNumbers) {
                if (firstInput.toUpperCase().equals(romeInputNumber)) {
                    firstInput = firstInput.toUpperCase();
                    countRome++;
                }
                if (secondInput.toUpperCase().equals(romeInputNumber)) {
                    secondInput = secondInput.toUpperCase();
                    countRome++;
                }
            }
            switch (countRome) {
                case 0 -> {
                    fInput = Integer.parseInt(firstInput);
                    sInput = Integer.parseInt(secondInput);
                    System.out.println(Calculator.calc(fInput, sInput, operation));
                }
                case 1 -> System.err.println("Неправильный формат ввода:\n" +
                        "Два числа должны быть либо арабскими, либо римскими, и быть в интервале 1-10.");
                case 2 -> {
                    fInput = TranslateRomeToInt(firstInput);
                    sInput = TranslateRomeToInt(secondInput);
                    result = Calculator.calc(fInput, sInput, operation);
                    System.out.println(TranslateIntToRome(result));
                }
            }
        }
        catch (NumberFormatException e){System.err.println("Неправильный формат ввода: "+e.getMessage());}
    }

    public static int TranslateRomeToInt(String rNum) {

            for (int i = 0; i < romeInputNumbers.length; i++) {
            if (rNum.equals(romeInputNumbers[i])){
                return i;
            }
        }
            System.err.println("Не удалось перевести строку.");

                return -1;
    }

    public static String TranslateIntToRome(int iRome ) {
        try {
            return romeResultNumbers[iRome];
        } catch(IndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }
        System.err.println("Не удалось перевести число.");
        return "";
    }


}