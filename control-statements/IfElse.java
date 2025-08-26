import java.io.*;
import java.util.*;

public class IfElse {
    public static void main(String args[]){
        //Code Here
        Scanner sc = new Scanner(System.in);

	System.out.println("Enter a number: ");
        int a = sc.nextInt();
        
        if(a > 100)
        {
            System.out.println("It is greater than 100");
            
        }
        else if(a < 100)
        {
            System.out.println("It is smaller than 100");
        }
        else
        {
            System.out.println("It is equal to 100");
        }
    }
    
}