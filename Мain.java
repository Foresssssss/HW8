package HW8;

/*
Создайте список произвольных слов.
 С помощью StreamAPI и метода reduce объедините слова в предложение.
  Выведите первоначальный список и полученное предложение в консоль.
 */

import java.util.Arrays;
import java.util.List;

public class Мain {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Это", "список", "определенных", "слов", "и",
                "он", "будет", "объеденен","в", "предложение");

        String sentence = words.stream()
                .reduce("", (partialSentence, word) -> partialSentence + " " + word);

        System.out.println("Список слов: " + words);
        System.out.println("Полученное предложение: " + sentence);
    }
}

