
package com.transporte.dao;

import com.transporte.modelo.ClsConexion;
import com.transporte.modelo.Movimientos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class MovimientosDAO implements CRUD{
    
    private PreparedStatement ps;
    private ResultSet rs;
    private static MovimientosDAO movimientosDAO;

    private MovimientosDAO() {
    }
    
    

    @Override
    public int agregar(Object[] o) {
        int r = 0;
        String sql = "INSERT INTO movimientos(id_repuesto,repuesto,rep_utilizado,id_camion,matricula,fecha,motivo)values(?,?,?,?,?,?,?)";
        try {
            ps = ClsConexion.getClsConexion().getConnection().prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }

    @Override
    public List leer() {
        List<Movimientos> lista = new ArrayList<>();
        String sql = "SELECT * FROM movimientos";
        try {
            ps = ClsConexion.getClsConexion().getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Movimientos mov = new Movimientos();
                mov.setId(rs.getInt(1));
                mov.setRepuesto(rs.getString(3));
                mov.setRepUtilizado(rs.getInt(4));
                mov.setMatricula(rs.getString(6));
                mov.setFecha(rs.getString(7));
                mov.setMotivo(rs.getString(8));
                lista.add(mov);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return lista;
    }    

    @Override
    public int actualizar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int actualizarStock(int cant, int idr){
        int r=0;
        String sql ="update repuesto set cantidad=? where id=?";
        try {
            ps = ClsConexion.getClsConexion().getConnection().prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setInt(2, idr);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
    public synchronized static MovimientosDAO getMovimientosDAO() {
        if (movimientosDAO == null) {
            movimientosDAO = new MovimientosDAO();
        }
        return movimientosDAO;
    }
}
