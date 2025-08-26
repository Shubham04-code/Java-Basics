import java.io.*;
import java.util.*;

public class LeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

	System.out.println("Enter the year: ");
        int year = sc.nextInt();
        
	//Logic
        if(year % 4 == 0 && year % 100 != 0)
        {
            System.out.println("True");
        }
        else if(year % 400 == 0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}