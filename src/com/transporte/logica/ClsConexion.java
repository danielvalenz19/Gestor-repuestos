/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.transporte.logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author hetzo
 */
public class ClsConexion {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "Daniel12";
    private static final String URL = "jdbc:mysql://localhost:3306/transporte?autoReconnect=true&useSSL=false";// hay  que cambiar la direccion de base de datos 
    private Connection CN;

    public ClsConexion() {
        CN = null;
    }

    /**
     * establece coenxion a la base de datos
     *
     * @return
     */
    public Connection getConnection() {
        try {
            Class.forName(DRIVER);
            CN = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "error al conectar con la base de datos", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return CN;
    }

    /**
     * cierra las conexiones de la base de datos
     */
    public void close() {
        try {
            CN.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al cerrrar la conexion de la base de datos ", JOptionPane.ERROR_MESSAGE);

        }
    }

}
