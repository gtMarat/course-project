import java.util.Objects;

public class Employee {
    private String FIO;
    private int Department;
    private float Salary;

    private static int Counter;
    private int Id;



    public int getDepartment() {
        return Department;
    }

    public float getSalary() {
        return Salary;
    }

    public int getId() {
        return Id;
    }


    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setDepartment(int department) {
        Department = department;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }

    public Employee(String FIO, int department, float salary) {
        this.FIO = FIO;
        Department = department;
        Salary = salary;
        Id = ++Counter;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "FIO='" + FIO + '\'' +
                ", Department=" + Department +
                ", Salary=" + Salary +
                ", Id=" + Id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Department == employee.Department && Float.compare(employee.Salary, Salary) == 0 && Id == employee.Id && Objects.equals(FIO, employee.FIO);
    }

    public String getFIO() {
        return FIO;
    }
}


