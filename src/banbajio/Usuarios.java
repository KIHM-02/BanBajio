package banbajio;

import Listas.Lista_User;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Usuarios extends javax.swing.JFrame 
{
    protected Lista_User lista;
    
    public Usuarios(Lista_User lista) 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        btnRegistrar.requestFocus();
        
        this.lista = lista;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_IniciarSesion = new javax.swing.JPanel();
        Panel_Registro = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblNumTarjeta = new javax.swing.JLabel();
        lblCorreoUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        panelLbl5 = new javax.swing.JPanel();
        panelLbl2 = new javax.swing.JPanel();
        panelEtiqueta = new javax.swing.JPanel();
        panelLbl4 = new javax.swing.JPanel();
        panelLbl3 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        txtUserRegister = new javax.swing.JTextField();
        txtAccount = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblTexto = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        txtPassRegister = new javax.swing.JPasswordField();
        txtConfirmPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(767, 600));

        Panel_IniciarSesion.setBackground(new java.awt.Color(183, 112, 255));
        Panel_IniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout Panel_IniciarSesionLayout = new javax.swing.GroupLayout(Panel_IniciarSesion);
        Panel_IniciarSesion.setLayout(Panel_IniciarSesionLayout);
        Panel_IniciarSesionLayout.setHorizontalGroup(
            Panel_IniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );
        Panel_IniciarSesionLayout.setVerticalGroup(
            Panel_IniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblTitulo.setText("Registro");

        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/usuario.png"))); // NOI18N

        lblNumTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tarjeta.png"))); // NOI18N

        lblCorreoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/correo.png"))); // NOI18N

        lblPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lock.png"))); // NOI18N

        lblConfirmPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lock.png"))); // NOI18N

        panelLbl5.setBackground(new java.awt.Color(204, 153, 255));

        javax.swing.GroupLayout panelLbl5Layout = new javax.swing.GroupLayout(panelLbl5);
        panelLbl5.setLayout(panelLbl5Layout);
        panelLbl5Layout.setHorizontalGroup(
            panelLbl5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        panelLbl5Layout.setVerticalGroup(
            panelLbl5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelLbl2.setBackground(new java.awt.Color(204, 153, 255));

        javax.swing.GroupLayout panelLbl2Layout = new javax.swing.GroupLayout(panelLbl2);
        panelLbl2.setLayout(panelLbl2Layout);
        panelLbl2Layout.setHorizontalGroup(
            panelLbl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        panelLbl2Layout.setVerticalGroup(
            panelLbl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelEtiqueta.setBackground(new java.awt.Color(204, 153, 255));

        javax.swing.GroupLayout panelEtiquetaLayout = new javax.swing.GroupLayout(panelEtiqueta);
        panelEtiqueta.setLayout(panelEtiquetaLayout);
        panelEtiquetaLayout.setHorizontalGroup(
            panelEtiquetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        panelEtiquetaLayout.setVerticalGroup(
            panelEtiquetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelLbl4.setBackground(new java.awt.Color(204, 153, 255));

        javax.swing.GroupLayout panelLbl4Layout = new javax.swing.GroupLayout(panelLbl4);
        panelLbl4.setLayout(panelLbl4Layout);
        panelLbl4Layout.setHorizontalGroup(
            panelLbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        panelLbl4Layout.setVerticalGroup(
            panelLbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelLbl3.setBackground(new java.awt.Color(204, 153, 255));

        javax.swing.GroupLayout panelLbl3Layout = new javax.swing.GroupLayout(panelLbl3);
        panelLbl3.setLayout(panelLbl3Layout);
        panelLbl3Layout.setHorizontalGroup(
            panelLbl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelLbl3Layout.setVerticalGroup(
            panelLbl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btnRegistrar.setBackground(new java.awt.Color(204, 153, 255));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtUserRegister.setForeground(new java.awt.Color(153, 153, 153));
        txtUserRegister.setText("Usuario cuenta");
        txtUserRegister.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserRegisterFocusGained(evt);
            }
        });

        txtAccount.setForeground(new java.awt.Color(153, 153, 153));
        txtAccount.setText("Cuenta Bancaria");
        txtAccount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAccountFocusGained(evt);
            }
        });

        txtEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtEmail.setText("Correo de usuario");
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
        });

        lblTexto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTexto.setText("¿Ya tienes una cuenta? Inicia sesión");

        btnIniciar.setBackground(new java.awt.Color(204, 153, 255));
        btnIniciar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Iniciar sesión");
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        txtPassRegister.setForeground(new java.awt.Color(153, 153, 153));
        txtPassRegister.setText("abc..");
        txtPassRegister.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassRegisterFocusGained(evt);
            }
        });

        txtConfirmPass.setForeground(new java.awt.Color(153, 153, 153));
        txtConfirmPass.setText("abcde");
        txtConfirmPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConfirmPassFocusGained(evt);
            }
        });

        javax.swing.GroupLayout Panel_RegistroLayout = new javax.swing.GroupLayout(Panel_Registro);
        Panel_Registro.setLayout(Panel_RegistroLayout);
        Panel_RegistroLayout.setHorizontalGroup(
            Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_RegistroLayout.createSequentialGroup()
                .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_RegistroLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_RegistroLayout.createSequentialGroup()
                                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_RegistroLayout.createSequentialGroup()
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_RegistroLayout.createSequentialGroup()
                                .addComponent(lblTitulo)
                                .addGap(105, 105, 105))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_RegistroLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_RegistroLayout.createSequentialGroup()
                                .addComponent(lblConfirmPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelLbl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_RegistroLayout.createSequentialGroup()
                                .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCorreoUsuario)
                                    .addComponent(lblPassword)
                                    .addComponent(lblUser))
                                .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_RegistroLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(panelLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Panel_RegistroLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(panelEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(panelLbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(panelLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserRegister)
                            .addComponent(txtAccount)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(txtPassRegister)
                            .addComponent(txtConfirmPass))))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_RegistroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTexto)
                .addGap(69, 69, 69))
        );
        Panel_RegistroLayout.setVerticalGroup(
            Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_RegistroLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUser)
                    .addComponent(panelEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNumTarjeta))
                .addGap(25, 25, 25)
                .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoUsuario))
                .addGap(23, 23, 23)
                .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_RegistroLayout.createSequentialGroup()
                        .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConfirmPassword)
                            .addComponent(txtConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelLbl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTexto)
                        .addGap(18, 18, 18)
                        .addComponent(btnIniciar))
                    .addComponent(lblPassword))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_Registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_IniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel_Registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void txtUserRegisterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserRegisterFocusGained
        txtUserRegister.setText("");
        txtUserRegister.setForeground(Color.black);
    }//GEN-LAST:event_txtUserRegisterFocusGained

    private void txtAccountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAccountFocusGained
        txtAccount.setText("");
        txtAccount.setForeground(Color.black);
    }//GEN-LAST:event_txtAccountFocusGained

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        txtEmail.setText("");
        txtEmail.setForeground(Color.black);
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtPassRegisterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassRegisterFocusGained
        txtPassRegister.setText("");
        txtPassRegister.setForeground(Color.black);
    }//GEN-LAST:event_txtPassRegisterFocusGained

    private void txtConfirmPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmPassFocusGained
        txtConfirmPass.setText("");
        txtConfirmPass.setForeground(Color.black);
    }//GEN-LAST:event_txtConfirmPassFocusGained

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String user, account, email, password;
        
        user = txtUserRegister.getText();
        account = txtAccount.getText();
        email = txtEmail.getText();
        
        if(!verifyPassword())
        {
            JOptionPane.showMessageDialog(this, "Las contraseñas son incorrectas", "Contraseña", JOptionPane.WARNING_MESSAGE);
            return;
        }
            
        
        password = String.valueOf(txtPassRegister.getPassword());
        
        lista.addData(user, account, email, password);
        JOptionPane.showMessageDialog(this, "Se ha agregado el usuario", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
        clean();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public boolean verifyPassword()
    {
        String pwd, confirmPwd;
        
        pwd = String.valueOf(txtPassRegister.getPassword());
        confirmPwd = String.valueOf(txtConfirmPass.getPassword());
        
        if(pwd.equals(confirmPwd))
            return true;
        return false;
    }
    
    public void clean()
    {
        txtUserRegister.setText("Usuario cuenta");
        txtAccount.setText("Cuenta Bancaria");
        txtEmail.setText("Correo de usuario");
        txtPassRegister.setText("abc");
        txtConfirmPass.setText("abc");
        
        txtUserRegister.setForeground(new Color(153, 153, 153));
        txtAccount.setForeground(new Color(153, 153, 153));
        txtEmail.setForeground(new Color(153, 153, 153));
        txtPassRegister.setForeground(new Color(153, 153, 153));
        txtConfirmPass.setForeground(new Color(153, 153, 153));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_IniciarSesion;
    private javax.swing.JPanel Panel_Registro;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblCorreoUsuario;
    private javax.swing.JLabel lblNumTarjeta;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel panelEtiqueta;
    private javax.swing.JPanel panelLbl2;
    private javax.swing.JPanel panelLbl3;
    private javax.swing.JPanel panelLbl4;
    private javax.swing.JPanel panelLbl5;
    private javax.swing.JTextField txtAccount;
    private javax.swing.JPasswordField txtConfirmPass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassRegister;
    private javax.swing.JTextField txtUserRegister;
    // End of variables declaration//GEN-END:variables
}
