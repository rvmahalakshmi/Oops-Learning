
package ExceptionHandlingsPractice;

import java.util.*;

class program1 {
    void m1(Scanner sc) {
        while (true) {
            try {
                System.out.println("Enter a number");
                int m = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter valid number");
                sc.next();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        program1 p = new program1();
        p.m1(sc);
    }
}