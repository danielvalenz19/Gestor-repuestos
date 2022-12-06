/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.transporte.logica;

import com.transporte.formularios.FrmLogin;
import com.transporte.formularios.FrmPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author hetzo
 */
public class ClsLogica {

    FrmPrincipal frmPrincipal = new FrmPrincipal();
    FrmLogin frmLogin = new FrmLogin();
    public void accesoUsuario(String user, String pass) {

        ClsConexion db = new ClsConexion();
        // Se inicializa a null
        String usuarioCorrecto = null;
        String passCorrecto = null;
        try {

            Connection cn = db.getConnection();
            PreparedStatement pst = cn.prepareStatement("SELECT nombre, contraseña FROM acceso");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                usuarioCorrecto = rs.getString(1);
                passCorrecto = rs.getString(2);
            }

            if (user.equals(usuarioCorrecto) && pass.equals(passCorrecto)) {
                JOptionPane.showMessageDialog(null, "Login correcto Bienvenido usuario " + user);
                frmPrincipal.setVisible(true);

            } else if (!user.equals(usuarioCorrecto) || pass.equals(passCorrecto)) {

                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                frmLogin.setVisible(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
    }
    
    
    

}
