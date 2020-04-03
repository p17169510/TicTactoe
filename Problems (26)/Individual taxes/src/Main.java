import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[2][n];
        int maxAcc = 0;
        int num = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < n; j++) {
                int currAcc = arr[0][j] * arr[1][j] ;
                if (currAcc > maxAcc) {
                    maxAcc = currAcc;
                    num = j + 1;
                }
        }

        System.out.println(num);
    }
}