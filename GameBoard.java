package CampusChaos;

public class GameBoard {
    private char[][] board;
    private int rows;
    private int cols;

    public GameBoard(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.board = new char[rows][cols];
    }

    public void generateField() {
        // Initialize all fields to ' ' (empty)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = ' ';
            }
        }

        board[0][5] = 'T';


        board[10][0] = 'a';
        board[10][3] = 'b';
        board[10][7] = 'c';
        board[10][10] = 'd';

        generatePath();
    }

    private void generatePath() {
        board[9][0] = 'P';
        board[9][3] = 'P';
        board[9][7] = 'P';
        board[9][10] = 'P';
        board[8][0] = 'P';
        board[8][1] = 'P';
        board[8][2] = 'P';
        board[8][3] = 'P';
        board[8][4] = 'P';
        board[8][6] = 'P';
        board[8][7] = 'P';
        board[8][8] = 'P';
        board[8][9] = 'P';
        board[8][10] = 'P';
        board[7][1] = 'P';
        board[7][4] = 'P';
        board[7][5] = 'P';
        board[7][6] = 'P';
        board[7][9] = 'P';
        board[6][1] = 'P';
        board[6][4] = 'P';
        board[6][6] = 'P';
        board[6][9] = 'P';
        board[5][1] = 'P';
        board[5][2] = 'P';
        board[5][3] = 'P';
        board[5][4] = 'P';
        board[5][5] = 'P';
        board[5][6] = 'P';
        board[5][7] = 'P';
        board[5][8] = 'P';
        board[5][9] = 'P';
        board[4][4] = 'P';
        board[4][6] = 'P';
        board[3][4] = 'P';
        board[3][6] = 'P';
        board[3][5] = 'P';
        board[2][5] = 'P';
        board[1][5] = 'P';

    }
    public void displayBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}