package com.example.jason.opps_concept.Model;

/**
 * Created by jason on 04/07/2016.
 */
public class Staff extends Person implements iPayroll {
    private float Salary_coefficients;
    private float Salary;

    public Staff(String name, String sex, int age, float salary_coefficients, float salary) {
        super(name, sex, age);
        Salary_coefficients = salary_coefficients;
        Salary = salary;
    }

    public float getSalary_coefficients() {
        return Salary_coefficients;
    }

    public void setSalary_coefficients(float salary_coefficients) {
        Salary_coefficients = salary_coefficients;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }

    @Override
    public float Payroll(float salary_coefficients) {
        return getSalary_coefficients() * getSalary();
    }
}
