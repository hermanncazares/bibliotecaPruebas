package org.vista;

import excepciones.PersistenciaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.negocio.Control;

public class frmVerLibro extends javax.swing.JFrame {

    Control control;

    public frmVerLibro(Control control) {
        initComponents();
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRestaurar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtErrorIsbn = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        txtErrorTitulo = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        txtErrorNumCopias = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtErrorAutor = new javax.swing.JLabel();
        labelAutor = new javax.swing.JLabel();
        labelCopias = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        txtNumCopias = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btnRestaurar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRestaurar.setText("Restaurar");
        btnRestaurar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        btnRestaurar.setVisible(true);

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("ISBN:");

        txtErrorIsbn.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTitulo.setText("Titulo:");
        labelTitulo.setVisible(true);

        txtErrorTitulo.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N

        txtErrorNumCopias.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N

        txtTitulo.setVisible(true);
        txtTitulo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTitulo.setEnabled(false);

        txtErrorAutor.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N

        labelAutor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelAutor.setText("Autor:");
        labelAutor.setVisible(true);

        labelCopias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCopias.setText("Numero de Copias:");
        labelCopias.setVisible(true);

        txtAutor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAutor.setEnabled(false);
        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });
        txtAutor.setVisible(true);

        txtNumCopias.setVisible(true);
        txtNumCopias.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNumCopias.setEnabled(false);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnRegresar)
                                    .addGap(76, 76, 76))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelAutor)
                                        .addComponent(labelCopias)
                                        .addComponent(labelTitulo)
                                        .addComponent(jLabel2))
                                    .addGap(18, 18, 18)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAutor)
                                        .addComponent(txtTitulo)
                                        .addComponent(txtIsbn)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtNumCopias, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnRestaurar))
                                                .addComponent(txtErrorNumCopias, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addGap(8, 8, 8))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(txtErrorIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtErrorAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtErrorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(25, 25, 25)))))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtErrorIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelTitulo))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtErrorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelAutor)
                        .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(7, 7, 7)
                    .addComponent(txtErrorAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCopias)
                        .addComponent(txtNumCopias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(txtErrorNumCopias, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar)
                        .addComponent(btnRestaurar)
                        .addComponent(btnRegresar))
                    .addGap(60, 60, 60)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        restaurar();
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed

    }//GEN-LAST:event_txtAutorActionPerformed
private void restaurar(){
    txtAutor.setText("");
    txtIsbn.setText("");
    txtTitulo.setText("");
    txtNumCopias.setText("");
}
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        txtErrorAutor.setText("");
        txtErrorIsbn.setText("");
        txtErrorNumCopias.setText("");
        txtErrorTitulo.setText("");
        if (txtIsbn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos en blanco, verifica los datos");
        }
        if (!control.regex("^\\d{6,10}$", txtIsbn.getText())) {
            txtErrorIsbn.setText("Introduce el codigo numerico de 6-10 numeros");
        } else {
            try {
                if (control.verLibroPorIsbn(txtIsbn.getText()) != null) {

                    String titulo = control.verLibroPorIsbn(txtIsbn.getText()).getTitulo();
                    String autor = control.verLibroPorIsbn(txtIsbn.getText()).getNombreAutor();
                    int copias = control.verLibroPorIsbn(txtIsbn.getText()).getNumCopias();
                    mostrarDatos(titulo, autor, copias);
                } else {
                    JOptionPane.showMessageDialog(null, "El ISBN no es correcto o no existe");
                    txtIsbn.setText("");
                    txtAutor.setText("");
                    txtTitulo.setText("");
                    txtNumCopias.setText("");
                }
            } catch (PersistenciaException ex) {
                Logger.getLogger(frmEditarLibro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void mostrarDatos(String titulo, String autor, int numCopias) {
        txtAutor.setText(autor);
        txtTitulo.setText(titulo);
        txtNumCopias.setText(String.valueOf(numCopias));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelCopias;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JLabel txtErrorAutor;
    private javax.swing.JLabel txtErrorIsbn;
    private javax.swing.JLabel txtErrorNumCopias;
    private javax.swing.JLabel txtErrorTitulo;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtNumCopias;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
