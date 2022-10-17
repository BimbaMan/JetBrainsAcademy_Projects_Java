package tictactoe;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        char[][] field = new char[3][3];

        System.out.print("> ");
        Scanner scan = new Scanner(System.in);
        String buffer = scan.next();
        scan.close();
        if (buffer.length() != 9){
            System.out.println("Incorrect length");
            exit(1);
        }else if(!buffer.matches("[X,O,_]+")){
            System.out.println("Incorrect input");
            exit(2);
        }else{
            int charAtNumber = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    field[i][j] = buffer.charAt(charAtNumber);
                    charAtNumber++;
                }
            }
            output(field);
        }
    }

    public static void output(char[][] field){
        System.out.println("---------");
        for (int i = 0; i < 3; i++){
            System.out.print("| ");
            for (int j = 0; j <3; j++){
                System.out.printf("%c ", field[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }
}
