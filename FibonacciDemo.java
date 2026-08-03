package Activity;

import java.util.Scanner;

class Fibonacci {
    int n;

    Fibonacci(int n) {
        this.n = n;
    }

    void display() {
        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}

public class FibonacciDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        Fibonacci obj = new Fibonacci(n);
        obj.display();

        sc.close();
    }
}
