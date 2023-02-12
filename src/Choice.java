public class Choice {
    private String question;

    public Choice(String question) {
        this.question = question;
    }


    public String choiceArabicOrRoman(String question){
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] arabic = {"O", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        String answer;

        String expression = question.replaceAll("[^*,/,+,-]", "");
        question = question.replaceAll(" ", "");
        String string = question.replaceAll("[^I,V,X,L,C,0-9]", " ");
        String[] numbers = string.split(" ");

        boolean examinationArabic = false;
        boolean examinationRoman = false;
        boolean examination = false;

        String romanA = null;
        String romanB = null;
        int romanIA = 0;
        int romanIB = 0;

        String arabicA = null;
        String arabicB = null;
        int arabicIA = 0;
        int arabicIB = 0;
        if (numbers.length == 2) {
            String c = numbers[0].toString();
            String d = numbers[1].toString();

            while(examination != true) {

                for (int i = 0; i < arabic.length; i++) {
                    if (c.equals(arabic[i])) {
                        arabicA = arabic[i];
                        arabicIA = i;
                    }
                    if (d.equals(arabic[i])) {
                        arabicB = arabic[i];
                        arabicIB = i;
                    }
                }
                if (arabicA == arabic[arabicIA] && arabicB == arabic[arabicIB]) {
                    examinationArabic = true;
                    examination = true;
                }
                for (int i = 0; i < roman.length; i++) {
                    if (c.equals(roman[i])) {
                        romanA = roman[i];
                        romanIA = i;
                    }
                    if (d.equals(roman[i])) {
                        romanB = roman[i];
                        romanIB = i;
                    }
                }
                if (romanA == roman[romanIA] && romanB == roman[romanIB]) {
                    examinationRoman = true;
                    examination = true;
                }else if(arabicA == arabic[arabicIA] && arabicB == arabic[arabicIB]) {
                    examinationArabic = true;
                    examination = true;
                } else {
                    examination = true;
                }
            }
        }else if (numbers.length <= 1 || expression.equals("/") || expression.equals("+") || expression.equals("*") || expression.equals("-")){
            return "строка не является математической операцией";
        }else {
            return "формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)";
        }




        if(examinationRoman == true && examinationArabic == false) {
            ConverterToRoman converterToRoman = new ConverterToRoman();
            answer = converterToRoman.converterRoman(romanA, romanB, expression);
            return answer;
        } else if (examinationArabic == true && examinationRoman == false) {
            ConverterToArabic converterToArabic = new ConverterToArabic();
            answer = converterToArabic.converterArabic(arabicA, arabicB, expression);
            return answer;
        }else {
            return "Что то не так, проверьте правильность введёных Вами данных";
        }
    }
}
