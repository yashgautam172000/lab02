package question2;

import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value1 = sc.next().trim();
        String value2 = sc.next().trim();
        System.out.println(value1 + " University " + value2);
        sc.close();

    }
}
