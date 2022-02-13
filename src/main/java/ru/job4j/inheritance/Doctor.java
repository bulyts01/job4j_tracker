package ru.job4j.inheritance;

public class Doctor extends Profession {

    private int district;

    public Doctor(String name, String surname, String education, String birthday, int district) {
        super(name, surname, education, birthday);
        this.district = district;
    }

    public int getDistrict() {
        return this.district;
    }
}
