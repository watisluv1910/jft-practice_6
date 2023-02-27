package org.app.prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeTest {

    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter Employee Id: ");
        int id=Integer.parseInt(br.readLine());

        System.out.print("\nEnter Employee Name: ");
        String name=br.readLine();

        System.out.print("\nEnter Employee Designation: ");
        String designation=br.readLine();

        System.out.print("\nEnter Employee Address: ");
        String address=br.readLine();

        System.out.print("\nEnter Employee Salary: ");
        double salary= Double.parseDouble(br.readLine());

        Employee employee1 = 
                new Employee(
                        id,
                        name,
                        designation,
                        salary,
                        address
                );

        employee1.show();
        Employee employee2 = (Employee) employee1.getClone();
        employee2.show();
    }
}
