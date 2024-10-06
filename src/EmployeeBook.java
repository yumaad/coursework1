public class EmployeeBook {
    private static Employee[] employees;

    public EmployeeBook() {
        // Инициализируем массив сотрудников
        employees = new Employee[10];
    }

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                break;
            }
        }
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }


    public int calculateSalary(Employee[] employees) {
        int result = 0;
        for (Employee employeeNew : employees) {
            if (employeeNew != null) {
                result = result + employeeNew.getSalary();
            }
        }
        return result;
    }

    public Employee findMinimalSalary(Employee[] employees) {
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

    public Employee findMaximumSalary(Employee[] employees) {
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

    public double countAverageSalary(Employee[] employees) {
        return ((double) calculateSalary(employees) / employees.length);
    }

    public void showEmployeesData() {
        System.out.println("\nБАЗОВЫЙ УРОВЕНЬ \n\nСписок сотрудников:");
        printAllEmployees();

        System.out.println("\nСумма затрат на зарплату сотрудникам в месяц равна " + calculateSalary(employees));

        System.out.println("\nСотрудник с минимальной зарплатой: " + findMinimalSalary(employees));

        System.out.println("\nСотрудник с максимальной зарплатой: " + findMaximumSalary(employees));

        System.out.println("\nСредняя зарплата равна: " + countAverageSalary(employees));

        System.out.println("\nСписок сотрудников по ФИО");
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}
