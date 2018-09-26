package com.mghelas.internship_playground.oop.abstraction;

public class MysqlConnection extends DatabaseConnection {
    @Override
    public void getDbDriver() {
        System.out.println("getting driver...");
    }

    @Override
    public void connect() {
        System.out.println("performing connection");
    }
}
