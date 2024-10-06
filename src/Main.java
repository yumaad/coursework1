public class Main {
    public static EmployeeBook employeeBook = new EmployeeBook();

    public static void main(String[] args) {
        initializeEmployees();
        employeeBook.showEmployeesData();

        showChanges();
    }

    public static void initializeEmployees()
    {
        employeeBook.addEmployee(new Employee("Доржиева Юмжана Эрдэнеевна", 1, 30000));
        employeeBook.addEmployee(new Employee("Жамбалдоржиева Сэсэг Зоригтоевна", 1, 35000));
        employeeBook.addEmployee(new Employee("Андреев Владимир Борисович", 2, 37000));
        employeeBook.addEmployee(new Employee("Андреева Дарья Борисовна", 3, 52500));
        employeeBook.addEmployee(new Employee("Жамбалдоржиев Мэргэн Зоригтоевич", 4, 40000));
        employeeBook.addEmployee(new Employee("Иванов Сергей Павлович", 4, 27000));
        employeeBook.addEmployee(new Employee("Павлов Иван Сергеевич", 1, 12500));
        employeeBook.addEmployee(new Employee("Сергеев Павел Иванович", 2, 80000));
        employeeBook.addEmployee(new Employee("Иванов Павел Сергеевич", 5, 72500));
        employeeBook.addEmployee(new Employee("Сергеев Иван Павлович", 5, 43000));
    }

    public static void showChanges() {
        System.out.println("\nСЛОЖНЫЙ УРОВЕНЬ\n");
        int id = 5;
        System.out.println("Удаляем сотрудника с id = " + id + ": " + employeeBook.getEmployeeById(id));
        employeeBook.removeEmployee(id);

        System.out.println("\nСписок сотрудников после удаления сотрудника");
        employeeBook.printAllEmployees();
    }
}