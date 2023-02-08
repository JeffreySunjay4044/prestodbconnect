package com.sunjay.presto.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@RestController
public class PrestoController {
    @PostMapping("/query")
    public String queryTable(@RequestBody String tableName) throws SQLException {
        // Code to perform SELECT query on Presto database using tableName
        // ...
        String url = "jdbc:presto://<host>:<port>/<catalog>/<schema>";
        Connection connection = DriverManager.getConnection(url, "user", "password");
        String query = "SELECT * FROM " + tableName;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        String result = "";
        while (resultSet.next()) {
            result += resultSet.getString(1) + "\t";
        }
        return result;
    }
}
