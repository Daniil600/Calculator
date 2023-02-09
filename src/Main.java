import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значения: ");
        String question = scanner.nextLine();

        Choice choice = new Choice(question);
        System.out.println(choice.choiceArabicOrRoman(question));

    }
}