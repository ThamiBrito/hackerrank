import java.io.*;
import java.util.*;

public class Solution {
    public static void printDivider() {
        System.out.println("================================");    
    }
            
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int justifiedLength = 15;
            
            printDivider();
            
            for(int i=0;i<3;i++){
                String str = sc.next();
                int digit = sc.nextInt();
        
                int whitespaceLength = justifiedLength - str.length();
                
                String paddedDigit = String.format("%03d", digit);
                System.out.println(str + " ".repeat(whitespaceLength) + paddedDigit);
            }
            
            printDivider();

    }
}
