package org.vista;

import excepciones.PersistenciaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.modelo.Usuario;
import org.negocio.Control;

public class frmEditarLibro extends javax.swing.JFrame {

    private final Usuario usuario;

    private final Control control;

    public frmEditarLibro(Control control, Usuario usuario) {
        initComponents();
        this.usuario = usuario;

        this.control = control;
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(520, 350, 110, 33);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        labelAutor = new javax.swing.JLabel();
        labelCopias = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        txtNumCopias = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        txtErrorIsbn = new javax.swing.JLabel();
        txtErrorTitulo = new javax.swing.JLabel();
        txtErrorNumCopias = new javax.swing.JLabel();
        txtErrorAutor = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        btnGuardar.setVisible(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(673, 466));
        setMinimumSize(new java.awt.Dimension(673, 466));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Editar libro");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("ISBN:");

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTitulo.setText("Titulo:");
        labelTitulo.setVisible(false);

        txtTitulo.setVisible(false);

        labelAutor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelAutor.setText("Autor:");
        labelAutor.setVisible(false);

        labelCopias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCopias.setText("Numero de Copias:");
        labelCopias.setVisible(false);

        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });
        txtAutor.setVisible(false);

        txtNumCopias.setVisible(false);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRestaurar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRestaurar.setText("Restaurar");
        btnRestaurar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        btnRestaurar.setVisible(false);

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtErrorIsbn.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N

        txtErrorTitulo.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N

        txtErrorNumCopias.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N

        txtErrorAutor.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(238, 238, 238))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addGap(42, 42, 42))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnRegresar)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
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
                                .addGap(0, 23, Short.MAX_VALUE)))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtErrorIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtErrorAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtErrorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(61, 61, 61)
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
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed

    }//GEN-LAST:event_txtAutorActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();

    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        restaurar();

    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        restaurar();

        if (usuario.getTipoUsuario() != org.modelo.TipoUsuario.BIBLIOTECARIO) {
            JOptionPane.showMessageDialog(null, "Solo los bibliotecarios pueden acceder");
            this.dispose();
        }
    }//GEN-LAST:event_formComponentShown

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
                    mostrar();

                    String titulo = control.verLibroPorIsbn(txtIsbn.getText()).getTitulo();
                    String autor = control.verLibroPorIsbn(txtIsbn.getText()).getNombreAutor();
                    int copias = control.verLibroPorIsbn(txtIsbn.getText()).getNumCopias();
                    mostrarDatos(titulo, autor, copias);
                } else {
                    JOptionPane.showMessageDialog(null, "El ISBN no es correcto o no existe");
                    txtIsbn.setText("");
                }
            } catch (PersistenciaException ex) {
                Logger.getLogger(frmEditarLibro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (!control.regex("^[a-zA-Z. ]{5,500}$", txtAutor.getText())) {
            txtErrorAutor.setText("Introduce el nombre completo del autor (texto)");
            txtAutor.setText("");
        } else if (!control.regex("^[a-zA-Z0-9!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~ ]{5,1000}$", txtTitulo.getText())) {
            txtErrorTitulo.setText("Introduce el título completo del libro (texto)");
            txtTitulo.setText("");
        } else if (!control.regex("^\\d+$", txtNumCopias.getText())) {
            txtErrorNumCopias.setText("Introduce el número de copias correcto");
            txtNumCopias.setText("");
        } else {
            try {
                org.modelo.Libro libro = control.verLibroPorIsbn(txtIsbn.getText());
                libro.setTitulo(txtTitulo.getText());
                libro.setNombreAutor(txtAutor.getText());
                libro.setNumCopias(Integer.parseInt(txtNumCopias.getText()));
                control.editarLibro(libro);
                JOptionPane.showMessageDialog(null, "El libro " + txtTitulo.getText() + " ha sido editado correctamente");
                this.dispose();
            } catch (PersistenciaException ex) {
                Logger.getLogger(frmEditarLibro.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_btnGuardarActionPerformed
    private void restaurar() {
        labelAutor.setVisible(false);
        labelCopias.setVisible(false);
        labelTitulo.setVisible(false);

        txtAutor.setVisible(false);
        txtTitulo.setVisible(false);
        txtNumCopias.setVisible(false);

        txtIsbn.setText("");
        btnRestaurar.setVisible(false);
        txtIsbn.setEditable(true);
        btnGuardar.setVisible(false);
        btnBuscar.setVisible(true);

    }

    private void mostrar() {
        labelAutor.setVisible(true);
        labelCopias.setVisible(true);
        labelTitulo.setVisible(true);

        txtAutor.setVisible(true);
        txtTitulo.setVisible(true);
        txtNumCopias.setVisible(true);

        txtIsbn.setEditable(false);
        btnRestaurar.setVisible(true);
        btnGuardar.setVisible(true);
        btnBuscar.setVisible(false);

    }

    private frmEditarLibro getFrame() {
        return this;
    }

    private void mostrarDatos(String titulo, String autor, int numCopias) {
        txtAutor.setText(autor);
        txtTitulo.setText(titulo);
        txtNumCopias.setText(String.valueOf(numCopias));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
