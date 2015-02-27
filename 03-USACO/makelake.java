import java.io.*;
import java.util.*;

public class makelake {
    static int[][] input = {{4,6,22,2},{28,25,20,32,34,36},{27,25,20,20,30,34},{27,25,20,20,30,34},{24,20,20,20,20,30},{20,20,14,14,20,20},{1,4,4},{1,1,10}};
    
    int r=input[0][0];
    int c=input[0][1];
    int e=input[0][2];
    int n=input[0][3];
    
    String test = "test";
    
    public int makeint(int x, int y){
        int ans = 0;
        ans = input[x][y];
        return ans;
    }
    
    public void stomp(int R_s, int C_s, int D_s) {
        int elevation = 0;
        for(int i = R_s; i < R_s + 3 && i <= r; i++) {
            for(int j = C_s; j < C_s + 3 && j <= c; j++) {
                if(input[i][j] > elevation) {
                    elevation = input[i][j];
                }
            }
        }
        elevation = elevation - D_s;
        for(int i = R_s; i < R_s + 3 && i <= r; i++) {
            for(int j = C_s; j < C_s + 3 && j <= c; j++) {
                if(input[i][j] > elevation) {
                    input[i][j]=elevation;
                }
            }
        }
    }
    
    
    public static void main(String[] args) {
        makelake test = new makelake();
        System.out.println(test.makeint(1,5));
        test.stomp(1,4,4);
        System.out.println(test.makeint(1,5));
    }
}