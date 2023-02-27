package org.app.prototype;

public class Employee implements Prototype {

    private int id;
    private String name, designation;
    private double salary;
    private String address;

    public Employee() {
        System.out.println("""
                Employees of Oracle Corporation:
                "Eid"+"\\t"+"Ename"+"\\t"+"Edesignation"+"\\t"+"Esalary"+"\\t\\t"+"Eaddress"
                """);
    }

    public Employee(int id, String name, String designation, double salary, String address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    public void show() {
        System.out.println(this);
    }

    @Override
    public Prototype getClone() {
        return new Employee(id, name, designation, salary, address);
    }

    @Override
    public String toString() {
        return "\nEmployee {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                " }";
    }
}
