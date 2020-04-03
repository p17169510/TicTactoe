import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long first = sc.nextLong();
        String operation = sc.next();
        long second = sc.nextLong();

        switch (operation) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Division by 0!");

                } else {
                    System.out.println(first / second);
                }
                break;
            default: System.out.println("Unknown operator");
        }
    }
}