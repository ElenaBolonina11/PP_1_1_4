package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserService US = new UserServiceImpl();

    public static void main(String[] args) {

        US.createUsersTable();
        US.saveUser("Alex", "Kalin", (byte) 22);
        US.saveUser("Ale1", "Kalitkin", (byte) 12);
        US.saveUser("Al2", "Kaninin", (byte) 122);
        US.saveUser("A1", "Kal", (byte) 23);
        US.removeUserById(2);
        US.getAllUsers();
        US.cleanUsersTable();
        US.dropUsersTable();




    }
}