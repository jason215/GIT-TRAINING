package com.example.jason.opps_concept.Model;

/**
 * Created by jason on 04/07/2016.
 */
public class Staff extends Person implements iPayroll {
    private float salaryCoefficients;
    private int salary;

    public Staff(String name, String sex, int age, float salaryCoefficients, int salary) {
        super(name, sex, age);
        this.salaryCoefficients = salaryCoefficients;
        this.salary = salary;
    }

    public float getSalaryCoefficients() {
        return salaryCoefficients;
    }

    public void setSalaryCoefficients(float salaryCoefficients) {
        this.salaryCoefficients = salaryCoefficients;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public float Payroll() {
        return getSalaryCoefficients() * getSalary();
    }

    @Override
    public float getPayroll() {
        return getSalaryCoefficients() * getSalary();
    }
}
