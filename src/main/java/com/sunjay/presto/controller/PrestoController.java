package com.sunjay.presto.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sunjay.presto.dao.RequestDao;
import com.sunjay.presto.utils.Utils;
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

    @PostMapping("/query")
    public String runFullPerimeterLastRatingsV1V3(@RequestBody String requestDaoJson) throws SQLException, JsonProcessingException {
        // Code to perform SELECT query on Presto database using tableName
        // ...
        String url = "jdbc:presto://<host>:<port>/<catalog>/<schema>";
        ObjectMapper objectMapper = new ObjectMapper();
        RequestDao inputObject = objectMapper.readValue(requestDaoJson, RequestDao.class);
        Connection connection = DriverManager.getConnection(url, "user", "password");
        String query = "dummy query";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        Utils.writeAsCsv(resultSet);
        return "Csv successfully generated";
    }
}
