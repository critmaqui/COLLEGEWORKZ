import java.util.Scanner;
public class FINALPROJ2 {

    // Constants for the game board dimensions
    public static final int ROWS = 6;
    public static final int COLUMNS = 7;

    // 2D array to represent the game board
    public static char[][] board = new char[ROWS][COLUMNS];

    // Variables to track the current player and game state
    public static char currentPlayer = 'R';
    public static boolean gameWon = false;

    // Scanner object to read user input
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize the game board
        initializeBoard();

        // Print the game board
        printBoard();

        // Play the game
        playGame();
    }

    // Initialize the game board
    public static void initializeBoard() {
        // Loop through each row
        for (int i = 0; i < ROWS; i++) {
            // Loop through each column
            for (int j = 0; j < COLUMNS; j++) {
                // Set the current element to be empty
                board[i][j] = ' ';
            }
        }
    }

    // Print the game board
    public static void printBoard() {
        // Loop through each row
        for (int i = 0; i < ROWS; i++) {
            // Loop through each column
            for (int j = 0; j < COLUMNS; j++) {
                // Print the current element
                System.out.print(board[i][j]);

                // Print a space after each element
                System.out.print(" ");
            }

            // Print a new line after each row
            System.out.println();
        }
    }

    // Play the game
    public static void playGame() {
        // Loop until the game is over
        while (!gameWon) {
            // Get the column to drop the piece in
            int column = getColumn();

            // Drop the piece in the column
            dropPiece(column);

            // Print the game board
            printBoard();

            // Check if the game is over
            checkGameOver();

            // Switch the current player
            switchPlayer();
        }
    }

    // Get the column to drop the piece in
    public static int getColumn() {
        // Prompt the user for a column
        System.out.print("Player " + currentPlayer + ", enter a column: ");

        // Get the column from the user
        int column = input.nextInt();

        // Return the column
        return column;
    }

    // Drop the piece in the column
    public static void dropPiece(int column) {
        // Loop through each row
        for (int i = ROWS - 1; i >= 0; i--) {
            // Check if the current element is empty
            if (board[i][column] == ' ') {
                // Set the current element to the current player
                board[i][column] = currentPlayer;

                // Exit the loop
                break;
            }
        }
    }

    // Check if the game is over
    public static void checkGameOver() {
        // Check if the game is won
        if (checkWin()) {
            // Print a message
            System.out.println("Player " + currentPlayer + " wins!");

            // Set the game to be won
            gameWon = true;
        }

        // Check if the game is a draw
        if (checkDraw()) {
            // Print a message
            System.out.println("The game is a draw!");

            // Set the game to be won
            gameWon = true;
        }
    }

    // Check if the game is won
    public static boolean checkWin() {
        // Check if there are four in a row horizontally
        if (checkHorizontalWin()) {
            return true;
        }

        // Check if there are four in a row vertically
        if (checkVerticalWin()) {
            return true;
        }

        // Check if there are four in a row diagonally
        if (checkDiagonalWin()) {
            return true;
        }

        // The game is not won
        return false;
    }

    // Check if there are four in a row horizontally
    public static boolean checkHorizontalWin() {
        // Loop through each row
        for (int i = 0; i < ROWS; i++) {
            // Loop through each column
            for (int j = 0; j < COLUMNS - 3; j++) {
                // Check if the current player has four in a row horizontally
                if (board[i][j] == currentPlayer && board[i][j + 1] == currentPlayer && board[i][j + 2] == currentPlayer && board[i][j + 3] == currentPlayer) {
                    return true;
                }
            }
        }

        // There are not four in a row horizontally
        return false;
    }

    // Check if there are four in a row vertically
    public static boolean checkVerticalWin() {
        // Loop through each row
        for (int i = 0; i < ROWS - 3; i++) {
            // Loop through each column
            for (int j = 0; j < COLUMNS; j++) {
                // Check if the current player has four in a row vertically
                if (board[i][j] == currentPlayer && board[i + 1][j] == currentPlayer && board[i + 2][j] == currentPlayer && board[i + 3][j] == currentPlayer) {
                    return true;
                }
            }
        }

        // There are not four in a row vertically
        return false;
    }

    // Check if there are four in a row diagonally
    public static boolean checkDiagonalWin() {
        // Loop through each row
        for (int i = 0; i < ROWS - 3; i++) {
            // Loop through each column
            for (int j = 0; j < COLUMNS - 3; j++) {
                // Check if the current player has four in a row diagonally
                if (board[i][j] == currentPlayer && board[i + 1][j + 1] == currentPlayer && board[i + 2][j + 2] == currentPlayer && board[i + 3][j + 3] == currentPlayer) {
                    return true;
                }
            }
        }

        // Loop through each row
        for (int i = 0; i < ROWS - 3; i++) {
            // Loop through each column
            for (int j = 3; j < COLUMNS; j++) {
                // Check if the current player has four in a row diagonally
                if (board[i][j] == currentPlayer && board[i + 1][j - 1] == currentPlayer && board[i + 2][j - 2] == currentPlayer && board[i + 3][j - 3] == currentPlayer) {
                    return true;
                }
            }
        }

        // There are not four in a row diagonally
        return false;
    }

    // Check if the game is a draw
    public static boolean checkDraw() {
        // Loop through each row
        for (int i = 0; i < ROWS; i++) {
            // Loop through each column
            for (int j = 0; j < COLUMNS; j++) {
                // Check if the current element is empty
                if (board[i][j] == ' ') {
                    // The game is not a draw
                    return false;
                }
            }
        }

        // The game is a draw
        return true;
    }

    // Switch the current player
    public static void switchPlayer() {
        // Check if the current player is red
        if (currentPlayer == 'R') {
            // Set the current player to be yellow
            currentPlayer = 'Y';
        } else {
            // Set the current player to be red
            currentPlayer = 'R';
        }
    }
}
