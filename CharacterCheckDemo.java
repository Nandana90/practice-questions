package Activity;

import java.util.Scanner;

class CharacterCheck {
    char ch;

    CharacterCheck(char ch) {
        this.ch = ch;
    }

    void check() {
        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}

public class CharacterCheckDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        CharacterCheck obj = new CharacterCheck(ch);
        obj.check();

        sc.close();
    }
}
