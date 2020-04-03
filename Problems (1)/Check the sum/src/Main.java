import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sum20 = false;
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }


        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i] + arr[(i+1)%arr.length];
            if ( sum == 20) {
                sum20 = true;
                break;
            }
        }

        System.out.println(sum20);
    }
}