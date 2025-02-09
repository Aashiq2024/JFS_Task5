package JFS_Task;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class BirthdateCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birthdate (YYYY-MM-DD): ");
        String birthDateInput = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(birthDateInput);

        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate, currentDate).getYears();

        System.out.println("Your age is: " + age + " years");

        scanner.close();
    }
}

