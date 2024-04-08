package org.vista;

import excepciones.PersistenciaException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.modelo.EstadoCopia;
import org.modelo.Usuario;
import org.negocio.Control;

public class frmDevolucion extends javax.swing.JFrame {

    private final Usuario usuario;
    private final Control control;

    public frmDevolucion(Usuario usuario, Control control) {
        initComponents();
        this.control = control;
        this.usuario = usuario;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtIdPrestamo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegresar3 = new javax.swing.JButton();

        btnRegresar2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRegresar2.setText("Regresar");
        btnRegresar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton1.setText("Ejecutar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtIdPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPrestamoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("ID prestamo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Devolucion");

        btnRegresar3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRegresar3.setText("Regresar");
        btnRegresar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegresar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(97, 97, 97))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnRegresar3))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresar2ActionPerformed

    private void btnRegresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresar3ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        if (usuario.getTipoUsuario() != org.modelo.TipoUsuario.BIBLIOTECARIO) {
            JOptionPane.showMessageDialog(null, "Solo los bibliotecarios pueden acceder");
            this.dispose();
        }

    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            System.out.println("prestamos:" + control.obtenerPrestamos());
            org.modelo.Prestamo prestamo = control.verPrestamo(Integer.parseInt(txtIdPrestamo.getText()));
            if ( control.verPrestamo(Integer.parseInt(txtIdPrestamo.getText())) != null) {

                if (!prestamo.getFechaFin().before(new Date())) {
                    JOptionPane.showMessageDialog(null, """
                                                        Entrega de libro tardia, porfavor paga el excedente en mostrador 
                                                        Fecha Limite: """+ prestamo.getFechaFin() + "\nFecha Actual: " + new Date());

                }
                System.out.println("copias" + prestamo.getListaCopias() + "\n");

                for (org.modelo.Copia c : prestamo.getListaCopias()) {
                    int ct = 0;
                    c.setEstadoCopia(EstadoCopia.DISPONIBLE);
                    c.getLibro().setNumCopias(ct++);
                }
                System.out.println("copias" + prestamo.getListaCopias() + "\n");
                System.out.println("prestamos:" + control.obtenerPrestamos() + "\n");

                JOptionPane.showMessageDialog(null, "El prestamo ha sido liberado y las copias de los libros estan disponibles nuevamente");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "El prestamo no fue registrado o es incorrecto");
                txtIdPrestamo.setText("");
            }
        } catch (PersistenciaException ex) {
            Logger.getLogger(frmDevolucion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIdPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPrestamoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar2;
    private javax.swing.JButton btnRegresar3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtIdPrestamo;
    // End of variables declaration//GEN-END:variables
}
