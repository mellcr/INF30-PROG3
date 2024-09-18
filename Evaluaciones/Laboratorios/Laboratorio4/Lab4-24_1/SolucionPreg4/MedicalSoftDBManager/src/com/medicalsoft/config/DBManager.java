package com.medicalsoft.config;

import java.sql.DriverManager;
import java.sql.Connection;

public class DBManager {
    
    private Connection con;
    private static DBManager dbManager;
    private String url = "jdbc:mysql://" + ""
            + "prog3-labs-1inf30.cgm4akvdyvvx.us-east-1.rds.amazonaws.com"
            + ":3306/" + "laboratorio4"; //lo ult es el esquema 
    private String username = "admin";
    private String password = "labs1inf3020241";
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);     
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
    
    public static DBManager getInstance(){
        if(dbManager == null){
            createInstance();
        }
        return dbManager;
    }
    
    private synchronized static void createInstance(){
        if(dbManager == null){
            dbManager = new DBManager();
        }
    }
}