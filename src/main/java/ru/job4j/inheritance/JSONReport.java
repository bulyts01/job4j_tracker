package ru.job4j.inheritance;

public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        String tab = "\t";
        String ln = System.lineSeparator();
        return "{" + ln + tab + "\"name\" : \"" + name + "\"," + ln
                + tab + "\"body\" : \"" + body + "\"" + ln
                + "}";
    }
}
