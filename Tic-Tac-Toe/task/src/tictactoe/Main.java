package tictactoe;

import java.util.Scanner;

public class Main {
    //заполнение массива данными, введенными с клавиатуры в одной строке
    public static void fillingArrInLineFromKeyboard(char[][] array) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    array[i][j] = input.charAt(n);
                    n++;
                }
            }
        }

    //заполнение массива данными, введенными с клавиатуры в одной строке
    public static void clearArr(char[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = '_';
            }
        }
    }

    //вывод масссива в виде красивой таблички
    public static void printArray (char[][] array) {
        System.out.println("---------");
        for ( int i = 0; i < 3; i++) {
            System.out.print("| ");
            for ( int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }


    //подсчет количества повторений определенного символа, итерируясь по массиву
    public static int countingChars ( char inpChar, char array[][]) {
        int counter = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if (array[i][j] == inpChar) {
                    counter++;
                }
            }
        }
        return counter;
    }

    //проверка на невозможность
//    public static boolean checkImpossible (char array[][]) {
//        boolean isImpossible = false;
//        if (win('X', array) && win('O', array) || Math.abs(countingChars('X', array) - countingChars('O', array)) > 1) {
//            isImpossible = true;
//        }
//        return isImpossible;
//    }

    //проверка, победил ли нолик или крестик
    public static boolean win (char inp, char array[][]) {
        boolean isWin = false;
        int j = 0;
        for (int i = 0; i < 3; i++) {
            if (array[i][j] == inp && array[i][j] == array[i][j + 1] && array[i][j] == array[i][j + 2]) {
                isWin = true;
            }
            else if (array[j][i] == inp && array[j][i] == array[j + 1][i] && array[j][i] == array[j + 2][i]) {
                isWin = true;
            }
        }
        if (array[0][0] == inp && array[0][0] == array[1][1] && array[0][0] == array[2][2] ||
        array[0][2] == inp && array[0][2] == array[1][1] && array[0][2] == array[2][0]) {
            isWin = true;
        }

        return isWin;
    }

    //Stage 4/5: First move! Метод, заполняющий крестик в указанную пользователем точку координат
    public static void usersMove(char array[][]) {

        Scanner sc = new Scanner(System.in);
        int first, second;
        do {
            System.out.print("Enter the coordinates: ");
            if (sc.hasNextInt()) {
                first = sc.nextInt();
                second = sc.nextInt();

                if(first > 3 || second > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    sc.nextLine();
                    continue;
                }

                if (array[3 - second][first - 1] != '_') {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                }
                break;
            }
            else {
                System.out.println("You should enter numbers!");
                if (!sc.hasNextInt()) {
                    sc.nextLine();
                    continue;
                }
                sc.nextLine();
            }
        } while (true);

        if (countingChars('X', array) <= countingChars('O', array)) {
            array[3 - second][first - 1] = 'X';
        } else {
            array[3 - second][first - 1] = 'O';
        }

    }


    //gh
    public static boolean theGameIsFinished(char array[][]) {
        boolean isFinished = false;

        if (win('X', array)) {
            System.out.println("X wins");
            isFinished = true;

        }
        else if (win('O', array)) {
            System.out.println("O wins");
            isFinished = true;
        }
        else if (countingChars('_', array) == 0) {
            System.out.println("Draw");
            isFinished = true;
        }

        return isFinished;
    }

    public static void main(String[] args) {
        char[][] arr = new char[3][3];

        clearArr(arr);
        printArray(arr);

        while (!theGameIsFinished(arr)) {
            usersMove(arr);
            printArray(arr);
        }










 //       var diff = Math.abs(countingChars('X', arr) - countingChars('O', arr));


//        if (countingChars('_', arr) != 0 && !checkImpossible(arr) && !win('X', arr) && !win('O', arr)) {
//            System.out.println("Game not finished");
//        }
//        if (checkImpossible(arr)) {
//            System.out.println("Impossible");
//        }







    }
}
