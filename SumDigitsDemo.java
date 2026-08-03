package Activity;

import java.util.Scanner;

class SumDigits {
    int num;

    SumDigits(int num) {
        this.num = num;
    }

    void calculate() {
        int sum = 0;
        int temp = num;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}

public class SumDigitsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a four-digit number: ");
        int num = sc.nextInt();

        SumDigits obj = new SumDigits(num);
        obj.calculate();

        sc.close();
    }
}
