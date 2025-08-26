import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your marks (0-100): ");
        int marks = scanner.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else if (marks >= 0) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid input! Please enter marks between 0 and 100.");
        }
    }
}
