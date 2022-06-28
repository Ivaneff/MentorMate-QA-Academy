package OOP;

public class MainEmployee {
    public static void main(String[] args) {
        Employee pesho = new Employee(10, "Petar","Stoyanov",1250.68);
        System.out.println(pesho.toString());

        pesho.raiseSalary();
        System.out.println(pesho.toString());
    }
}
