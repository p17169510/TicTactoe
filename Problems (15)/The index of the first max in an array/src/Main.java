import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for( int i=0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int indexMax = 0;

        for(int i = 1; i < arr.length; i++) {
            if (arr[indexMax] < arr[i]) {
                indexMax = i;
            }
        }
        System.out.println(indexMax);
    }
}