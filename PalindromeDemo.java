package Activity;

import java.util.Scanner;

class Palindrome {
    int num;

    Palindrome(int num) {
        this.num = num;
    }

    void check() {
        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        if (original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}

public class PalindromeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        Palindrome obj = new Palindrome(num);
        obj.check();

        sc.close();
    }
}
