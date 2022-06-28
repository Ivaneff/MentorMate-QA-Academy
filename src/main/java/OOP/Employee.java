package OOP;

public class Employee {
    private final int id;
    private final String firstName;
    private final String lastName;
    private double salaryPerMonth;

    public Employee(int id, String firstName, String lastName, double salaryPerMonth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryPerMonth = salaryPerMonth;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getName(){
        return this.getFirstName()+" "+this.lastName;
    }

    public double getAnnualSalary(){
        return this.getSalaryPerMonth()*12;
    }

    public void raiseSalary(){
        this.setSalaryPerMonth(this.getSalaryPerMonth()*1.2);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Name='" + getName() + '\'' +
                ", Annual salary='" + getAnnualSalary() + '\'' +
                ", salaryPerMonth=" + salaryPerMonth +
                '}';
    }
}
