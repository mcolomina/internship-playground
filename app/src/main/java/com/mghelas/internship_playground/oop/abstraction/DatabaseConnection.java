package com.mghelas.internship_playground.oop.abstraction;

public abstract class DatabaseConnection {
    private String url = "url";
    private String user = "user";
    private String password = "password";

    abstract public void getDbDriver();

    abstract public void connect();
}
