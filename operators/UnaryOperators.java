import java.io.*;
import java.util.*;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 5, b = -10;
        System.out.println("a = " + a + ", b = " + b);

        System.out.println("++a: " + (++a)); // Pre-increment
        System.out.println("a++: " + (a++)); // Post-increment
        System.out.println("Now a = " + a);

        System.out.println("--b: " + (--b)); // Pre-decrement
        System.out.println("b--: " + (b--)); // Post-decrement
        System.out.println("Now b = " + b);
    }
}
