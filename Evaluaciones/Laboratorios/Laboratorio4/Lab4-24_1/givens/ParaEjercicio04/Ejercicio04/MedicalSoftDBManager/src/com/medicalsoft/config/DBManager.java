package com.medicalsoft.config;

import java.sql.DriverManager;
import java.sql.Connection;

public class DBManager {
    
    private Connection con;
    private static DBManager dbManager;
    private String url = "";
    private String username = "";
    private String password = "";
    
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