/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.transporte.vista;

import com.transporte.dao.CamionDAO;
import com.transporte.dao.MovimientosDAO;
import com.transporte.dao.RepuestoDAO;
import com.transporte.modelo.Camion;
import com.transporte.modelo.Movimientos;
import com.transporte.modelo.Repuesto;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author serho
 */
public class FrmMovimientosCmb extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private Repuesto rep = new Repuesto();
    private Camion camion = new Camion();
    private int idr; //id repuesto
    private int cant;
    private int idm; //id del movimiento

    public FrmMovimientosCmb() {
        initComponents();

        leer();

        this.setLocationRelativeTo(this);

    }

    void leer() {
        List<Movimientos> lista = MovimientosDAO.getMovimientosDAO().leer();
        modelo = (DefaultTableModel) TablaDatos.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getRepuesto();
            ob[2] = lista.get(i).getRepUtilizado();
            ob[3] = lista.get(i).getMatricula();
            ob[4] = lista.get(i).getFecha();
            ob[5] = lista.get(i).getMotivo();
            modelo.addRow(ob);
        }
        TablaDatos.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        panelLienzo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        Matrícula = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRepUtilizar = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        txtIdRepuesto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIdCamion = new javax.swing.JTextField();
        txtRepuesto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnMatricula = new javax.swing.JButton();
        btnRepuesto = new javax.swing.JButton();
        txtRepDisp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        jMenuItem1.setText("Eliminar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });

        setMaximumSize(new java.awt.Dimension(1380, 687));
        setMinimumSize(new java.awt.Dimension(1380, 687));
        setPreferredSize(new java.awt.Dimension(1229, 687));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLienzo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lienzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 204, 204))); // NOI18N
        panelLienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLienzoMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Id Repuesto");

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

        Matrícula.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Matrícula.setText("Id Camión");

        txtId.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtId.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Id");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Fecha");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("Motivo");

        txtRepUtilizar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtRepUtilizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRepUtilizarKeyPressed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar animado.png"))); // NOI18N
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtIdRepuesto.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtIdRepuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdRepuestoKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Repuestos disponibles");

        txtIdCamion.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtIdCamion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdCamionKeyPressed(evt);
            }
        });

        txtRepuesto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtRepuesto.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Repuesto");

        txtMatricula.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtMatricula.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Matrícula");

        btnMatricula.setText("Buscar");
        btnMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatriculaActionPerformed(evt);
            }
        });

        btnRepuesto.setText("Buscar");
        btnRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepuestoActionPerformed(evt);
            }
        });

        txtRepDisp.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtRepDisp.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Repuestos a utilizar");

        txtMotivo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtMotivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMotivoKeyPressed(evt);
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
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLienzoLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelLienzoLayout.createSequentialGroup()
                        .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLienzoLayout.createSequentialGroup()
                                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLienzoLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10))
                                    .addGroup(panelLienzoLayout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(txtRepUtilizar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelLienzoLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(Matrícula)))
                        .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLienzoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar)
                                .addGap(29, 29, 29)
                                .addComponent(btnEditar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLienzoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(230, 230, 230))
                            .addGroup(panelLienzoLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(txtRepDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelLienzoLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel8)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLienzoLayout.createSequentialGroup()
                        .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(panelLienzoLayout.createSequentialGroup()
                                .addComponent(txtIdCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnMatricula))
                            .addGroup(panelLienzoLayout.createSequentialGroup()
                                .addComponent(txtIdRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRepuesto)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                            .addComponent(txtRepuesto))
                        .addGap(33, 33, 33))))
            .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLienzoLayout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(503, Short.MAX_VALUE)))
        );
        panelLienzoLayout.setVerticalGroup(
            panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLienzoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLienzoLayout.createSequentialGroup()
                        .addComponent(txtIdRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Matrícula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLienzoLayout.createSequentialGroup()
                        .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRepuesto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtIdCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMatricula))
                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLienzoLayout.createSequentialGroup()
                        .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRepUtilizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRepDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(panelLienzoLayout.createSequentialGroup()
                        .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEditar)
                            .addComponent(btnGuardar))
                        .addGap(54, 54, 54))))
            .addGroup(panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLienzoLayout.createSequentialGroup()
                    .addContainerGap(412, Short.MAX_VALUE)
                    .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(58, 58, 58)))
        );

        getContentPane().add(panelLienzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 730, 520));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Bienvendio a transporte SAS");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        jButton4.setText("Regresar");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir animado.png"))); // NOI18N
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(816, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(161, 161, 161)
                .addComponent(jButton4)
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 120));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla Movimientos"));

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Repuesto", "Rep Utilizados", "Matrícula", "Fecha", "Motivo"
            }
        ));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);
        if (TablaDatos.getColumnModel().getColumnCount() > 0) {
            TablaDatos.getColumnModel().getColumn(1).setPreferredWidth(150);
            TablaDatos.getColumnModel().getColumn(3).setPreferredWidth(150);
            TablaDatos.getColumnModel().getColumn(4).setPreferredWidth(100);
            TablaDatos.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 640, 510));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Repuestos disponibles");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnGuardar.requestFocus();
            btnGuardar.doClick();
        }

    }//GEN-LAST:event_txtFechaKeyPressed

    public void limpiar() {
        txtId.setText(null);
        txtIdCamion.setText(null);
        txtIdRepuesto.setText(null);
        txtMatricula.setText(null);
        txtRepuesto.setText(null);
        txtRepUtilizar.setText(null);
        txtRepDisp.setText(null);
        txtFecha.setText(null);
        txtRepUtilizar.setText(null);
        txtMotivo.setText(null);
    }


    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

    }//GEN-LAST:event_btnEditarActionPerformed

    private void panelLienzoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLienzoMouseClicked
        btnGuardar.setEnabled(true);
        btnEditar.setEnabled(false);
        limpiar();

    }//GEN-LAST:event_panelLienzoMouseClicked

    private void txtRepUtilizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRepUtilizarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepUtilizarKeyPressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtRepUtilizar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de repuestos a utilizar.");
        } else {
                actualizarStock();
                limpiarTabla();
                leer();
                limpiar();
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    void actualizarStock() {
        Repuesto rep = new Repuesto();
        cant = Integer.parseInt(txtRepUtilizar.getText());
        rep = RepuestoDAO.getRepuestoDAO().listarId(idr);
        int sa = rep.getCantidad() - cant;
        System.out.println(rep.getCantidad());
        if(cant > rep.getCantidad() ){
            JOptionPane.showMessageDialog(null, "No hay la cantidad de respuestos disponibles");
        }else{
            MovimientosDAO.getMovimientosDAO().actualizarStock(sa, idr);
            JOptionPane.showMessageDialog(null, "Se realizó con éxito el movimiento.");
            agregar();
        }
    }

    void agregar() {
        String idRepuesto = txtIdRepuesto.getText();
        String repuesto = txtRepuesto.getText();
        String repUtilizar = txtRepUtilizar.getText();
        String idCamion = txtIdCamion.getText();
        String matricula = txtMatricula.getText();
        String fecha = txtFecha.getText();
        String motivo = txtMotivo.getText();
        Object[] ob = new Object[7];
        ob[0] = idRepuesto;
        ob[1] = repuesto;
        ob[2] = repUtilizar;
        ob[3] = idCamion;
        ob[4] = matricula;
        ob[5] = fecha;
        ob[6] = motivo;
        MovimientosDAO.getMovimientosDAO().agregar(ob);

    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        FrmPrincipal frmPrincipal = new FrmPrincipal();
        frmPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        btnGuardar.setEnabled(false);
        btnEditar.setEnabled(false);
        int fila = this.TablaDatos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una fila");
        } else {
            idm = Integer.parseInt(TablaDatos.getValueAt(fila, 0).toString());
        }
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void txtIdRepuestoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdRepuestoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdRepuestoKeyPressed

    private void txtIdCamionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdCamionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCamionKeyPressed

    private void btnRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepuestoActionPerformed
        buscarRepuesto();
        idr = Integer.parseInt(txtIdRepuesto.getText());

    }//GEN-LAST:event_btnRepuestoActionPerformed

    void buscarRepuesto() {
        int id = Integer.parseInt(txtIdRepuesto.getText());
        if (txtIdRepuesto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un código");
        } else {
            rep = RepuestoDAO.getRepuestoDAO().listarId(id);
            if (rep.getId() != 0) {
                txtRepuesto.setText(rep.getNombre());
                txtRepDisp.setText(String.valueOf(rep.getCantidad()));
            } else {
                JOptionPane.showMessageDialog(null, "El repuesto no se encuentra registrado...");
            }

        }
    }
    private void btnMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatriculaActionPerformed
        buscarCamion();
    }//GEN-LAST:event_btnMatriculaActionPerformed

    private void txtMotivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMotivoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotivoKeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        eliminar();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    void buscarCamion() {
        int id = Integer.parseInt(txtIdCamion.getText());
        if (txtIdCamion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un id");
        } else {
            camion = CamionDAO.getCamionDAO().listarId(id);
            if (camion.getId() != 0) {
                txtMatricula.setText(camion.getMatricula());
            } else {
                JOptionPane.showMessageDialog(null, "El camion no se encuentra registrado...");
            }

        }
    }

    void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    void eliminar() {
        int fila = TablaDatos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
            RepuestoDAO.getRepuestoDAO().eliminar(idm);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Matrícula;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMatricula;
    private javax.swing.JButton btnRepuesto;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelLienzo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdCamion;
    private javax.swing.JTextField txtIdRepuesto;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtRepDisp;
    private javax.swing.JTextField txtRepUtilizar;
    private javax.swing.JTextField txtRepuesto;
    // End of variables declaration//GEN-END:variables
}
