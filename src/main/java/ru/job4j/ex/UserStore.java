package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (int i = 0; i < users.length; i++) {
            if (login.equals(users[i].getUsername())) {
                user = users[i];
                break;
            }
        }
            if (user == null) {
                throw new UserNotFoundException("User not found");
            }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("User not validate");
        }
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Length Username less 3");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Semen Bulytov", true)
        };
        try {
            validate(users[0]);
            findUser(users, "Semen Bulytov");
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
