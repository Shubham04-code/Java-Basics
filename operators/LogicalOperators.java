import java.io.*;
import java.util.*;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true, b = false;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a && b: " + (a && b)); // Logical AND
        System.out.println("a || b: " + (a || b)); // Logical OR
        System.out.println("!a: " + (!a));         // Logical NOT
    }
}
