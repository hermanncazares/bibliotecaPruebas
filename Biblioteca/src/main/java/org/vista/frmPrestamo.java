package org.vista;

import com.toedter.calendar.JDateChooser;
import excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.*;
import javax.swing.JOptionPane;
import org.modelo.Copia;
import org.modelo.EstadoCopia;
import org.modelo.Prestamo;
import org.modelo.Usuario;
import org.negocio.Control;
import org.negocio.LibroDAO;
import org.negocio.PrestamoDAO;
import org.negocio.UsuarioDAO;

public class frmPrestamo extends javax.swing.JFrame {

//    private Prestamo prestamo;
    private List<Copia> listaCopias;
    private final PrestamoDAO prestamoDao;
    private final UsuarioDAO usuarioDao;
    private final LibroDAO libroDao;
    private final Control control;
    private final Usuario usuario;
    private int totalLibrosAgregados;
    private final JDateChooser dateChooser1;
    private final JDateChooser dateChooser2;

    public frmPrestamo(Control control, Usuario usuario, LibroDAO libroDao, PrestamoDAO prestamoDao, UsuarioDAO usuarioDao) {
        initComponents();
        this.usuarioDao = usuarioDao;
        this.prestamoDao = prestamoDao;
        this.libroDao = libroDao;
        listaCopias = new ArrayList<>();
        dateChooser1 = new JDateChooser();
        dateChooser1.setDate(new Date());
        getContentPane().add(dateChooser1);
        dateChooser1.setBounds(410, 240, 100, 30);
        dateChooser1.setVisible(false);
        dateChooser2 = new JDateChooser();
        dateChooser2.setDate(new Date());
        getContentPane().add(dateChooser2);
        dateChooser2.setBounds(410, 288, 100, 30);
        dateChooser2.setVisible(false);
        this.usuario = usuario;
        totalLibrosAgregados = 0;
        this.control = control;
        getContentPane().add(btnPrestamo);
        btnPrestamo.setBounds(690, 520, 110, 33);
        btnPrestamo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPrestamo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelCantidad = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtErrorIsbn = new javax.swing.JLabel();
        txtErrorCantidad = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        labelAutor = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        labelCopias = new javax.swing.JLabel();
        txtNumCopias = new javax.swing.JTextField();
        labelTotalLibros = new javax.swing.JLabel();
        labelLibros = new javax.swing.JLabel();
        labelIdAlumno = new javax.swing.JLabel();
        txtIdAlumno = new javax.swing.JTextField();
        txtErrorIdAlumno = new javax.swing.JLabel();
        labelFechaInicio = new javax.swing.JLabel();
        labelFechaFin = new javax.swing.JLabel();
        txtErrorFechaInicio = new javax.swing.JLabel();
        txtErrorFechaFin = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        bienvenido = new javax.swing.JLabel();

        btnPrestamo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPrestamo.setText("Solicitar");
        btnPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(836, 533));
        setMinimumSize(new java.awt.Dimension(836, 533));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Prestamos");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("ISBN de libro:");

        labelCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCantidad.setText("Cantidad:");
        labelCantidad.setVisible(false);

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.setVisible(false);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        btnBuscar.setBounds(520, 350, 110, 33);

        txtErrorIsbn.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N

        txtErrorCantidad.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N

        labelTitulo.setText("Titulo:");
        labelTitulo.setVisible(false);

        txtTitulo.setVisible(false);
        txtTitulo.setEditable(false);
        txtTitulo.setEditable(false);
        txtTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTitulo.setBorder(null);

        labelAutor.setText("Autor:");
        labelAutor.setVisible(false);

        txtAutor.setEditable(false);
        txtAutor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAutor.setBorder(null);
        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });
        txtAutor.setVisible(false);
        txtAutor.setEditable(false);

        labelCopias.setText("Numero de Copias:");
        labelCopias.setVisible(false);

        txtNumCopias.setVisible(false);
        txtNumCopias.setEditable(false);
        txtNumCopias.setEditable(false);
        txtNumCopias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumCopias.setBorder(null);

        labelTotalLibros.setFont(new java.awt.Font("Segoe UI", 3, 8)); // NOI18N
        labelTotalLibros.setText("Total:");
        labelCopias.setVisible(false);

        labelLibros.setFont(new java.awt.Font("Segoe UI", 3, 8)); // NOI18N
        labelCopias.setVisible(false);

        labelIdAlumno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelIdAlumno.setText("Id de Alumno:");
        labelCantidad.setVisible(false);

        txtCantidad.setVisible(false);
        txtIdAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAlumnoActionPerformed(evt);
            }
        });

        txtErrorIdAlumno.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N

        labelFechaInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelFechaInicio.setText("Fecha de inicio");
        labelCantidad.setVisible(false);

        labelFechaFin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelFechaFin.setText("Fecha de fin:");
        labelCantidad.setVisible(false);

        txtErrorFechaInicio.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N

        txtErrorFechaFin.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        bienvenido.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(labelTitulo)
                                                .addComponent(labelAutor)
                                                .addComponent(labelCopias))
                                            .addGap(60, 60, 60)
                                            .addComponent(txtNumCopias, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtErrorFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(85, 85, 85)
                                    .addComponent(labelTotalLibros)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(labelLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(198, 198, 198)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(labelCantidad)
                                    .addComponent(labelIdAlumno)
                                    .addComponent(labelFechaInicio)
                                    .addComponent(labelFechaFin))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtErrorIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtErrorCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtErrorIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtErrorFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(txtCantidad)
                                    .addComponent(txtIsbn))))))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtErrorIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtErrorCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIdAlumno)
                    .addComponent(txtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtErrorIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(labelFechaInicio)
                .addGap(7, 7, 7)
                .addComponent(txtErrorFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFechaFin)
                .addGap(18, 18, 18)
                .addComponent(txtErrorFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAutor)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCopias)
                    .addComponent(txtNumCopias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelLibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTotalLibros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnBuscar))
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed


    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        txtErrorIsbn.setText("");
        txtErrorIdAlumno.setText("");
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

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed

    }//GEN-LAST:event_txtAutorActionPerformed

    private void btnPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamoActionPerformed
        txtErrorCantidad.setText("");
        txtErrorIdAlumno.setText("");
        if (!control.regex("^\\d{1,30}$", txtCantidad.getText())) {
            txtErrorCantidad.setText("Ingrese la cantidad numerica");

        } else if (!control.regex("^\\d$", txtIdAlumno.getText())) {
            txtErrorIdAlumno.setText("Ingrese el id correctamente");
        } else {
            try {
                if (Integer.parseInt(txtCantidad.getText()) <= libroDao.verLibroPorIsbn(txtIsbn.getText()).getNumCopias()) {
                    org.modelo.Libro libro = libroDao.verLibroPorIsbn(txtIsbn.getText());
                    libro.setNumCopias(libro.getNumCopias() - Integer.parseInt(txtCantidad.getText()));
                    for (int i = 0; i < Integer.parseInt(txtCantidad.getText()); i++) {
                        org.modelo.Copia copia = new org.modelo.Copia(EstadoCopia.PRESTADO, libro);
                        listaCopias.add(copia);
                    }

                    libroDao.editarLibro(libro);
                    totalLibrosAgregados += Integer.parseInt(txtCantidad.getText());
                    labelLibros.setText(String.valueOf(totalLibrosAgregados));
//                    int respuesta = JOptionPane.showConfirmDialog(null, "El libro se solicito con exito, deseas agregar otro libro?");
//                    if (respuesta == 0) {
//                        ocultar();
//                    } else if (respuesta == 2) {
//                        libro.setNumCopias(libro.getNumCopias() + Integer.parseInt(txtCantidad.getText()));
//                        this.dispose();
//                    } 
//                    else {
                        org.modelo.Prestamo prestamo = new Prestamo(dateChooser1.getDate(), dateChooser2.getDate(), usuarioDao.buscarUsuarioPorId(Integer.parseInt(txtIdAlumno.getText())), listaCopias);
                        prestamo.setIdPrestamo(control.obtenerPrestamos().size() + 1);
                        prestamoDao.registrarPrestamo(prestamo);
                        JOptionPane.showMessageDialog(null, "Se agregaron " + totalLibrosAgregados + " libros al usuario " + usuarioDao.buscarUsuarioPorId(Integer.parseInt(txtIdAlumno.getText())).getNombre());
                        JOptionPane.showMessageDialog(null, "Id del prestamo: " + prestamo.getIdPrestamo());
                        this.dispose();
//                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Solo hay " + libroDao.verLibroPorIsbn(txtIsbn.getText()).getNumCopias() + " copias del libro");
                    ocultar();
                }

            } catch (PersistenciaException ex) {
                Logger.getLogger(frmPrestamo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btnPrestamoActionPerformed

    private void txtIdAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAlumnoActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        ocultar();
        if (usuario.getTipoUsuario() != org.modelo.TipoUsuario.BIBLIOTECARIO) {
            JOptionPane.showMessageDialog(null, "Solo los bibliotecarios pueden acceder");
            this.dispose();
        }
        bienvenido.setText("Bienvenido " + usuario.getNombre());
    }//GEN-LAST:event_formComponentShown

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void ocultar() {
        dateChooser1.setVisible(false);
        dateChooser2.setVisible(false);
        labelFechaFin.setVisible(false);
        labelFechaInicio.setVisible(false);
        labelCantidad.setVisible(false);
        txtCantidad.setText("");
        txtCantidad.setVisible(false);
        txtIsbn.setText("");
        btnPrestamo.setVisible(false);
        btnBuscar.setVisible(true);
        txtTitulo.setVisible(false);
        txtAutor.setVisible(false);
        txtNumCopias.setVisible(false);
        labelAutor.setVisible(false);
        labelCopias.setVisible(false);
        labelTitulo.setVisible(false);
        txtIdAlumno.setVisible(false);
        txtIdAlumno.setText("");
        labelIdAlumno.setVisible(false);

    }

    private void mostrar() {
        labelFechaFin.setVisible(true);
        labelFechaInicio.setVisible(true);
        dateChooser1.setVisible(true);
        dateChooser2.setVisible(true);
        btnPrestamo.setVisible(true);
        btnBuscar.setVisible(false);
        txtCantidad.setVisible(true);
        labelCantidad.setVisible(true);
        txtTitulo.setVisible(true);
        txtAutor.setVisible(true);
        txtNumCopias.setVisible(true);
        labelAutor.setVisible(true);
        labelCopias.setVisible(true);
        labelTitulo.setVisible(true);
        txtCantidad.setText("");
        txtIdAlumno.setText("");
        labelIdAlumno.setVisible(true);
        txtIdAlumno.setVisible(true);
        labelTotalLibros.setVisible(true);
        labelLibros.setVisible(true);

    }

    private void mostrarDatos(String titulo, String autor, int copias) {
        txtTitulo.setText(titulo);
        txtAutor.setText(autor);
        txtNumCopias.setText(String.valueOf(copias));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenido;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnPrestamo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelCopias;
    private javax.swing.JLabel labelFechaFin;
    private javax.swing.JLabel labelFechaInicio;
    private javax.swing.JLabel labelIdAlumno;
    private javax.swing.JLabel labelLibros;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTotalLibros;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JLabel txtErrorCantidad;
    private javax.swing.JLabel txtErrorFechaFin;
    private javax.swing.JLabel txtErrorFechaInicio;
    private javax.swing.JLabel txtErrorIdAlumno;
    private javax.swing.JLabel txtErrorIsbn;
    private javax.swing.JTextField txtIdAlumno;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtNumCopias;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
