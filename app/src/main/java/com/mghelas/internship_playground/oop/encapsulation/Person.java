package com.mghelas.internship_playground.oop.encapsulation;

public class Person {

    //  public String name; wrong
    private String name;
    private String surname;
    private Integer age;
    private String origin;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", origin='" + origin + '\'' +
                '}';
    }
}
