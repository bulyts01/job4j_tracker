package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.action.*;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.Stub;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenExit() {
        Output out = new Stub();
        Input in = new ru.job4j.tracker.input.Stub(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Exit" + System.lineSeparator()
                        + "=== Exit Programm ===" + System.lineSeparator()
        ));
    }

    @Test
    public void whenReplaceItemTestOutputIsSuccessfully() {
        Output out = new Stub();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input in = new ru.job4j.tracker.input.Stub(
                new String[] {"0", String.valueOf(one.getId()), replaceName, "1"}
        );
        UserAction[] actions = new UserAction[]{
                new Replace(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Edit item" + ln
                        + "1. Exit" + ln
                        + "=== Edit item ===" + ln
                        + "Заявка изменена успешно." + ln
                        + "Menu." + ln
                        + "0. Edit item" + ln
                        + "1. Exit" +  ln
                        + "=== Exit Programm ===" +  ln
        ));
    }

    @Test
    public void whenFindAllItemTestOutputIsSuccessfully() {
        Output out = new Stub();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test2"));
        Input in = new ru.job4j.tracker.input.Stub(
                new String[] {"0", "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindAll(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Show all items" + ln
                        + "1. Exit" + ln
                        + "=== Show all items ===" + ln
                        + one + ln
                        + "Menu." + ln
                        + "0. Show all items" + ln
                        + "1. Exit" +  ln
                        + "=== Exit Programm ===" +  ln
        ));
    }

    @Test
    public void whenFindByNameItemTestOutputIsSuccessfully() {
        Output out = new Stub();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test3"));
        Input in = new ru.job4j.tracker.input.Stub(
                new String[] {"0", one.getName(), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindByName(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Find item by name" + ln
                        + "1. Exit" + ln
                        + "=== Find items by name ===" + ln
                        + one + ln
                        + "Menu." + ln
                        + "0. Find item by name" + ln
                        + "1. Exit" +  ln
                        + "=== Exit Programm ===" +  ln
        ));
    }

    @Test
    public void whenFindByIDItemTestOutputIsSuccessfully() {
        Output out = new Stub();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test4"));
        Input in = new ru.job4j.tracker.input.Stub(
                new String[] {"0", String.valueOf(one.getId()), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindById(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Find item by ID" + ln
                        + "1. Exit" + ln
                        + "=== Find ID ===" + ln
                        + one + ln
                        + "Menu." + ln
                        + "0. Find item by ID" + ln
                        + "1. Exit" +  ln
                        + "=== Exit Programm ===" +  ln
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new Stub();
        Input in = new ru.job4j.tracker.input.Stub(
                new String[] {"1", "0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = new UserAction[]{
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                        "Menu." + ln
                                + "0. Exit" + ln
                                + "Wrong input, you can select: 0 .. 0" + ln
                                + "Menu." + ln
                                + "0. Exit" + ln
                                + "=== Exit Programm ===" + ln
                )
        );
    }
}