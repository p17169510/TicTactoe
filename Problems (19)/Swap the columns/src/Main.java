import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int mixCol1 = sc.nextInt();
        int mixCol2 = sc.nextInt();

        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                if (j == mixCol1) {
                    int temp = arr[i][mixCol1];
                    arr[i][mixCol1] = arr[i][mixCol2];
                    arr[i][mixCol2] = temp;
//                }
//            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}