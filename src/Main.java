public class Main {
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        initializeEmployees();
        showEmployeesData(employees);
    }

    public static void initializeEmployees()
    {
        employees[0] = new Employee("Доржиева Юмжана Эрдэнеевна", 1, 30000);
        employees[1] = new Employee("Жамбалдоржиева Сэсэг Зоригтоевна", 1, 35000);
        employees[2] = new Employee("Андреев Владимир Борисович", 2, 37000);
        employees[3] = new Employee("Андреева Дарья Борисовна", 3, 52500);
        employees[4] = new Employee("Жамбалдоржиев Мэргэн Зоригтоевич", 4, 40000);
        employees[5] = new Employee("Иванов Сергей Павлович", 4, 27000);
        employees[6] = new Employee("Павлов Иван Сергеевич", 1, 12500);
        employees[7] = new Employee("Сергеев Павел Иванович", 2, 80000);
        employees[8] = new Employee("Иванов Павел Сергеевич", 5, 72500);
        employees[9] = new Employee("Сергеев Иван Павлович", 5, 43000);

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
        int min = employees[0].getSalary();
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
        int max = employees[0].getSalary();
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

    public static void showEmployeesData(Employee[] employees)
    {
        for (Employee employee : employees) {System.out.println(employee);}

        System.out.println("\nСумма затрат на зарплату сотрудникам в месяц равна " + calculateSalary(employees));

        System.out.println("\nСотрудник с минимальной зарплатой: " + findMinimalSalary(employees));

        System.out.println("\nСотрудник с максимальной зарплатой: " + findMaximumSalary(employees));

        System.out.println("\nСредняя зарплата равна: " + countAverageSalary(employees));

        System.out.println("\nСписок сотрудников");
        for (Employee employee : employees) {System.out.println(employee.getName());}
    }
}