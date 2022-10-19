package com.dao;

import com.domain.User;

import java.sql.*;
import java.util.Map;

public class UserDao {
    public void add(User user) throws SQLException {
        Map<String, String> env = System.getenv();
        Connection c = DriverManager.getConnection(
          env.get("DB_HOST"),env.get("DB_USER"),env.get("DB_PASSWORD")
        );

        // Query 문 작성
        PreparedStatement ps = c.prepareStatement(
                "INSERT INTO users(id,name,password) values (?,?,?);");
        ps.setString(1,user.getId());
        ps.setString(2,user.getName());
        ps.setString(3,user.getPassword());

        ps.executeUpdate();
        ps.close();
        c.close();

    }
    public User findById(String id) throws SQLException {
        Map<String, String> env = System.getenv();
        Connection c = DriverManager.getConnection(
                env.get("DB_HOST"),env.get("DB_USER"),env.get("DB_PASSWORD")
        );
        PreparedStatement ps = c.prepareStatement(
                "SELECT * FROM users WHERE id = ?");
        ps.setString(1,id);

        //
        ResultSet rs = ps.executeQuery();
        rs.next();
        User user = new User(rs.getString("id"),rs.getString("name"),rs.getString("password"));

        rs.close();
        ps.close();
        c.close();

        return user;
    }

    public static void main(String[] args) {

    }
}
