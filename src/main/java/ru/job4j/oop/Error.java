package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Active Error: " + active);
        System.out.println("Status Error: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error errorDef = new Error();
        errorDef.printInfo();
        Error errorHigh = new Error(true, 5, "High temperature");
        errorHigh.printInfo();
        Error errorCritical = new Error(true, 10, "Critical temperature");
        errorCritical.printInfo();
    }

}
