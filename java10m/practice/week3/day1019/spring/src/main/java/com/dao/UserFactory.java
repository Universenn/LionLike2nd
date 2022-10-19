package com.dao;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// spring-boot-start-jdbc 추가 후 사용 가능
@Configuration
public class UserFactory {

    // 조립을 해준다.?
    @Bean
    public UserDao awsUserDao(){
        AwsConnectionMaker awsConnectionMaker = new AwsConnectionMaker();
        UserDao userDao = new UserDao();
        return userDao;
    }
    @Bean
    public UserDao localUserDao(){
        LocalConnectionMaker localConnectionMaker = new LocalConnectionMaker();
        UserDao userDao = new UserDao();
        return userDao;
    }


}
