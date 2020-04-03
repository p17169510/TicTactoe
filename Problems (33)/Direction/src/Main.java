import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();

        do {
            switch (inp) {
                case "1":
                    System.out.println("move up");
                    inp = sc.nextLine();
                    break;
                case "2":
                    System.out.println("move down");
                    inp = sc.nextLine();
                    break;
                case "3":
                    System.out.println("move left");
                    inp = sc.nextLine();
                    break;
                case "4":
                    System.out.println("move right");
                    inp = sc.nextLine();
                    break;
                case "0":
                    System.out.println("do not move");
                    inp = sc.nextLine();
                    break;
                default:
                    System.out.println("error!");
                    inp = sc.nextLine();
            }

       } while (!inp.equals("finish"));
    }
}