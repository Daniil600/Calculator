public class ConverterToArabic {

    public String converterArabic(String c, String d, String expression) {

        int answers = 0;
        int a = Integer.valueOf(c);
        int b = Integer.valueOf(d);

        if(a > 11 || a < 0 || b > 11 || b < 0){
            return "Калькулятор принимает числа от 1 и до 10";
        }else{
            switch(expression){
                case "+":
                    answers = a + b;
                    break;
                case "-":
                    answers = a - b;
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
        }
        String answer = String.valueOf(answers);
        return answer;
    }
}

