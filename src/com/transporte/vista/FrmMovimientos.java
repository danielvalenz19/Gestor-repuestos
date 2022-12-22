
package com.transporte.vista;

import com.transporte.modelo.ClsConexion;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author serho
 */
public class FrmMovimientos extends javax.swing.JFrame {

    
    public FrmMovimientos() {
        initComponents();
        mostrarDatos();
        this.setLocationRelativeTo(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLienzo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtIdRepuesto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtColorCamion = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdCamion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(976, 673));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLienzo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lienzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 204, 204))); // NOI18N
        panelLienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLienzoMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Id repuesto");

        txtIdRepuesto.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Color camión");

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

        txtColorCamion.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtColorCamion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorCamionActionPerformed(evt);
            }
        });

        txtMatricula.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Id camión");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Fecha");

        txtIdCamion.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtIdCamion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdCamionKeyPressed(evt);
            }
        });

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

        javax.swing.GroupLayout panelLienzoLayout = new javax.swing.GroupLayout(panelLienzo);
        panelLienzo.setLayout(panelLienzoLayout);
        panelLienzoLayout.setHorizontalGroup(
            panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLienzoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLienzoLayout.createSequentialGroup()
                        .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLienzoLayout.createSequentialGroup()
                                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelLienzoLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtColorCamion))))
                                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLienzoLayout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(panelLienzoLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelLienzoLayout.createSequentialGroup()
                                                .addComponent(txtIdCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtFecha)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLienzoLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66))
                    .addGroup(panelLienzoLayout.createSequentialGroup()
                        .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLienzoLayout.createSequentialGroup()
                                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLienzoLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(txtIdRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLienzoLayout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel3))))
                            .addGroup(panelLienzoLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btnGuardar)
                                .addGap(66, 66, 66)
                                .addComponent(btnEditar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLienzoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
            .addGroup(panelLienzoLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLienzoLayout.setVerticalGroup(
            panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLienzoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLienzoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLienzoLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLienzoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtColorCamion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLienzoLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLienzoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnEditar))
                    .addGroup(panelLienzoLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnGuardar)))
                .addGap(34, 34, 34))
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
            st = ClsConexion.getClsConexion().getConnection().createStatement();
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
        txtIdRepuesto.setText(null);
        txtMatricula.setText(null);
        txtIdCamion.setText(null);
        txtColorCamion.setText(null);
        txtFecha.setText(null);
        txtMotivo.setText(null);
    }

    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            PreparedStatement ps = ClsConexion.getClsConexion().getConnection().prepareStatement("Update repuestos set nombre='" + txtIdRepuesto.getText() + "', cantidad='" + txtFecha.getText() + "',descripcion='" + txtColorCamion.getText() + "' where id='" + txtId.getText() + "'");
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

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void txtColorCamionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorCamionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorCamionActionPerformed

    private void txtIdCamionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdCamionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCamionKeyPressed

    private void txtMotivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMotivoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotivoKeyPressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         try {
            PreparedStatement ps = ClsConexion.getClsConexion().getConnection().prepareStatement("INSERT INTO movimientos (repuesto_id,camion_id,fecha,motivo) VALUES(?,?,?,?)");
            ps.setString(1, txtIdRepuesto.getText());
            ps.setString(2, txtIdCamion.getText());
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelLienzo;
    private javax.swing.JTextField txtColorCamion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdCamion;
    private javax.swing.JTextField txtIdRepuesto;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtMotivo;
    // End of variables declaration//GEN-END:variables
}
