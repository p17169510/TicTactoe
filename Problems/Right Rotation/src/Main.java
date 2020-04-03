import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String stringToSplit = sc.nextLine();
        int inputRotation = sc.nextInt();
        int factRotation = inputRotation;

        /* making array of tokens */
        String[] array;
        array = stringToSplit.split(" ");

        /*rotated array*/
        String[] rotArray = new String[array.length];

        /* making fact rotation */
        if (inputRotation > array.length) {
            factRotation = inputRotation % array.length;
        }

        /* making rotation*/
        for (int i = 0; i < rotArray.length; i++) {
            int temp = rotArray.length - factRotation + i;

            if ( temp >= rotArray.length) {
                rotArray[i] = array[temp%rotArray.length];
            }
            else {
                rotArray[i] = array[temp];
            }

        }

        /* sout rotated array */
        for (int i = 0; i < rotArray.length; i++){
            System.out.print(rotArray[i] + " ");
        }
    }
}