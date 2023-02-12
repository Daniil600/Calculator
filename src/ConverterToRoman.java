public class ConverterToRoman {

    String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
    };

    public String converterRoman(String c, String d, String expression){
        int a = 0;
        int b = 0;

        for (int i = 0; i < this.roman.length; i++) {
            if(roman[i].equals(c) && i < 11){
                a = i;
            }if(roman[i].equals(d)&& i < 11){
                b = i;
            } else if (i > 10) {
                break;
            }
        }
        int answers = 0;
        switch(expression){
            case "+":
                answers = a + b;
                break;
            case "-":
                answers = a - b;
                if(answers < 0){
                    return "В римских числах не может быть отрицательное число";
                }
                break;
            case "/":
                answers = a / b;
                break;
                case "*":
                    answers = a * b;
                    break;
                default:
                    return "Введено некорректное выражение";
                }
        return roman[answers];
    }

}
