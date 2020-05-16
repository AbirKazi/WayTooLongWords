import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        ArrayList<String> words = new ArrayList<String>();
        String word;

        System.out.print("How many words do you want to check?: ");
        num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print("Please enter word number " + i + ": ");
            word = in.next();
            words.add(word);
        }

        checkIfWordsTooLong(words);

    }

    static void checkIfWordsTooLong(ArrayList<String> words) {
        int length;
        char firstLetter;
        char lastLetter;
        
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() > 4) {
                length = words.get(i).length() - 2;
                firstLetter = words.get(i).charAt(0);
                lastLetter = words.get(i).charAt(words.get(i).length() - 1);
                String word = firstLetter + Integer.toString(length) + lastLetter;
                words.set(i, word);

            }
        }

        for (String word : words) {
            System.out.println(word);
        }

    }
}
