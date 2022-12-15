/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.transporte.formularios;

import com.transporte.logica.ClsConexion;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author serho
 */
public class FrmMovimientosCmb extends javax.swing.JFrame {

    ClsConexion con = new ClsConexion();
    Connection cn = con.getConnection();
    
    public FrmMovimientosCmb() {
        initComponents();
        mostrarDatos();
        this.setLocationRelativeTo(this);
        rellenarComboBox("repuestos", "nombre", cmbRepuesto);
        rellenarComboBox("camiones", "matricula", cmbMatricula);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLienzo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        cmbRepuesto = new javax.swing.JComboBox<>();
        cmbMatricula = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(987, 637));
        setMinimumSize(new java.awt.Dimension(987, 637));
        setPreferredSize(new java.awt.Dimension(987, 637));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLienzo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lienzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 204, 204))); // NOI18N
        panelLienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLienzoMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Repuesto");

        txtFecha.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFechaKeyPressed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listo.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listo animado.png"))); // NOI18N
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setText("Matrícula");

        txtId.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtId.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Id");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Fecha");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("Motivo");

        txtMotivo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtMotivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMotivoKeyPressed(evt);
            }
        });

        btnGuardar.setText("jButton1");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cmbRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRepuestoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLienzoLayout = new javax.swing.GroupLayout(panelLienzo);
        panelLienzo.setLayout(panelLienzoLayout);
        panelLienzoLayout.setHorizontalGroup(
            panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLienzoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLienzoLayout.createSequentialGroup()
                        .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLienzoLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel9))
                            .addComponent(cmbMatricula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLienzoLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtFecha))
                        .addGap(66, 66, 66))
                    .addGroup(panelLienzoLayout.createSequentialGroup()
                        .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLienzoLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelLienzoLayout.createSequentialGroup()
                                        .addComponent(btnGuardar)
                                        .addGap(66, 66, 66)
                                        .addComponent(btnEditar))))
                            .addGroup(panelLienzoLayout.createSequentialGroup()
                                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLienzoLayout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel3))
                                    .addGroup(panelLienzoLayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(cmbRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
            .addGroup(panelLienzoLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelLienzoLayout.setVerticalGroup(
            panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLienzoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRepuesto))
                .addGap(12, 12, 12)
                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLienzoLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLienzoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(228, 228, 228))
        );

        getContentPane().add(panelLienzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 86, 350, 530));

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 590, 530));
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnGuardar.requestFocus();
            btnGuardar.doClick();
        }

    }//GEN-LAST:event_txtFechaKeyPressed

    void mostrarDatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("Repuesto utilizado");
        modelo.addColumn("Camión");
        modelo.addColumn("Fecha");
        modelo.addColumn("Motivo");

        TablaDatos.setModel(modelo);
        String consultasql = "select*from movimientos";
        String data[] = new String[5];
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);
            while (rs.next()) {
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                data[4] = rs.getString(5);
                modelo.addRow(data);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"error al mostrar los datos " + e);
        }
    }

    public void limpiar() {
        txtId.setText(null);
        cmbRepuesto.setSelectedItem(null);
        cmbMatricula.setSelectedItem(null);
        txtFecha.setText(null);
        txtMotivo.setText(null);
    }

    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            PreparedStatement ps = cn.prepareStatement("Update movimientos set repuesto_id='" + (String)cmbRepuesto.getSelectedItem() + "', camion_id='" + (String)cmbMatricula.getSelectedItem() + "',fecha='" + txtFecha.getText() + "', motivo='" + txtMotivo.getText() +  "' where id='" + txtId.getText() + "'");
            int indice = ps.executeUpdate();

            if (indice > 0) {
                JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS CORRECTAMENTE");
                mostrarDatos();
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "NO SE SELECCIONO FILA");
            }
            } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR DATOS " + e);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void panelLienzoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLienzoMouseClicked
        btnGuardar.setEnabled(true);
        btnEditar.setEnabled(false);
        limpiar();

    }//GEN-LAST:event_panelLienzoMouseClicked

    private void txtMotivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMotivoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotivoKeyPressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO movimientos (repuesto_id,camion_id,fecha,motivo) VALUES((SELECT id FROM repuestos where nombre=?),(SELECT id FROM camiones where matricula=?),?,?)");
            ps.setString(1, (String)cmbRepuesto.getSelectedItem());
            ps.setString(2, (String)cmbMatricula.getSelectedItem());
            ps.setString(3, txtFecha.getText());
            ps.setString(4, txtMotivo.getText());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATOS GUARDADOS!...");
            mostrarDatos();
            limpiar();

        } catch (SQLException e) {
            System.out.println("ERROR AL GUARDAR LOS DATOS " + e);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void rellenarComboBox(String nombreTabla, String valor, JComboBox combo)
        {
            String sql= "Select * from " + nombreTabla;
            Statement st;
            try
            {
             st = cn.createStatement();
             ResultSet rs = st.executeQuery(sql);
             while(rs.next())
             {
                 combo.addItem(rs.getString(valor));
             }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error "+ e.toString());
            }
            
        }
    
    private void cmbRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRepuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRepuestoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbMatricula;
    private javax.swing.JComboBox<String> cmbRepuesto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelLienzo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMotivo;
    // End of variables declaration//GEN-END:variables
}
