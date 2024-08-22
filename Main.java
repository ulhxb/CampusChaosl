package CampusChaos;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to CampusChaos 2024. Enter 'help' for more details.");
        String str = scanner.nextLine();
// help
if(Objects.equals(str,"help")){
    System.out.println("help : shows all available commands");
    System.out.println("show : shows the current GameBoard");
    if(){
        System.out.println("roll dice = ");
    }

}



        int rows = 11;
        int cols = 11;
        GameBoard gameBoard = new GameBoard(rows, cols);
        gameBoard.generateField();
        if (Objects.equals(str, "show")) {
            gameBoard.displayBoard();
            str = scanner.nextLine();
        }

        if (){
            if(Objects.equals(str, "roll dice")){
                Dice.dice_roll();
            }
        }


    }
}
