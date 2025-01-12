//백준 1330
package Week1;

import java.util.Scanner;

public class ConditionalStatementPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a>b) System.out.println('>');
        else if (a<b) System.out.println('<');
        else System.out.println("==");
    }
}
