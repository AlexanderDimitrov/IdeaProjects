package SoftwareUniversity;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void FillTheMatrix(int[][] matrix){
        Random rndm = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = rndm.nextInt(5);
            }
        }
    }
    public static int IsFlagged(int n){
        n=5;
        return n;
    }
    public static void main(String[] args) {
	    Scanner console = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        FillTheMatrix(matrix);
        System.out.println("Player 1 Turn :) ");
        System.out.println("Choose Your Starting position withing the matrix[0-4][0-4]: ");
        System.out.print("Input the numbers separated with a space: ");
        String[] input = console.nextLine().split(" ");
        int[] position = new int[2];
        position[0] = Integer.parseInt(input[0]);
        position[1] = Integer.parseInt(input[1]);
        Player playerOne = new Player(position,0);
        playerOne.Points(matrix,position);
        int counter = 0;
        boolean flags = true;
        while(flags==true){
            System.out.println("Choose your direction with words[up,down,left,right]: ");
            String move = console.nextLine();
            switch(move){
                 case "up":
                     playerOne.Up() ;
                     position[0] =position[0]-1;
                     playerOne.Points(matrix,position);
                     System.out.printf("Your current position : [%d,%d]",position[0]  ,position[1]);
                     System.out.println();

                    break;
                case "down":
                    playerOne.Down();
                    position[0] = position[0]+1;
                    playerOne.Points(matrix,position);
                    System.out.printf("Your current position : [%d,%d]",position[0]  ,position[1]);
                    System.out.println();
                    break;
                case "left":
                    playerOne.Left();
                    position[1] = position[1] -1;
                    playerOne.Points(matrix,position);
                    System.out.printf("Your current position : [%d,%d]",position[0]  ,position[1]);
                    System.out.println();
                    break;
                case "right":
                    playerOne.Rigght();
                    position[1] = position[1] + 1;
                    playerOne.Points(matrix,position);
                    System.out.printf("Your current position : [%d,%d]",position[0]  ,position[1]);
                    System.out.println();
                    break;

            }
            counter++;
            if(counter ==5){
                flags=false;
            }
        }
        System.out.println();
        System.out.println("Player 2 Turn: :)");
        input = console.nextLine().split(" ");
        position[0] = Integer.parseInt(input[0]);
        position[1] = Integer.parseInt(input[1]);
        Player playerTwo = new Player(position,0);
        playerTwo.Points(matrix,position);
        counter = 0;
        flags = true;
        while(flags==true){
            System.out.println("Choose your direction with words[up,down,left,right]: ");
            String move = console.nextLine();
            switch(move){
                case "up":
                    playerTwo.Up() ;
                    position[0] =position[0]-1;
                    playerTwo.Points(matrix,position);
                    System.out.printf("Your current position : [%d,%d]",position[0]  ,position[1]);
                    System.out.println();

                    break;
                case "down":
                    playerTwo.Down();
                    position[0] = position[0]+1;
                    playerTwo.Points(matrix,position);
                    System.out.printf("Your current position : [%d,%d]",position[0]  ,position[1]);
                    System.out.println();
                    break;
                case "left":
                    playerTwo.Left();
                    position[1] = position[1] -1;
                    playerTwo.Points(matrix,position);
                    System.out.printf("Your current position : [%d,%d]",position[0]  ,position[1]);
                    System.out.println();
                    break;
                case "right":
                    playerTwo.Rigght();
                    position[1] = position[1] + 1;
                    playerTwo.Points(matrix,position);
                    System.out.printf("Your current position : [%d,%d]",position[0]  ,position[1]);
                    System.out.println();
                    break;

            }
            counter++;
            if(counter ==5){
                flags=false;
            }
        }
        System.out.println();
        System.out.println("Player One points : ");
        playerOne.PrintPoints();
        System.out.println("Player Two points : ");
        playerTwo.PrintPoints();
    }


}
