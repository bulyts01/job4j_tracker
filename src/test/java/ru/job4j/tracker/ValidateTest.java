package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.Validate;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.Stub;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateTest {

    @Test
    public void whenInvalidInput() {
        Output out = new Stub();
        Input in = new ru.job4j.tracker.input.Stub(
                new String[] {"one", "1"}
        );
        Validate input = new Validate(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenRightInput() {
        Output out = new Stub();
        Input in = new ru.job4j.tracker.input.Stub(
                new String[] {"2"}
        );
        Validate input = new Validate(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(2));
    }

    @Test
    public void whenRightMoreInput() {
        Output out = new Stub();
        Input in = new ru.job4j.tracker.input.Stub(
                new String[] {"2", "3"}
        );
        Validate input = new Validate(out, in);
        int selected2 = input.askInt("Enter menu:");
        assertThat(selected2, is(2));
        int selected3 = input.askInt("Enter menu:");
        assertThat(selected3, is(3));
    }

    @Test
    public void whenMinusInput() {
        Output out = new Stub();
        Input in = new ru.job4j.tracker.input.Stub(
                new String[] {"-1"}
        );
        Validate input = new Validate(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(-1));
    }

}