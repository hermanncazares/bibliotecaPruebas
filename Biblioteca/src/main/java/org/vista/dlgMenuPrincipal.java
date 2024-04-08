package org.vista;

import org.modelo.Usuario;
import org.negocio.Control;
import org.negocio.*;

public class dlgMenuPrincipal extends javax.swing.JFrame {
    
    private final Control control;
    private final LibroDAO libroDao;
    private final UsuarioDAO usuarioDAO;
    private final PrestamoDAO prestamoDao;
    private final Usuario usuario;
    
    public dlgMenuPrincipal(Usuario usuario) {
        initComponents();
        control = Control.getInstance();
        libroDao = new LibroDAO();
        prestamoDao = new PrestamoDAO();
        usuarioDAO = new UsuarioDAO();
        this.usuario = usuario;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrarPrestamo = new javax.swing.JLabel();
        btnAgregarLibros = new javax.swing.JLabel();
        btnEliminarLibros = new javax.swing.JLabel();
        btnDevolverLibro = new javax.swing.JLabel();
        btnRegistrarUsuarios = new javax.swing.JLabel();
        btnBuscarLibro = new javax.swing.JLabel();
        bienvenido = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        btnRegistrarPrestamo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarPrestamo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrarPrestamo.setText("Registrar Prestamos");
        btnRegistrarPrestamo.setToolTipText("");
        btnRegistrarPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarPrestamoMouseClicked(evt);
            }
        });

        btnAgregarLibros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarLibros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgregarLibros.setText("Agregar Libros");
        btnAgregarLibros.setToolTipText("");
        btnAgregarLibros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarLibrosMouseClicked(evt);
            }
        });

        btnEliminarLibros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminarLibros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminarLibros.setText("Eliminar Libros");
        btnEliminarLibros.setToolTipText("");
        btnEliminarLibros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarLibrosMouseClicked(evt);
            }
        });

        btnDevolverLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDevolverLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDevolverLibro.setText("Devolver Libro");
        btnDevolverLibro.setToolTipText("");
        btnDevolverLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDevolverLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDevolverLibroMouseClicked(evt);
            }
        });

        btnRegistrarUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrarUsuarios.setText("Registrar Usuario");
        btnRegistrarUsuarios.setToolTipText("");
        btnRegistrarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarUsuariosMouseClicked(evt);
            }
        });

        btnBuscarLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscarLibro.setText("Buscar Libro");
        btnBuscarLibro.setToolTipText("");
        btnBuscarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarLibroMouseClicked(evt);
            }
        });

        bienvenido.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRegresar.setText("Salir");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199)
                        .addComponent(btnRegistrarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDevolverLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(bienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(198, 198, 198)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDevolverLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnRegresar)
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        if (usuario.getTipoUsuario() != org.modelo.TipoUsuario.BIBLIOTECARIO) {
            btnRegistrarPrestamo.setVisible(false);
            btnAgregarLibros.setVisible(false);
            btnEliminarLibros.setVisible(false);
            btnRegistrarUsuarios.setVisible(false);
            
        }
        bienvenido.setText("Bienvenido " + usuario.getNombre());
        

    }//GEN-LAST:event_formComponentShown

    private void btnAgregarLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarLibrosMouseClicked
        frmNuevoLibro f = new frmNuevoLibro(control, libroDao,usuario);
        f.setVisible(true);
        

    }//GEN-LAST:event_btnAgregarLibrosMouseClicked

    private void btnRegistrarPrestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarPrestamoMouseClicked
        frmPrestamo f = new frmPrestamo(control, usuario, libroDao, prestamoDao, usuarioDAO);
        f.setVisible(true);

    }//GEN-LAST:event_btnRegistrarPrestamoMouseClicked

    private void btnEliminarLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarLibrosMouseClicked
        frmEliminarLibro f = new frmEliminarLibro(control, libroDao,usuario);
        f.setVisible(true);
        

    }//GEN-LAST:event_btnEliminarLibrosMouseClicked

    private void btnRegistrarUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarUsuariosMouseClicked
        
        frmRegistroNuevoUsuario f = new frmRegistroNuevoUsuario();
        f.setVisible(true);

    }//GEN-LAST:event_btnRegistrarUsuariosMouseClicked

    private void btnBuscarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarLibroMouseClicked
    frmVerLibro f = new frmVerLibro(control);
    f.setVisible(true);

    }//GEN-LAST:event_btnBuscarLibroMouseClicked

    private void btnDevolverLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDevolverLibroMouseClicked
        frmDevolucion f = new frmDevolucion(usuario,control);
        f.setVisible(true);
        

    }//GEN-LAST:event_btnDevolverLibroMouseClicked

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenido;
    private javax.swing.JLabel btnAgregarLibros;
    private javax.swing.JLabel btnBuscarLibro;
    private javax.swing.JLabel btnDevolverLibro;
    private javax.swing.JLabel btnEliminarLibros;
    private javax.swing.JLabel btnRegistrarPrestamo;
    private javax.swing.JLabel btnRegistrarUsuarios;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRegresar3;
    private javax.swing.JButton btnRegresar4;
    // End of variables declaration//GEN-END:variables
}
