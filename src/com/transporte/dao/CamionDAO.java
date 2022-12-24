
package com.transporte.dao;

import com.transporte.modelo.Camion;
import com.transporte.modelo.ClsConexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abel Díaz
 */
public class CamionDAO implements CRUD{
    private PreparedStatement ps;
    private Statement st;
    private ResultSet rs;
    
    private static CamionDAO camionDAO;
    
    public Camion listarId(int id){
        Camion camion = new Camion();
        String sql="SELECT * FROM camion where id=?";
        try {
            ps=ClsConexion.getClsConexion().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            while(rs.next()){
                camion.setId(rs.getInt(1));
                camion.setMatricula(rs.getString(2));
                camion.setColor(rs.getString(3));
            }
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return camion;
    }

    private CamionDAO() {
    }

    public CamionDAO(PreparedStatement ps, Statement st, ResultSet rs) {
        this.ps = ps;
        this.st = st;
        this.rs = rs;
    }

    @Override
    public int agregar(Object[] o) {
       int r=0;
        String sql="INSERT INTO camion(matricula,color)values(?,?)";
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
    public void eliminar(int id) {
        String sql="DELETE FROM camion WHERE id= "+id;
        try {
            ps=ClsConexion.getClsConexion().getConnection().prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public List leer() {
        List<Camion> lista = new ArrayList<>();
        String sql="SELECT * FROM camion";
        try {
            ps = ClsConexion.getClsConexion().getConnection().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()) {
                Camion cam = new Camion();
                cam.setId(rs.getInt(1));
                cam.setMatricula(rs.getString(2));
                cam.setColor(rs.getString(3));
                lista.add(cam);
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return lista;
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
       String sql="UPDATE camion set matricula=?, color=? where id=? ";
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
    
    public synchronized static CamionDAO getCamionDAO() {
        if (camionDAO == null) {
            camionDAO = new CamionDAO();
        }
        return camionDAO;
    }
    
    
    
    
    
}
