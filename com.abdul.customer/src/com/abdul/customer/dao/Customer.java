package com.abdul.customer.dao;


public class Customer {
    private int id;
    private String name;
    private byte age;
    private short income;

    public Customer(int id, String name, byte age, short income) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.income = income;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public short getIncome() {
        return income;
    }

    public void setIncome(short income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", income=" + income +
                '}';
    }
}
