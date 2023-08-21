package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserService US = new UserServiceImpl();

    public static void main(String[] args) {

        US.createUsersTable();
        US.saveUser("111", "11", (byte) 22);
        US.saveUser("222", "12", (byte) 12);
        US.saveUser("333", "13", (byte) 122);
        US.saveUser("444", "14", (byte) 23);
        US.saveUser("MAMA", "15", (byte) 73);
        US.saveUser("Sahka", "16", (byte) 3);

        US.removeUserById(2);
        US.getAllUsers();
        US.cleanUsersTable();
        US.dropUsersTable();




    }
}