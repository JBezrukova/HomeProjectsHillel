package HomeTask3;

import java.util.Scanner;

/**
 * Created by Þëÿ on 20.02.2016.
 */
public class EmailTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email adress: ");
        String email = scanner.next();
        String newEmail = email.replace("@", "[ at ]");
        newEmail = newEmail.replace(".","[ dot ]");
        System.out.println("Email with replace elements: "+newEmail);
    }
}
