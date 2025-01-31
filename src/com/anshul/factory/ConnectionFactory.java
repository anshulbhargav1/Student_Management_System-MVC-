package com.anshul.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static Connection connection;
    static{
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/JAVA",
                    "root",
                    "anshul_MYSQL"
            );


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        return connection;
    }
}
