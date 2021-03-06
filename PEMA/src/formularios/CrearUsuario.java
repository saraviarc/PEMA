/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import clases.Conexion;
import clases.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Roberto Mendoza
 */
public class CrearUsuario extends javax.swing.JInternalFrame {

    //Conexion a la base de datos
    Connection con = null;
    Conexion conexion = new Conexion();
    //Variable para ejectutar una consulta a la base de datos
    PreparedStatement ps;
    //Variable para almacenar el resultado de la consulta
    ResultSet res;

    //Definir el modelo para la Tabla que almacenara los datos del usuario
    DefaultTableModel tbModelo = new DefaultTableModel(new String[]{"Nombre usuario", "Contraseña", "Cargo", "Estado", "Codigo usuario"}, 0);

    public CrearUsuario() {
        initComponents();
        //Relaizar conexion a BD
        con = conexion.getConexion();
        //Mostrar estado de conexion a bd
        lblEstadoConexion.setText(conexion.getEstadoConexion());
        //Desabilitar campos de datos para la creacion de usuario
        txtNombreUsuario.setEditable(false);
        txtContraseñaUsuario.setEditable(false);
        txtCodigoUsuario.setEditable(false);
        //
        txtIdUsuario.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardarUsuario = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblCodigoUsuario = new javax.swing.JLabel();
        lblCargoUsuario = new javax.swing.JLabel();
        lblEstadoUsuario = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        txtContraseñaUsuario = new javax.swing.JTextField();
        txtCodigoUsuario = new javax.swing.JTextField();
        cbCargoUsuario = new javax.swing.JComboBox<>();
        cbEstadoUsuario = new javax.swing.JComboBox<>();
        btnHabilitarCampos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();
        lblEstado = new javax.swing.JLabel();
        lblEstadoConexion = new javax.swing.JLabel();
        btnMostrarUsuarios = new javax.swing.JButton();
        btnLimpiarTabla = new javax.swing.JButton();
        btnBuscarUsuario = new javax.swing.JButton();
        btnActualizarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        txtIdUsuario = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Maestro de Usuarios");

        btnGuardarUsuario.setText("Guardar usuario");
        btnGuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarUsuarioActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre:");

        lblContraseña.setText("Contraseña:");

        lblCodigoUsuario.setText("Codigo de usuario:");

        lblCargoUsuario.setText("Cargo:");

        lblEstadoUsuario.setText("Estado:");

        cbCargoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supervisor", "Vendedor", "Bodeguero" }));

        cbEstadoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habilitado", "Desabilitado" }));

        btnHabilitarCampos.setText("Habilitar campos");
        btnHabilitarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabilitarCamposActionPerformed(evt);
            }
        });

        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre ", "Contraseña", "Cargo", "Estado", "Codigo de usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbUsuarios);

        lblEstado.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        lblEstado.setText("Estado");

        lblEstadoConexion.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        lblEstadoConexion.setText("...");

        btnMostrarUsuarios.setText("Mostrar usuarios");
        btnMostrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarUsuariosActionPerformed(evt);
            }
        });

        btnLimpiarTabla.setText("Limpiar tabla");
        btnLimpiarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTablaActionPerformed(evt);
            }
        });

        btnBuscarUsuario.setText("Buscar usuario");
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });

        btnActualizarUsuario.setText("Actualizar usuario");
        btnActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarUsuarioActionPerformed(evt);
            }
        });

        btnEliminarUsuario.setText("Eliminar usuario");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        txtIdUsuario.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEstadoConexion)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHabilitarCampos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstadoUsuario)
                    .addComponent(lblCodigoUsuario)
                    .addComponent(lblContraseña)
                    .addComponent(lblNombre)
                    .addComponent(lblCargoUsuario))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(txtContraseñaUsuario)
                            .addComponent(txtCodigoUsuario))
                        .addGap(18, 18, 18)
                        .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCargoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEstadoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMostrarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHabilitarCampos)
                            .addComponent(lblNombre))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContraseña)
                            .addComponent(btnGuardarUsuario)
                            .addComponent(txtContraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoUsuario)
                    .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCargoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCargoUsuario)
                    .addComponent(btnMostrarUsuarios)
                    .addComponent(btnActualizarUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEstadoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstadoUsuario)
                    .addComponent(btnLimpiarTabla)
                    .addComponent(btnEliminarUsuario))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(lblEstadoConexion)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHabilitarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabilitarCamposActionPerformed
        //Habilitar campos para la creacion de usuarios
        txtNombreUsuario.setEditable(true);
        txtContraseñaUsuario.setEditable(true);
        txtCodigoUsuario.setEditable(true);
    }//GEN-LAST:event_btnHabilitarCamposActionPerformed

    private void btnGuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarUsuarioActionPerformed
        //Guardar datos de usuario
        //Validar campos vacíos
        if ((txtNombreUsuario.getText().isEmpty()) || (txtContraseñaUsuario.getText().isEmpty()) || (txtCodigoUsuario.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Todos los campos son requeridos");
            //Desabilitar y limpiar campos
            txtNombreUsuario.setEditable(false);
            txtContraseñaUsuario.setEditable(false);
            txtCodigoUsuario.setEditable(false);
            txtNombreUsuario.setText(null);
            txtContraseñaUsuario.setText(null);
            txtCodigoUsuario.setText(null);
        } else {

            //Capturar los datos ingresados
            String n = txtNombreUsuario.getText();
            String co = txtContraseñaUsuario.getText();
            String ca = (String) cbCargoUsuario.getSelectedItem();
            String e = (String) cbEstadoUsuario.getSelectedItem();
            String cu = txtCodigoUsuario.getText();

            //Instanciar usuario para almacenar los datos
            Usuario nuevoUsuario = new Usuario(n, co, ca, e, cu);

            try {
                ps = con.prepareStatement("INSERT INTO tb_usuarios(nombre, contraseña, cargo, estado, codigoUsuario) VALUES(?,?,?,?,?)");
                ps.setString(1, nuevoUsuario.getNombre());
                ps.setString(2, nuevoUsuario.getContraseña());
                ps.setString(3, nuevoUsuario.getCargo());
                ps.setString(4, nuevoUsuario.getEstado());
                ps.setString(5, nuevoUsuario.getCodigoUsuario());

                int res = ps.executeUpdate();
                //Si el resultado es = a 1 el registro fue exitoso, sino hubo error
                if (res == 1) {
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al realizar registro");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al ingresar datos a tabla " + ex);
            }
            //Desabilitar y limpiar campos
            txtNombreUsuario.setEditable(false);
            txtContraseñaUsuario.setEditable(false);
            txtCodigoUsuario.setEditable(false);
            txtNombreUsuario.setText(null);
            txtContraseñaUsuario.setText(null);
            txtCodigoUsuario.setText(null);
        }
    }//GEN-LAST:event_btnGuardarUsuarioActionPerformed

    private void btnMostrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarUsuariosActionPerformed
        try {
            //Crear arreglo de clase Usuario para mostrar temporalmente en tabla
            String[] usuario = new String[5];
            //Seleccionar modelo de tabla
            tbUsuarios.setModel(tbModelo);
            //
            ps = con.prepareStatement("SELECT * FROM tb_usuarios");
            //Ejecutar linea de codigo en MySQL
            res = ps.executeQuery();
            //Mientras fila por fila encuentre datos deberá almacenar en un arreglo
            while (res.next()) {
                //Almacenar en arreglo los datos de la tabla de la BD
                usuario[0] = res.getString("nombre");
                usuario[1] = res.getString("contraseña");
                usuario[2] = res.getString("cargo");
                usuario[3] = res.getString("estado");
                usuario[4] = res.getString("codigoUsuario");
                //Agregar a tabla los datos recuperados de la BD
                tbModelo.addRow(usuario);
            }
            //

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar tabla " + ex);
        }
    }//GEN-LAST:event_btnMostrarUsuariosActionPerformed

    private void btnLimpiarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTablaActionPerformed

        for (int i = 0; i < tbModelo.getRowCount(); i++) {
            tbModelo.removeRow(i);
            i -= 1;
        }

    }//GEN-LAST:event_btnLimpiarTablaActionPerformed

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed
        String busqueda;
        try {
            busqueda = JOptionPane.showInputDialog(null, "Ingrese codigo de usuario a buscar: ");
            if (busqueda.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No deje dejar el campo vacío");
            } else {
                try {
                    ps = con.prepareStatement("SELECT * FROM tb_usuarios WHERE codigoUsuario = ?");
                    ps.setString(1, busqueda);
                    res = ps.executeQuery();

                    if (res.next()) {
                        txtNombreUsuario.setText(res.getString("nombre"));
                        txtContraseñaUsuario.setText(res.getString("contraseña"));
                        cbCargoUsuario.setSelectedItem(res.getString("cargo"));
                        cbEstadoUsuario.setSelectedItem(res.getString("estado"));
                        txtCodigoUsuario.setText(res.getString("codigoUsuario"));
                        txtIdUsuario.setText(res.getString("idUsuario"));

                        //Habilitar campos
                        txtNombreUsuario.setEditable(true);
                        txtContraseñaUsuario.setEditable(true);
                        txtCodigoUsuario.setEditable(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al consultar tabla " + ex);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Consulta no ejecutada");
        }
    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed

    private void btnActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarUsuarioActionPerformed
        try {
            ps = con.prepareStatement("UPDATE tb_usuarios SET nombre=?,contraseña=?,cargo=?,estado=?,codigoUsuario=? WHERE idUsuario=?");

            ps.setString(1, txtNombreUsuario.getText());
            ps.setString(2, txtContraseñaUsuario.getText());
            ps.setString(3, cbCargoUsuario.getSelectedItem().toString());
            ps.setString(4, cbEstadoUsuario.getSelectedItem().toString());
            ps.setString(5, txtCodigoUsuario.getText());
            ps.setString(6, txtIdUsuario.getText());

            int res = ps.executeUpdate();

            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Registro actualizado con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Error en actualizacion de registro");
            }

            //Desabilitar y limpiar campos
            txtNombreUsuario.setEditable(false);
            txtContraseñaUsuario.setEditable(false);
            txtCodigoUsuario.setEditable(false);
            txtNombreUsuario.setText(null);
            txtContraseñaUsuario.setText(null);
            txtCodigoUsuario.setText(null);
            txtIdUsuario.setText(null);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar tabla " + ex);
        }
    }//GEN-LAST:event_btnActualizarUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        String busqueda;
        try {
            busqueda = JOptionPane.showInputDialog(null, "Ingrese codigo de usuario a eliminar: ");
            if (busqueda.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No deje dejar el campo vacío");
            } else {
                try {
                    ps = con.prepareStatement("DELETE FROM tb_usuarios WHERE codigoUsuario = ?");
                    ps.setString(1, busqueda);
                    int res;
                    res = ps.executeUpdate();

                    if (res == 1) {
                        JOptionPane.showMessageDialog(null, "Registro eliminado");
                        //Habilitar campos
                        txtNombreUsuario.setEditable(true);
                        txtContraseñaUsuario.setEditable(true);
                        txtCodigoUsuario.setEditable(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al consultar tabla " + ex);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Consulta no ejecutada");
        }
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarUsuario;
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnGuardarUsuario;
    private javax.swing.JButton btnHabilitarCampos;
    private javax.swing.JButton btnLimpiarTabla;
    private javax.swing.JButton btnMostrarUsuarios;
    private javax.swing.JComboBox<String> cbCargoUsuario;
    private javax.swing.JComboBox<String> cbEstadoUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargoUsuario;
    private javax.swing.JLabel lblCodigoUsuario;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstadoConexion;
    private javax.swing.JLabel lblEstadoUsuario;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tbUsuarios;
    private javax.swing.JTextField txtCodigoUsuario;
    private javax.swing.JTextField txtContraseñaUsuario;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
