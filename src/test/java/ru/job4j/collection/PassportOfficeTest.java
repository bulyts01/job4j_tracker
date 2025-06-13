package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        boolean result = office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
        assertThat(result).isTrue();
    }

    @Test
    public void whenDuplicatePassportThenFalse() {
        Citizen first = new Citizen("2f44a", "Petr Arsentev");
        Citizen second = new Citizen("2f44a", "Semen Bulytov");
        PassportOffice office = new PassportOffice();
        office.add(first);
        boolean result = office.add(second);
        assertThat(result).isFalse();
    }
}
