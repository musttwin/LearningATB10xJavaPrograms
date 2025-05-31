//Class Object & constructor concept

class Employee{
    String name;
    int id;

    Employee(String name, int id){  //
        this.name = name;
        this.id = id;
    }

    public void employeeInfo(){
        System.out.println(this.name);
        System.out.println(this.id);
    }
}

public class constructor{
    public static void main(String[] args) {
        Employee e1 = new Employee("PAMPA", 32);
        e1.employeeInfo();
    }
}