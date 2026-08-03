package Activity;

import java.util.Scanner;

class Calculator {
    double a, b;
    char op;

    Calculator(double a, double b, char op) {
        this.a = a;
        this.b = b;
        this.op = op;
    }

    void calculate() {
        switch (op) {
            case '+':
                System.out.println("Result = " + (a + b));
                break;

            case '-':
                System.out.println("Result = " + (a - b));
                break;

            case '*':
                System.out.println("Result = " + (a * b));
                break;

            case '/':
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Cannot divide by zero.");
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+,-,*,/): ");
        char op = sc.next().charAt(0);

        Calculator obj = new Calculator(a, b, op);
        obj.calculate();

        sc.close();
    }
}
