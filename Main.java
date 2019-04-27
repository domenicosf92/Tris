package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int choice,column,row;
        String sign;
        BoardGame boardGame=new BoardGame();
        do {
            System.out.println("Tris game test \n0. Exit \n1. Add sign \n2. Get sign \n3. Reset board \n4. Print board status");
            System.out.println("Choice: ");
            choice=s.nextInt();
            switch (choice){
                case 0:
                    break;
                case 1:
                    System.out.println("Column: ");
                    column=s.nextInt();
                    System.out.println("Row: ");
                    row=s.nextInt();
                    System.out.println("Sign: ");
                    sign=s.next();
                    System.out.println(boardGame.setSign(column,row,sign));
                    break;
                case 2:
                    System.out.println("Column: ");
                    column=s.nextInt();
                    System.out.println("Row: ");
                    row=s.nextInt();
                    System.out.println(boardGame.getSign(column,row));
                    break;
                case 3:
                    boardGame.resetBoard();
                    break;
                case 4:
                    boardGame.printBoard();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }while (choice!=0);

    }

}
