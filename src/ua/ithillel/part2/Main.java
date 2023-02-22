package ua.ithillel.part2;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static int ri;

    static String askWord;
    static String answer;
    static String ansWord = "";
    static char[] decoy;

    static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        ri = rnd.nextInt(words.length);

        askWord = words[ri];
        decoy = createDecoy(15);

        answer = askWord+"##########";

        while (!answer.equals(askWord)) {
            System.out.println("Слово загадано, попробуйте угадать загаданное слово:");

            ansWord = sc.nextLine();

            for (int i = 0; i < ansWord.length(); i++) {
                if (answer.charAt(i) == ansWord.charAt(i)) {
                    decoy[i] = ansWord.charAt(i);
                }
            }
            System.out.println("Ваше слово: " + ansWord);

            if (ansWord.equals(askWord)) {
                System.out.println("Поздравляем, загаданное слово - " + ansWord);
            } else {
                System.out.println("Вы угадали: " + String.valueOf(decoy) + " буквы");
            }
            answer = createAnswer(String.valueOf(decoy));
        }
    }

    public static char[] createDecoy(int i) {
        char[] decoy = new char[i];

        for (int c = 0; c < i; c++) {
            decoy[c] = '#';
        }
        return decoy;
    }

    public static String createAnswer(String decoy){
        String answer;
        char[] tmp_answ = new char[askWord.length()];
        for (int i=0; i<askWord.length();i++){
            tmp_answ[i] = decoy.charAt(i);
        }
        answer = String.valueOf(tmp_answ);
        return answer;
    }
}
