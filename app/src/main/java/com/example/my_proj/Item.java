package com.example.my_proj;

public class Item {
    public Item(String name, String position, Float salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public Float getSalary() {
        return salary;
    }

    String name;
    String position;
    Float salary;
}
