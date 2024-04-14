package defaultpackage;

import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
	public static void main(String[] args) {

        Employee[] employees = new Employee[7];

        employees[0] = new Manager("Jan Kowalski", 5000, 0);
        employees[1] = new Worker("Anna Nowak", 6000, "Programista");
        employees[2] = new Employee("Andrzej Kos", 5500);
        employees[3] = new Employee("Aneta Krempa", 5200);
        employees[4] = new Worker("Marian Maj", 5300, "Designer");
        employees[5] = new Manager("Janusz Kopacz", 5000, 0);
        employees[6] = new Worker("Adam Soba", 5300, "Technik");

        System.out.println("Dane dla pracownika o indeksie 3:");
        System.out.println("Imie i nazwisko: " + employees[3].getName());
        System.out.println("Wynagrodzenie: " + employees[3].getSalary());

        int nonManagerCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }

        if (employees[0] instanceof Manager) {
            ((Manager) employees[0]).setNumberOfSubordinates(nonManagerCount);
        }
        
        employees[0].setSalary(7500);
        employees[3].setSalary(5500);

        for (Employee employee : employees) {
            double newSalary = employee.getSalary() + 500;
            employee.setSalary(newSalary);
        }
        
        System.out.println("\nDane dla wszystkich pracownikow:");
        for (Employee employee : employees) {
            System.out.println(employee.toString());

        }
    }
}
