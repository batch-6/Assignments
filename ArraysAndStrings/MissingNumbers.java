import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        int n,m;
        int siz = 10005;
        int h1[]=new int[siz];
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            h1[sc.nextInt()]++;
        }
        m=sc.nextInt();
        for(int i=0;i<m;i++){
           h1[sc.nextInt()]--;
        }
        for(int i=0;i<siz;i++){
           if(h1[i]!=0){
               System.out.print(i+" ");
           }
        }
        
    }
}
