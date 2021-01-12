package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                if (VerticalWin(board, i) || HorizontalWin(board, i)) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean VerticalWin(int[][] board, int row) {
        boolean rsl = true;
       for (int i = 0; i < board[row].length; i++)
           if (board[i][row] != 1) {
               rsl = false;
               break;
           }
        return rsl;
    }

    public static boolean HorizontalWin(int[][] board, int column) {
        boolean rsl = true;
        for (int i = 0; i < board[column].length; i++) {
            if (board[column][i] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
