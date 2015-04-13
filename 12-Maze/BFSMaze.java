import java.io.*;
import java.util.*;

public class BFSMaze {
    private char[][] board;
    private int maxX;
    private int maxY;
    private char wall = ' ';
    private char exit = '$';
    public myQueue q;
    private char path = '#';
    private char me = 'C';
    private char visited = '.';
    private boolean solved = false;
    
    public void delay(int n){
        try {
            Thread.sleep(n);
        } catch (Exception e) {}
    }
    
    public BFSMaze() {
        maxX=40;
        maxY=20;
        board = new char[maxX][maxY];
        
        try {
            Scanner sc = new Scanner(new File("maze.dat"));
            int j=0;
            while (sc.hasNext()) {
                String line = sc.nextLine();
                for (int i=0;i<maxX;i++) {
                    board[i][j] = line.charAt(i);
                }
                j++;
            }
        }
        catch (Exception e)
        {
        }
        
    }
    
    public String toString() {
        String s = "^[[2J\n";
        for (int y=0;y<maxY;y++)
        {
            for (int x=0;x<maxX;x++)
                s = s +board[x][y];
            s=s+"\n";
        }
        
        return s;
    }
    
    public void solve(int x, int y) {
        q = new myQueue();
        q.enqueue(board[x][y],x,y);
        while (!q.empty()){
            Node n = q.dequeue();
            board[n.getX()][n.getY()] = me;
            if (n.getData() == exit) {
                solved = true;
                System.exit(0);
            }
            if (n.getX()-1 > 0 && n.getX()-1 < maxX &&
                n.getY() > 0 && n.getY() < maxY &&
                board[n.getX()-1][n.getY()] == path) {
                q.enqueue(board[n.getX()-1][n.getY()],n.getX()-1, n.getY());
            }
            if (n.getX()+1 > 0 && n.getX()+1 < maxX &&
                n.getY() > 0 && n.getY() < maxY &&
                board[n.getX()+1][n.getY()] == path) {
                q.enqueue(board[n.getX()+1][n.getY()],n.getX()+1, n.getY());
            }
            if (n.getX() > 0 && n.getX() < maxX &&
                n.getY()-1 > 0 && n.getY()-1 < maxY &&
                board[n.getX()][n.getY()-1] == path) {
                q.enqueue(board[n.getX()][n.getY()-1],n.getX(), n.getY()-1);
            }
            if (n.getX() > 0 && n.getX() < maxX &&
                n.getY()+1 > 0 && n.getY()+1 < maxY && 
                board[n.getX()][n.getY()+1] == path) {
                q.enqueue(board[n.getX()][n.getY()+1],n.getX(), n.getY()+1);
            }
            try {
                Thread.sleep(25);
            } catch(Exception e) {}
            System.out.println(this);
        }    
    }
}