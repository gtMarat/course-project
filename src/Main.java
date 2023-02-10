public class Main {
    private static int counter;

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("FIO1", 1, 12250f);
        employee[1] = new Employee("FIO2", 2, 25320f);
        employee[2] = new Employee("FIO3", 3, 36500f);
        employee[3] = new Employee("FIO4", 4, 52000f);
        employee[4] = new Employee("FIO5", 5, 167852f);
        employee[5] = new Employee("FIO6", 1, 13567f);
        employee[6] = new Employee("FIO7", 2, 88753f);
        employee[7] = new Employee("FIO8", 3, 56478f);
        employee[8] = new Employee("FIO9", 4, 23567f);
        employee[9] = new Employee("FIO10", 5, 69875f);
        for (Employee person : employee) {
            System.out.println("person = " + person);
        }
        System.out.println("сумму затрат на зарплаты в месяц " + sumSalary(employee) + " рублей ");
        System.out.println("Минимальная зарплата у работника " + minSalary(employee) + " рублей ");
        System.out.println("Максимальная зарплата у работника " + maxSalary(employee) + " рублей ");
        System.out.println("Среднее значение зарплат в месяц " + sumSalary(employee) / employee.length + " рублей ");
        printFio(employee);


    }


    public static int sumSalary(Employee[] employee) {
        int sum = 0;
        for (Employee person : employee) {
            sum += person.getSalary();
        }
        return sum;
    }

    public static float minSalary(Employee[] employees) {
        Employee result = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < result.getSalary()) {
                result = employees[i];
            }
        }
        return result.getSalary();
    }

    public static float maxSalary(Employee[] employees) {
        Employee result = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > result.getSalary()) {
                result = employees[i];
            }
        }
        return result.getSalary();
    }

    public static void printFio(Employee[]employees){

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFIO());

        }
    }
}



