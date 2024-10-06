public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = createEmployee("Доржиева Юмжана Эрдэнеевна", 1, 30000);
        employees[1] = createEmployee("Жамбалдоржиева Сэсэг Зоригтоевна", 1, 35000);
        employees[2] = createEmployee("Андреев Владимир Борисович", 2, 37000);
        employees[3] = createEmployee("Андреева Дарья Борисовна", 3, 52500);
        employees[4] = createEmployee("Жамбалдоржиев Мэргэн Зоригтоевич", 4, 40000);
        employees[5] = createEmployee("Иванов Сергей Павлович", 4, 27000);
        employees[6] = createEmployee("Павлов Иван Сергеевич", 1, 12500);
        employees[7] = createEmployee("Сергеев Павел Иванович", 2, 80000);
        employees[8] = createEmployee("Иванов Павел Сергеевич", 5, 72500);
        employees[9] = createEmployee("Сергеев Иван Павлович", 5, 43000);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

        System.out.println("\nСумма затрат на зарплату сотрудникам в месяц равна " + calculateSalary(employees));

        System.out.println("\nСотрудник с минимальной зарплатой: " + findMinimalSalary(employees));

        System.out.println("\nСотрудник с максимальной зарплатой: " + findMaximumSalary(employees));

        System.out.println("\nСредняя зарплата равна: " + countAverageSalary(employees));

        System.out.println("\nСписок сотрудников");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }
    }

    public static Employee createEmployee(String name, int department, int salary) {
        Employee employee = new Employee(name, department, salary);
        return employee;
    }

    public static int calculateSalary(Employee[] employees) {
        int result = 0;
        for (Employee employeeNew : employees) {
            if (employeeNew != null) {
                result = result + employeeNew.getSalary();
            }
        }
        return result;
    }

    public static Employee findMinimalSalary(Employee[] employees) {
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee employeeNew : employees) {
            if (employeeNew.getSalary() < min) {
                min = employeeNew.getSalary();
                employee = employeeNew;
            }
        }
        return employee;
    }

    public static Employee findMaximumSalary(Employee[] employees) {
        int max = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee employeeNew : employees) {
            if (employeeNew.getSalary() > max) {
                max = employeeNew.getSalary();
                employee = employeeNew;
            }
        }
        return employee;
    }

    public static double countAverageSalary(Employee[] employees) {
        return ((double) calculateSalary(employees) / employees.length);
    }
}