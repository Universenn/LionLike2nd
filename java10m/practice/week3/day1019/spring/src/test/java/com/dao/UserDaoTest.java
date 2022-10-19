package com.dao;

import com.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    @Test
    void addAndSelect() throws SQLException {
        UserDao userDao = new UserDao();
        String id = "3";

        User user = new User(id, "juwan","qweqwrqwr22");
        userDao.add(user);

        User selectedUser = userDao.findById(id);

        Assertions.assertEquals("juwan",selectedUser.getName());
    }
}