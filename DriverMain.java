import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Information:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(empId, name, salary);
        System.out.println("Income Tax: $" + employee.calcTax());

        System.out.println("\nEnter Product Information:");
        System.out.print("Product ID: ");
        int pid = scanner.nextInt();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        Product product = new Product(pid, price, quantity);
        System.out.println("Sales Tax: $" + product.calcTax());
    }
}