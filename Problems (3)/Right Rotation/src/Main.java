import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputArr = sc.nextLine().split(" ");
        int rotation = sc.nextInt();

        String[] newArr = new String[inputArr.length];

        for (int i = 0; i < inputArr.length; i++) {
            newArr[(i + rotation) % inputArr.length] = inputArr[i];
        }

        for (String number : newArr) {
            System.out.print(number + " ");
        }

    }
}