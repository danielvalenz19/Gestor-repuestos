
package com.transporte.dao;

import com.transporte.modelo.ClsConexion;
import com.transporte.modelo.Usuario;
import com.transporte.vista.FrmPrincipal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abel Díaz
 */
public class UsuarioDAO implements CRUD{
    
    private PreparedStatement ps;
    private Statement st;
    private ResultSet rs;

    private static UsuarioDAO usuarioDAO;

    private UsuarioDAO() {
    }
    
    public Usuario ValidarUsuario(String nombre, String contraseña){
        Usuario user = new Usuario();
        int resultado = 0;
        String sql= "SELECT * FROM usuario where nombre='" + nombre + "' and contraseña='" + contraseña + "'";
        try{
            st = ClsConexion.getClsConexion().getConnection().createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                resultado = 1;
                if(resultado == 1){
                }
            }
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
        return user;
    }
    
    
    
    public synchronized static UsuarioDAO getUsuarioDAO()
    {
        if(usuarioDAO==null)
        {
            usuarioDAO = new UsuarioDAO();            
        }
        return usuarioDAO;
    }

    @Override
    public int agregar(Object[] o) {
        int r=0;
        String sql="INSERT INTO usuario(nombre,contraseña)values(?,?)";
        try {
            ps=ClsConexion.getClsConexion().getConnection().prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            r=ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }

    @Override
    public List leer() {
        List<Usuario> lista = new ArrayList<>();
        String sql="SELECT * FROM usuario";
        try {
            ps = ClsConexion.getClsConexion().getConnection().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()) {
                Usuario user = new Usuario();
                user.setIdAcceso(rs.getInt(1));
                user.setNombre(rs.getString(2));
                user.setContraseña(rs.getString(3));
                lista.add(user);
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return lista;
    }

    @Override
    public int actualizar(Object[] o) {
       int r=0;
       String sql="UPDATE usuario set nombre=?, contraseña=? where idacceso=? ";
        try {
            ps=ClsConexion.getClsConexion().getConnection().prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.executeUpdate();
            r=ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
       String sql="DELETE FROM usuario WHERE idacceso= "+id;
        try {
            ps=ClsConexion.getClsConexion().getConnection().prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
