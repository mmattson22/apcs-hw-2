import java.io.*;
import java.util.*;

public class KnightsTourPuzzle {
    private int[][] board;
    private boolean complete = false;
    //building the board
    public KnightsTourPuzzle() {
        int maxX = 9;
        int maxY = 9;
        board = new int[maxX][maxY];
        for (int y = 0; y < maxY; y++) {
            if (y < 2 || y >= maxY - 2) {
                for (int x = 0; x < maxX; x++) {
                    board[y][x] = -1;
                }
            } else {
                board[y][0] = -1;
                board[y][1] = -1;
                board[y][maxX-2] = -1;
                board[y][maxX-1] = -1;
            }
        }
    }
    
    public void solver(int x, int y, int nummoves) {
        if (board[y][x] != 0 || complete) {
            return;
        }
        board[y][x] = nummoves;
        if (nummoves == (25)) {
            complete = true;
            display();
        }//the recursion!
        solver(x+1, y+2, nummoves+1);
        solver(x+1, y-2, nummoves+1);
        solver(x+2, y+1, nummoves+1);
        solver(x+2, y-1, nummoves+1);
        solver(x-1, y+2, nummoves+1);
        solver(x-1, y-2, nummoves+1);
        solver(x-2, y+1, nummoves+1);
        solver(x-2, y-1, nummoves+1);
        if (!complete) {
            nummoves = nummoves - 1;
            board[y][x] = 0;
        }
    }
    
    
    //printing the board. tried to animate, didn't work in my terminal
    public void display() {
        for (int y = 0; y < board.length; y++){
            for (int x = 0; x < board[0].length; x++) {
                if (board[y][x] != -1) {
                    System.out.printf("[%2d]", board[y][x]);
                }
            }
            System.out.printf("\n");
        }
    }
    
    
    
    
    public static void main(String[] args){
        KnightsTourPuzzle s = new KnightsTourPuzzle();
        s.solver(2,2,1);
    }
    
}