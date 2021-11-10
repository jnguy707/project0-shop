package org.example.model;

public class Employee{
    private int id;
    private String username;
    private String password;
    private boolean isManager;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isManager(){
        return isManager;
    }

    public void setManager(boolean manager) {
        this.isManager = manager;
    }
}
