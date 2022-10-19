package com.dao;

import com.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = UserDaoTest.class)
class UserDaoTest {

//    @Autowired
//    ApplicationContext context;
//
//    @Test
//    void addAndSelect() throws SQLException {
//        UserDao userDao = context.getBean("awsUserDao", UserDao.class);
//        String id = "1";
//
//        User user = new User(id,"juwan", "110055qwe");
//        userDao.add(user);
//
//        User userSelecte = userDao.findById(id);
//        Assertions.assertEquals("juwan",userSelecte.getName());
//    }
    @Test
    void addAndSelect() throws SQLException {
        UserDao userDao = new UserDao();
        String id = "1";

        User user = new User(id, "juwan","qweqwrqwr22");
        userDao.add(user);

        User selectedUser = userDao.findById(id);

        Assertions.assertEquals("juwan",selectedUser.getName());
    }
}