import java.io.*;
import java.util.*;

public class Solution {
    public static void printDivider() {
        System.out.println("================================");    
    }
            
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            printDivider();
            
            for(int i=0;i<3;i++){
                String str = sc.next();
                int digit = sc.nextInt();
                int justifiedLength = 15;
                int strLength = str.length();
                int whitespaceLength = justifiedLength - strLength;
                
                String paddedDigit = String.format("%03d", digit);
                System.out.println(str + " ".repeat(whitespaceLength) + paddedDigit);
            }
            printDivider();

    }
}
