package InternalFrames;

import Listas.Lista_User;
import banbajio.Menu;
import javax.swing.JOptionPane;

public class Modificar_Usuario extends javax.swing.JInternalFrame {

    private Lista_User lista;
    private int id;
    private Menu menu;
    
    public Modificar_Usuario(Menu menu, Lista_User lista, int id) 
    {
        initComponents();
        
        this.lista = lista;
        this.id = id;
        this.menu = menu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnModUser = new javax.swing.JButton();
        btnModEmail = new javax.swing.JButton();
        btnModPassword = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnGoBack = new javax.swing.JMenuItem();

        btnModUser.setText("Modificar usuario");
        btnModUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModUserActionPerformed(evt);
            }
        });

        btnModEmail.setText("Modificar correo");
        btnModEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModEmailActionPerformed(evt);
            }
        });

        btnModPassword.setText("Modificar contraseña");
        btnModPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModPasswordActionPerformed(evt);
            }
        });

        jMenu1.setText("Regresar");

        btnGoBack.setText("Cerrar");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });
        jMenu1.add(btnGoBack);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnModUser)
                .addGap(18, 18, 18)
                .addComponent(btnModEmail)
                .addGap(18, 18, 18)
                .addComponent(btnModPassword)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        this.dispose();
        menu.displayUserInformation();
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void btnModUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModUserActionPerformed
        getInformation("nombre");
    }//GEN-LAST:event_btnModUserActionPerformed

    private void btnModEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModEmailActionPerformed
        getInformation("correo");
    }//GEN-LAST:event_btnModEmailActionPerformed

    private void btnModPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModPasswordActionPerformed
        getInformation("contraseña");
    }//GEN-LAST:event_btnModPasswordActionPerformed

    private void getInformation(String operacion)
    {
        String data;
        try {
            data = JOptionPane.showInputDialog(this, "Ingresa el/la nuevo "+operacion+" del usuario: ", "Modificacion de "+operacion, JOptionPane.QUESTION_MESSAGE);
            lista.modifyUserInformation(operacion, id, data);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Operacion cancelada", "Modificacion de "+operacion, JOptionPane.WARNING_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnGoBack;
    private javax.swing.JButton btnModEmail;
    private javax.swing.JButton btnModPassword;
    private javax.swing.JButton btnModUser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
