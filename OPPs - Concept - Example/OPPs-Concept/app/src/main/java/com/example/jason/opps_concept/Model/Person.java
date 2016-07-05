package com.example.jason.opps_concept.Model;

/**
 * Created by jason on 04/07/2016.
 */
public abstract class Person {
    public String Name;
    public String Sex;
    public int Age;

    public Person(String name, String sex, int age) {
        Name = name;
        Sex = sex;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public abstract float getPayroll();
}
