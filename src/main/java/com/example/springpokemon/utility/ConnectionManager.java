package com.example.springpokemon.utility;

import java.sql.*;

public class ConnectionManager {
    private Connection conn;

    public ConnectionManager() throws SQLException {
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemon","root","hejsa");
    }

    public Connection getConnection (){
        return this.conn;
    }

    public void closeConnection(){
        try{
            this.conn.close();
        }
        catch(Exception E){
            System.out.println("Could not close connection");
        }
    }
}
