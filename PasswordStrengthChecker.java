package task_3;
import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int length = password.length();
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } 
            else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } 
            else if (Character.isDigit(ch)) {
                hasDigit = true;
            } 
            else {
                hasSpecial = true;
            }
        }

        int score = 0;

        if (length >= 8) score++;
        if (hasUpper) score++;
        if (hasLower) score++;
        if (hasDigit) score++;
        if (hasSpecial) score++;

        if (score <= 2) {
            System.out.println("Password Strength: Weak");
        } 
        else if (score == 3 || score == 4) {
            System.out.println("Password Strength: Medium");
        } 
        else {
            System.out.println("Password Strength: Strong");
        }

        sc.close();
    }
}