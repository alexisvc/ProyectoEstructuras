/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoversion1;

/**
 *
 * @author salva
 */
public class GuiPrincipal extends javax.swing.JFrame {
    final int MAX_LIBROS=1;
    ArregloLibro libros = new ArregloLibro(MAX_LIBROS);
    ListaUsuario usuarios = new ListaUsuario();
    ColaReservaciones reservaciones = new ColaReservaciones();
    /**
     * Creates new form GuiPrincipal
     */
    public GuiPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngUsuario = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rbtnCliente = new javax.swing.JRadioButton();
        rbtnEmpleado = new javax.swing.JRadioButton();
        btnReservacion = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnLibro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMostrar = new javax.swing.JTextArea();
        btnMostrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("BIBLIOTECA");

        btngUsuario.add(rbtnCliente);
        rbtnCliente.setText("Cliente");

        btngUsuario.add(rbtnEmpleado);
        rbtnEmpleado.setText("Empleado");

        btnReservacion.setText("Reservaciones");
        btnReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservacionActionPerformed(evt);
            }
        });

        btnUsuario.setText("Usuarios");
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        btnLibro.setText("Libros");
        btnLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibroActionPerformed(evt);
            }
        });

        txaMostrar.setColumns(20);
        txaMostrar.setRows(5);
        jScrollPane1.setViewportView(txaMostrar);

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Mostrar infrmacion de la biblioteca");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rbtnCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReservacion)
                        .addGap(155, 155, 155))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtnEmpleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLibro)
                        .addGap(184, 184, 184))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnMostrar)
                        .addGap(288, 288, 288))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(237, 237, 237))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnUsuario)
                        .addGap(175, 175, 175))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(rbtnCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(btnUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(btnReservacion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnMostrar)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnLibro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        // TODO add your handling code here:
        GuiUsuario guiUsuario = new GuiUsuario(this);    
        guiUsuario.setVisible(true);
        this.setVisible(false);
        /*
        if(GuiPrincipal.getFrames()[0].isVisible()){
            GuiPrincipal.getFrames()[0].setVisible(false);
            GuiPrincipal.getFrames()[0].add(GuiUsuario.getFrames()[0]);
            GuiUsuario.getFrames()[0].setVisible(true);
        }
        */
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservacionActionPerformed
        // TODO add your handling code here:
        GuiReservacion guiReservacion = new GuiReservacion(this);
        guiReservacion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReservacionActionPerformed

    private void btnLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibroActionPerformed
        // TODO add your handling code here:     
        GuiLibro guiLibro = new GuiLibro(this);
        guiLibro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLibroActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        txaMostrar.append(mostrarEstructuras());
        //txaMostrar.setText(mostrarEstructuras());
    }//GEN-LAST:event_btnMostrarActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GuiPrincipal guiPrincipal = new GuiPrincipal();
                guiPrincipal.setVisible(true);
            }
        });
    }
    
    public String mostrarEstructuras(){
        return this.libros.toString() + "\n" + this.usuarios.toString() + "\n" + this.reservaciones.toString();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLibro;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnReservacion;
    private javax.swing.JButton btnUsuario;
    private javax.swing.ButtonGroup btngUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnCliente;
    private javax.swing.JRadioButton rbtnEmpleado;
    private javax.swing.JTextArea txaMostrar;
    // End of variables declaration//GEN-END:variables
}
