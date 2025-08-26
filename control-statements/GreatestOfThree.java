import java.io.*;
import java.util.*;

public class GreatestOfThree {
    public static void main(String args[]) {
        // Your code here
        Scanner sc = new Scanner(System.in);

	System.out.println("Enter three number to find the greatest one: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
	System.out.print("The greatest number is: ");
        if(a > b && a > c)
        {
            System.out.println(a);
        }
        else if(b > a && b > c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
}