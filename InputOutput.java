import java.util.*;


class InputOutput {
    public static void main(String args[]) {
        // Implement Scanner Class
        Scanner sc = new Scanner(System.in);

        // Take all inputs
	System.out.println("Enter an integer value: ");
        int a = sc.nextInt();

	System.out.println("Enter a floating point value: ");
        float b = sc.nextFloat();

	System.out.println("Enter a long integer value: ");
        long c = sc.nextLong();

	sc.nextLine();
	System.out.println("Enter a string value: ");
        String s = sc.nextLine();

        // Print all the values
	System.out.println("Now output of all the input values: ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        
    
        
    }
}