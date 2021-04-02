import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int result = decimalToAnotherBase(n);
        System.out.println(result);
        scanner.close();
    }
    
   
    public static int decimalToAnotherBase(int n){
            int result = 0;
            int  p = 1;
            int count = 0;
            while(n > 0)
            {
                int dig = n % 2;
                n = n / 2;
                
                if (dig == 0)
                count = 0;
      
                else
                {
                    count++;//increase count
                    result = Math.max(result, count);
                }
    
        
            }
            
            return result;
            
    }
}