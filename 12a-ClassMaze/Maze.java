import java.io.*;
import java.util.*;

public class Maze {
    private char[][] board;
    private int maxX;
    private int maxY;
    private char wall = ' ';
    private char exit = '$';
    private char exitX;
    private char exitY;
    private char path = '#';
    private char me = 'C';
    private char visited = '.';
    private boolean solved = false;
    
    private LinkedList<Node> l;
    
    public void delay(int n){
        try {
            Thread.sleep(n);
        } catch (Exception e) {}
    }
    
    public Maze() {
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
                    if (board[i][j] == exit) {
                        exitX = i;
                        exitY = j;
                    }
                }
                j++;
            }
        }
        catch (Exception e)
        {
        }
        
    }
    
    public String toString() {
        String s = "[2J\n";
        for (int y=0;y<maxY;y++)
        {
            for (int x=0;x<maxX;x++)
                s = s +board[x][y];
            s=s+"\n";
        }
        
        return s;
    }
    
    public void addToFront(int tmpX, int tmpY, Nde current) {
        Node tmp = null;
        if (board[tmpX][tmpY] == path || board[tmpX][tmpY] == exit) {
            tmp = new Node(tmpX,tmpY,current.getSpaces()+1);
            tmp.AStarSearch(26,18);
            tmp.setPrev(current);
            f.add(tmp);
        }
    }
    
    public void bestSearch(int x, int y) {
        f = new Frontier();
        f.add(new Node(x,y));
        int tmpX = 0;
        int tmpY = 0;
        Node current = null;
        while(!f.isEmpty()) {
            current = f.remove();
            int currentX = current.getX();
            int currentY = current.getY();
            if (board[currentX][currentY] == exit) {
                break;
            }
            board[currentX][currentY] = me;
            addToFront(currentX+1,currentY,current);
            addToFront(currentX-1,currentY,current);
            addToFront(currentX,currentY+1,current);
            addToFront(currentX,currentY-1,current);
            System.out.println(this);
        }
        
        for(Node p = current.getPrev(); p != null; p = p.getPrev()) {
            board[p.getX()][p.getY()] = 'P';
            System.out.println(this);
        }
    }
    
    public static void main(String[] args){
        Maze m = new Maze();
        System.out.println(m);
        m.bestSearch(1,1);
    }
    
}