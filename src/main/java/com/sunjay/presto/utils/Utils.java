package com.sunjay.presto.utils;

import org.springframework.context.annotation.Bean;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opencsv.CSVWriter;

public class Utils {
    public static void writeAsCsv(ResultSet resultSetObject) {
        try (CSVWriter writer = new CSVWriter(new FileWriter("result.csv"));) {
            System.out.println("=== Started SQL ===");
            Class.forName("com.ibm.db2.jcc.DB2Driver");

            writer.writeAll(resultSetObject, true);
        } catch (SQLException | ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
