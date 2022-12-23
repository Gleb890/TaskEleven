import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11_29 {
    public static void main(String[] args) {
        List<String> properNouns = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        String[] words = text.split(" "); // регулярное выражение, разбивает текст на слова и числовые выражения

        for (int i = 0; i < words.length; i++) {
            // проверка слов на имя собственное
            if (Character.isUpperCase(words[i].charAt(0))) {
                properNouns.add(words[i]);
            }
        }
                System.out.println("Имена собственные: " + properNouns);
    }
}