package com.transporte.dao;

import com.transporte.modelo.ClsConexion;
import com.transporte.modelo.Repuesto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author serho
 */
public class RepuestoDAO implements CRUD {

    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    private static RepuestoDAO repuestoDAO;
    
    public Repuesto listarId(int id){
        Repuesto rep = new Repuesto();
        String sql="SELECT * FROM repuesto where id=?";
        try {
            ps=ClsConexion.getClsConexion().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            while(rs.next()){
                rep.setId(rs.getInt(1));
                rep.setNombre(rs.getString(2));
                rep.setCantidad(rs.getInt(3));
                rep.setDescripcion(rs.getString(4));
            }
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return rep;
    }
    

    private RepuestoDAO() {
    }

    public RepuestoDAO(PreparedStatement ps, ResultSet rs) {
        this.ps = ps;
        this.rs = rs;
    }

    @Override
    public int agregar(Object[] o) {
        int r = 0;
        String sql = "INSERT INTO repuesto(nombre,cantidad,descripcion)values(?,?,?)";
        try {
            ps = ClsConexion.getClsConexion().getConnection().prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }

    public List leer() {
        List<Repuesto> lista = new ArrayList<>();
        String sql = "SELECT * FROM repuesto";
        try {
            ps = ClsConexion.getClsConexion().getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Repuesto rep = new Repuesto();
                rep.setId(rs.getInt(1));
                rep.setNombre(rs.getString(2));
                rep.setCantidad(rs.getInt(3));
                rep.setDescripcion(rs.getString(4));
                lista.add(rep);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return lista;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "UPDATE repuesto set nombre=?, cantidad=?, descripcion=? where id=? ";
        try {
            ps = ClsConexion.getClsConexion().getConnection().prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.executeUpdate();
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM repuesto WHERE id= " + id;
        try {
            ps = ClsConexion.getClsConexion().getConnection().prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public synchronized static RepuestoDAO getRepuestoDAO() {
        if (repuestoDAO == null) {
            repuestoDAO = new RepuestoDAO();
        }
        return repuestoDAO;
    }

}
