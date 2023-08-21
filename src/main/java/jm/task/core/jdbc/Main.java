package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserService USER_SERVICE = new UserServiceImpl();

    public static void main(String[] args) {

        USER_SERVICE.createUsersTable();
        USER_SERVICE.saveUser("111", "11", (byte) 22);
        USER_SERVICE.saveUser("222", "12", (byte) 12);
        USER_SERVICE.saveUser("333", "13", (byte) 122);
        USER_SERVICE.saveUser("444", "14", (byte) 23);
        USER_SERVICE.saveUser("MAMA", "15", (byte) 73);
        USER_SERVICE.saveUser("Sahka", "16", (byte) 3);

        USER_SERVICE.removeUserById(2);
        USER_SERVICE.getAllUsers();
        USER_SERVICE.cleanUsersTable();
        USER_SERVICE.dropUsersTable();


    }
}