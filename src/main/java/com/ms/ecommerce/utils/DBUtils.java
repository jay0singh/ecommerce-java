package com.ms.ecommerce.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        Properties properties = loadPropertyFile();
        if (properties != null) {
            //getting the connection object
            connection =  DriverManager.getConnection
                    (properties.getProperty("app.db.url"),
                            properties.getProperty("app.db.username"),
                            properties.getProperty("app.db.password"));

            return connection;
        }

        //connection = DriverManager.getConnection();

        return null;
    }

    public static void closeConnection(){

    }

    private static Properties loadPropertyFile(){
        Properties properties = null;
        try (InputStream inputStream = DBUtils.class.getClassLoader().getResourceAsStream("application.properties")){
            properties= new Properties();
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }

    public static void main(String[] args) {
//        Properties properties = DBUtils.loadPropertyFile();
//        System.out.println(properties);
        try {
            Connection connection = DBUtils.getConnection();
            if (connection != null) {
                System.out.println("Connected");
                System.out.println(connection);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
