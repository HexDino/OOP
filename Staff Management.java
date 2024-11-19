import java.util.Scanner;

class StaffManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEmployees = Integer.parseInt(scanner.nextLine());
        int maxSalary = Integer.parseInt(scanner.nextLine());
        int baseSalary = Integer.parseInt(scanner.nextLine());
        int initialCoefficient = Integer.parseInt(scanner.nextLine());
        int incrementCoefficient = Integer.parseInt(scanner.nextLine());

        int totalSalary = 0;

        for (int i = 0; i < numberOfEmployees; i++) {
            String name = scanner.nextLine();
            int birthYear = Integer.parseInt(scanner.nextLine());
            int yearsOfService = Integer.parseInt(scanner.nextLine());
            int salaryCoefficient = initialCoefficient + (yearsOfService / 5) * incrementCoefficient;
            int currentSalary = baseSalary * salaryCoefficient;
            if (currentSalary > maxSalary) {
                currentSalary = maxSalary;
            }
            System.out.println(name + " " + birthYear + " " + yearsOfService + " " + currentSalary);
            totalSalary += currentSalary;
        }
        System.out.println(totalSalary);

        scanner.close();
    }
}