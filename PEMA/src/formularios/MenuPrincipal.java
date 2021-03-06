/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;
//import 

import clases.NuevoInicioSesion;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author Roberto Mendoza
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        //Habilitar menu correspondiente
        mAdm.setEnabled(true);
        mSup.setEnabled(false);
        mInv.setEnabled(false);
        mV.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        mArc = new javax.swing.JMenu();
        mArc_inicioSesion = new javax.swing.JMenuItem();
        mArc_salir = new javax.swing.JMenuItem();
        mAdm = new javax.swing.JMenu();
        mAdm_MaestroUsuarios = new javax.swing.JMenuItem();
        mSup = new javax.swing.JMenu();
        mInv = new javax.swing.JMenu();
        mInv_crearProd = new javax.swing.JMenuItem();
        mInv_ingresarProd = new javax.swing.JMenuItem();
        mInv_editarProd = new javax.swing.JMenuItem();
        mInv_dspacharProd = new javax.swing.JMenuItem();
        mInv_verificarInv = new javax.swing.JMenuItem();
        mV = new javax.swing.JMenu();
        mV_realizarV = new javax.swing.JMenuItem();
        mV_solicitarProd = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1360, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 563, Short.MAX_VALUE)
        );

        mArc.setText("Archivo");

        mArc_inicioSesion.setText("Iniciar sesion");
        mArc_inicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mArc_inicioSesionActionPerformed(evt);
            }
        });
        mArc.add(mArc_inicioSesion);

        mArc_salir.setText("Salir");
        mArc_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mArc_salirActionPerformed(evt);
            }
        });
        mArc.add(mArc_salir);

        menuBar.add(mArc);

        mAdm.setText("Administraci??n");

        mAdm_MaestroUsuarios.setText("Maestro de usuarios");
        mAdm_MaestroUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAdm_MaestroUsuariosActionPerformed(evt);
            }
        });
        mAdm.add(mAdm_MaestroUsuarios);

        menuBar.add(mAdm);

        mSup.setText("Supervisi??n");
        menuBar.add(mSup);

        mInv.setText("Inventario");

        mInv_crearProd.setText("Crear producto");
        mInv.add(mInv_crearProd);

        mInv_ingresarProd.setText("Ingresar productos");
        mInv.add(mInv_ingresarProd);

        mInv_editarProd.setText("Editar producto");
        mInv.add(mInv_editarProd);

        mInv_dspacharProd.setText("Despachar prodcuto");
        mInv.add(mInv_dspacharProd);

        mInv_verificarInv.setText("Verificar Inventario");
        mInv.add(mInv_verificarInv);

        menuBar.add(mInv);

        mV.setText("Ventas");

        mV_realizarV.setText("Realizar venta");
        mV.add(mV_realizarV);

        mV_solicitarProd.setText("Solicitar productos");
        mV.add(mV_solicitarProd);

        menuBar.add(mV);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mAdm_MaestroUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAdm_MaestroUsuariosActionPerformed
        //Instanciar clase de tipo CrearUsuario
        //Agregar a escritorio y mostrar
        CrearUsuario ventanaCrearUsuario = new CrearUsuario();
        escritorio.add(ventanaCrearUsuario);
        ventanaCrearUsuario.show();
    }//GEN-LAST:event_mAdm_MaestroUsuariosActionPerformed

    private void mArc_inicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mArc_inicioSesionActionPerformed
//        IniciarSesion iniciarSesion = new IniciarSesion();
//        escritorio.add(iniciarSesion);
//        iniciarSesion.show();
        Login iniciarSesion = new Login();
//        escritorio.add(iniciarSesion);
        iniciarSesion.setVisible(true);
        this.setVisible(false);
//        if(nuevoIncioSesion.){
//        }
    }//GEN-LAST:event_mArc_inicioSesionActionPerformed

    private void mArc_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mArc_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mArc_salirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu mAdm;
    private javax.swing.JMenuItem mAdm_MaestroUsuarios;
    private javax.swing.JMenu mArc;
    private javax.swing.JMenuItem mArc_inicioSesion;
    private javax.swing.JMenuItem mArc_salir;
    private javax.swing.JMenu mInv;
    private javax.swing.JMenuItem mInv_crearProd;
    private javax.swing.JMenuItem mInv_dspacharProd;
    private javax.swing.JMenuItem mInv_editarProd;
    private javax.swing.JMenuItem mInv_ingresarProd;
    private javax.swing.JMenuItem mInv_verificarInv;
    private javax.swing.JMenu mSup;
    private javax.swing.JMenu mV;
    private javax.swing.JMenuItem mV_realizarV;
    private javax.swing.JMenuItem mV_solicitarProd;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}
