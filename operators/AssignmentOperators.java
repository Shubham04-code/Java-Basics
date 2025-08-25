import java.io.*;
import java.util.*;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Initial a = " + a);

        a += 3;
        System.out.println("a += 3 → " + a);

        a -= 2;
        System.out.println("a -= 2 → " + a);

        a *= 4;
        System.out.println("a *= 4 → " + a);

        a /= 3;
        System.out.println("a /= 3 → " + a);

        a %= 5;
        System.out.println("a %= 5 → " + a);
    }
}
