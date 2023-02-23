import java.util.Objects;

public class Employee {
    private String fio;
    private int department;
    private float salary;

    private static int counter;
    private int id;


    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Employee(String fio, int department, float salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Float.compare(employee.salary, salary) == 0 && id == employee.id && Objects.equals(fio, employee.fio);
    }

    public String getFio() {
        return fio;
    }
}


