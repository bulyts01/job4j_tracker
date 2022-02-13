package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Bulytov Semen Arkadievich");
        student.setGroup("IKT");
        student.setReceipt(new Date());
        System.out.println(student.getFullName() + " studying in a group " + student.getGroup()
                + " " + student.getReceipt());
    }
}
