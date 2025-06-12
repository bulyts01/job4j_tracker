package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("semen@mail.ru", "Semen Bulytov");
        hashMap.put("petr@mail.ru", "Petr Arsentiev");
        hashMap.put("stas@mail.ru", "Stas Korobeinikov");
        hashMap.put("aleksei@mail.ru", "Aleksie Alekseev");
        hashMap.put("ivan@mail.ru", "Ivan Ivanov");
        hashMap.put("semen@mail.ru", "New Semen Bulytov duplicate");

        for (String key : hashMap.keySet()) {
            System.out.println(key + " = " + hashMap.get(key));
        }
    }
}
