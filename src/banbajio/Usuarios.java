package banbajio;

import Listas.Lista_Movimiento;
import Listas.Lista_User;
import Listas.Pila_Tarjeta;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Usuarios extends javax.swing.JFrame 
{
    protected Lista_Movimiento listaMovimiento = new Lista_Movimiento();
    
    protected Lista_User lista;
    protected Pila_Tarjeta pila;
    private int id;
    
    public Usuarios(Lista_User lista, Pila_Tarjeta pila) 
    {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Icon/logotipo.png")).getImage());
        getRootPane().setDefaultButton(btnLogin);
        
        txtPassLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                btnLoginActionPerformed(e);
            }
        });
                
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        txtEmailLogin.requestFocus();
        
        this.lista = lista;
        this.pila = pila;
        
        hidePanel(Panel_Registro, false);
       
    }
    
    public void hidePanel(JPanel panel, boolean state)
    {
        panel.setVisible(state);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEtiqueta5 = new javax.swing.JPanel();
        panelEtiqueta6 = new javax.swing.JPanel();
        PanelFondo = new javax.swing.JPanel();
        Panel_InicioSesion = new javax.swing.JPanel();
        btnRegistrate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblUser1 = new javax.swing.JLabel();
        panelEtiqueta9 = new javax.swing.JPanel();
        txtEmailLogin = new javax.swing.JTextField();
        lblPassword1 = new javax.swing.JLabel();
        panelEtiqueta10 = new javax.swing.JPanel();
        txtPassLogin = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblicon = new javax.swing.JLabel();
        Panel_Fondo_Derecho = new javax.swing.JPanel();
        Panel_Registro = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        lblCorreoUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        panelEtiqueta3 = new javax.swing.JPanel();
        txtUserRegister = new javax.swing.JTextField();
        panelEtiqueta4 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        panelEtiqueta7 = new javax.swing.JPanel();
        txtConfirmPass = new javax.swing.JPasswordField();
        panelEtiqueta8 = new javax.swing.JPanel();
        txtPassRegister = new javax.swing.JPasswordField();
        btnRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Lblicon = new javax.swing.JLabel();

        panelEtiqueta5.setBackground(new java.awt.Color(204, 153, 255));

        javax.swing.GroupLayout panelEtiqueta5Layout = new javax.swing.GroupLayout(panelEtiqueta5);
        panelEtiqueta5.setLayout(panelEtiqueta5Layout);
        panelEtiqueta5Layout.setHorizontalGroup(
            panelEtiqueta5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );
        panelEtiqueta5Layout.setVerticalGroup(
            panelEtiqueta5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelEtiqueta6.setBackground(new java.awt.Color(204, 153, 255));

        javax.swing.GroupLayout panelEtiqueta6Layout = new javax.swing.GroupLayout(panelEtiqueta6);
        panelEtiqueta6.setLayout(panelEtiqueta6Layout);
        panelEtiqueta6Layout.setHorizontalGroup(
            panelEtiqueta6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );
        panelEtiqueta6Layout.setVerticalGroup(
            panelEtiqueta6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelFondo.setBackground(new java.awt.Color(183, 112, 255));
        PanelFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Panel_InicioSesion.setBackground(new java.awt.Color(183, 112, 255));

        btnRegistrate.setBackground(new java.awt.Color(204, 153, 255));
        btnRegistrate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrate.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrate.setText("Registrate");
        btnRegistrate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegistrate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¿Aún no tienes una cuenta? Registrate");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Inicia sesión");

        lblUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/usuario.png"))); // NOI18N

        panelEtiqueta9.setBackground(new java.awt.Color(255, 255, 255));
        panelEtiqueta9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtEmailLogin.setText("Usuario cuenta");
        txtEmailLogin.setBorder(null);
        txtEmailLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailLoginFocusGained(evt);
            }
        });
        txtEmailLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEtiqueta9Layout = new javax.swing.GroupLayout(panelEtiqueta9);
        panelEtiqueta9.setLayout(panelEtiqueta9Layout);
        panelEtiqueta9Layout.setHorizontalGroup(
            panelEtiqueta9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEtiqueta9Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(txtEmailLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelEtiqueta9Layout.setVerticalGroup(
            panelEtiqueta9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEtiqueta9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtEmailLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblPassword1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lock.png"))); // NOI18N

        panelEtiqueta10.setBackground(new java.awt.Color(255, 255, 255));
        panelEtiqueta10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPassLogin.setText("abc..");
        txtPassLogin.setBorder(null);
        txtPassLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassLoginFocusGained(evt);
            }
        });

        javax.swing.GroupLayout panelEtiqueta10Layout = new javax.swing.GroupLayout(panelEtiqueta10);
        panelEtiqueta10.setLayout(panelEtiqueta10Layout);
        panelEtiqueta10Layout.setHorizontalGroup(
            panelEtiqueta10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEtiqueta10Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(txtPassLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelEtiqueta10Layout.setVerticalGroup(
            panelEtiqueta10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEtiqueta10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtPassLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnLogin.setBackground(new java.awt.Color(204, 153, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Iniciar sesión");
        btnLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_InicioSesionLayout = new javax.swing.GroupLayout(Panel_InicioSesion);
        Panel_InicioSesion.setLayout(Panel_InicioSesionLayout);
        Panel_InicioSesionLayout.setHorizontalGroup(
            Panel_InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_InicioSesionLayout.createSequentialGroup()
                .addGroup(Panel_InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_InicioSesionLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(Panel_InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_InicioSesionLayout.createSequentialGroup()
                                .addComponent(lblPassword1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelEtiqueta10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_InicioSesionLayout.createSequentialGroup()
                                .addComponent(lblUser1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelEtiqueta9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(Panel_InicioSesionLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel4)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_InicioSesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Panel_InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_InicioSesionLayout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_InicioSesionLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_InicioSesionLayout.createSequentialGroup()
                        .addComponent(btnRegistrate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))))
        );
        Panel_InicioSesionLayout.setVerticalGroup(
            Panel_InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_InicioSesionLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addGroup(Panel_InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUser1)
                    .addComponent(panelEtiqueta9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword1)
                    .addComponent(panelEtiqueta10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        lblicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logotipo.png"))); // NOI18N

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_InicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                    .addContainerGap(79, Short.MAX_VALUE)
                    .addComponent(lblicon, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_InicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                    .addContainerGap(159, Short.MAX_VALUE)
                    .addComponent(lblicon, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(193, Short.MAX_VALUE)))
        );

        getContentPane().add(PanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 600));

        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/usuario.png"))); // NOI18N

        lblCorreoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/correo.png"))); // NOI18N

        lblPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lock.png"))); // NOI18N

        lblConfirmPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lock.png"))); // NOI18N

        panelEtiqueta3.setBackground(new java.awt.Color(204, 153, 255));
        panelEtiqueta3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtUserRegister.setBackground(new java.awt.Color(204, 153, 255));
        txtUserRegister.setText("Usuario cuenta");
        txtUserRegister.setBorder(null);
        txtUserRegister.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserRegisterFocusGained(evt);
            }
        });
        txtUserRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEtiqueta3Layout = new javax.swing.GroupLayout(panelEtiqueta3);
        panelEtiqueta3.setLayout(panelEtiqueta3Layout);
        panelEtiqueta3Layout.setHorizontalGroup(
            panelEtiqueta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEtiqueta3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtUserRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelEtiqueta3Layout.setVerticalGroup(
            panelEtiqueta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEtiqueta3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtUserRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelEtiqueta4.setBackground(new java.awt.Color(204, 153, 255));
        panelEtiqueta4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtEmail.setBackground(new java.awt.Color(204, 153, 255));
        txtEmail.setText("Correo de usuario");
        txtEmail.setBorder(null);
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
        });

        javax.swing.GroupLayout panelEtiqueta4Layout = new javax.swing.GroupLayout(panelEtiqueta4);
        panelEtiqueta4.setLayout(panelEtiqueta4Layout);
        panelEtiqueta4Layout.setHorizontalGroup(
            panelEtiqueta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEtiqueta4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelEtiqueta4Layout.setVerticalGroup(
            panelEtiqueta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEtiqueta4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelEtiqueta7.setBackground(new java.awt.Color(204, 153, 255));
        panelEtiqueta7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtConfirmPass.setBackground(new java.awt.Color(204, 153, 255));
        txtConfirmPass.setText("abcde");
        txtConfirmPass.setBorder(null);
        txtConfirmPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConfirmPassFocusGained(evt);
            }
        });

        javax.swing.GroupLayout panelEtiqueta7Layout = new javax.swing.GroupLayout(panelEtiqueta7);
        panelEtiqueta7.setLayout(panelEtiqueta7Layout);
        panelEtiqueta7Layout.setHorizontalGroup(
            panelEtiqueta7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEtiqueta7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panelEtiqueta7Layout.setVerticalGroup(
            panelEtiqueta7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEtiqueta7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelEtiqueta8.setBackground(new java.awt.Color(204, 153, 255));
        panelEtiqueta8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPassRegister.setBackground(new java.awt.Color(204, 153, 255));
        txtPassRegister.setText("abc..");
        txtPassRegister.setBorder(null);
        txtPassRegister.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassRegisterFocusGained(evt);
            }
        });

        javax.swing.GroupLayout panelEtiqueta8Layout = new javax.swing.GroupLayout(panelEtiqueta8);
        panelEtiqueta8.setLayout(panelEtiqueta8Layout);
        panelEtiqueta8Layout.setHorizontalGroup(
            panelEtiqueta8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEtiqueta8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtPassRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelEtiqueta8Layout.setVerticalGroup(
            panelEtiqueta8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEtiqueta8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtPassRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnRegistrar.setBackground(new java.awt.Color(204, 153, 255));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Registro");

        btnIniciarSesion.setBackground(new java.awt.Color(204, 153, 255));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("¿Ya tienes una cuenta? Inicia sesión");

        javax.swing.GroupLayout Panel_RegistroLayout = new javax.swing.GroupLayout(Panel_Registro);
        Panel_Registro.setLayout(Panel_RegistroLayout);
        Panel_RegistroLayout.setHorizontalGroup(
            Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_RegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_RegistroLayout.createSequentialGroup()
                        .addComponent(lblUser)
                        .addGap(18, 18, 18)
                        .addComponent(panelEtiqueta3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(Panel_RegistroLayout.createSequentialGroup()
                        .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(Panel_RegistroLayout.createSequentialGroup()
                                    .addComponent(lblCorreoUsuario)
                                    .addGap(18, 18, 18)
                                    .addComponent(panelEtiqueta4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGroup(Panel_RegistroLayout.createSequentialGroup()
                                    .addComponent(lblPassword)
                                    .addGap(18, 18, 18)
                                    .addComponent(panelEtiqueta8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGroup(Panel_RegistroLayout.createSequentialGroup()
                                    .addComponent(lblConfirmPassword)
                                    .addGap(18, 18, 18)
                                    .addComponent(panelEtiqueta7, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_RegistroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(136, 136, 136))
            .addGroup(Panel_RegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel_RegistroLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_RegistroLayout.setVerticalGroup(
            Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_RegistroLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUser)
                    .addComponent(panelEtiqueta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCorreoUsuario)
                    .addComponent(panelEtiqueta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword)
                    .addComponent(panelEtiqueta8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConfirmPassword)
                    .addComponent(panelEtiqueta7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        Lblicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/BANCA.png"))); // NOI18N

        javax.swing.GroupLayout Panel_Fondo_DerechoLayout = new javax.swing.GroupLayout(Panel_Fondo_Derecho);
        Panel_Fondo_Derecho.setLayout(Panel_Fondo_DerechoLayout);
        Panel_Fondo_DerechoLayout.setHorizontalGroup(
            Panel_Fondo_DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
            .addGroup(Panel_Fondo_DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_Fondo_DerechoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Panel_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(Panel_Fondo_DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Fondo_DerechoLayout.createSequentialGroup()
                    .addContainerGap(67, Short.MAX_VALUE)
                    .addComponent(Lblicon, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(49, 49, 49)))
        );
        Panel_Fondo_DerechoLayout.setVerticalGroup(
            Panel_Fondo_DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(Panel_Fondo_DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_Fondo_DerechoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Panel_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(Panel_Fondo_DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Fondo_DerechoLayout.createSequentialGroup()
                    .addContainerGap(156, Short.MAX_VALUE)
                    .addComponent(Lblicon, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(189, 189, 189)))
        );

        getContentPane().add(Panel_Fondo_Derecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 350, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserRegisterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserRegisterFocusGained
        txtUserRegister.setText("");
        txtUserRegister.setForeground(Color.black);
    }//GEN-LAST:event_txtUserRegisterFocusGained

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
        String user, email, password;
        user = txtUserRegister.getText();
        email = txtEmail.getText();
        
        if(!verifyPassword())
        {
            JOptionPane.showMessageDialog(this, "Las contraseñas son incorrectas", "Contraseña", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        password = String.valueOf(txtPassRegister.getPassword());
        lista.addData(user, email, password);
        
        id = lista.getUserId(email);
        
        JOptionPane.showMessageDialog(this, "Se ha agregado el usuario con id "+id, "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
        clean();
        hidePanel(PanelFondo, true);
        hidePanel(Panel_Registro, false);
        hidePanel(Panel_InicioSesion, true); 
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtUserRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserRegisterActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        Panel_Registro.setVisible(false);
        PanelFondo.setVisible(true);
        Panel_InicioSesion.setVisible(true);
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnRegistrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrateActionPerformed
        Panel_Registro.setVisible(true);
        PanelFondo.setVisible(true);
        Panel_InicioSesion.setVisible(false);
        btnRegistrar.setRequestFocusEnabled(true);
    }//GEN-LAST:event_btnRegistrateActionPerformed

    private void txtEmailLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailLoginFocusGained
        txtEmailLogin.setText("");
        txtEmailLogin.setForeground(Color.black);
    }//GEN-LAST:event_txtEmailLoginFocusGained

    private void txtEmailLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailLoginActionPerformed

    private void txtPassLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassLoginFocusGained
        txtPassLogin.setText("");
        txtPassLogin.setForeground(Color.black);
    }//GEN-LAST:event_txtPassLoginFocusGained

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String enteredEmail = txtEmailLogin.getText();
        String enteredPassword = String.valueOf(txtPassLogin.getPassword());
        
        boolean userExists = lista.userExists(enteredEmail);
        if(userExists){
            String storedPassword = lista.getPasswordForUser(enteredEmail);
            
            if(storedPassword.equals(enteredPassword)){
                JOptionPane.showMessageDialog(this, "Inicio de sesion exitoso","Acceso Permitido",JOptionPane.PLAIN_MESSAGE);
                
                id = lista.getUserId(enteredEmail);
                
                Menu menu = new Menu(this, lista, pila, listaMovimiento, id);
                menu.setVisible(true);
                //this.dispose();     
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this, "Los datos ingresados son incorrectos, verifica por favor", "Acceso Denegado", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Los datos ingresados son incorrectos, verifica por favor", "Acceso Denegado", JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
        txtEmail.setText("Correo de usuario");
        txtPassRegister.setText("abc");
        txtConfirmPass.setText("abc");
        
        txtUserRegister.setForeground(new Color(153, 153, 153));
        txtEmail.setForeground(new Color(153, 153, 153));
        txtPassRegister.setForeground(new Color(153, 153, 153));
        txtConfirmPass.setForeground(new Color(153, 153, 153));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lblicon;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel Panel_Fondo_Derecho;
    private javax.swing.JPanel Panel_InicioSesion;
    private javax.swing.JPanel Panel_Registro;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblCorreoUsuario;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUser1;
    private javax.swing.JLabel lblicon;
    private javax.swing.JPanel panelEtiqueta10;
    private javax.swing.JPanel panelEtiqueta3;
    private javax.swing.JPanel panelEtiqueta4;
    private javax.swing.JPanel panelEtiqueta5;
    private javax.swing.JPanel panelEtiqueta6;
    private javax.swing.JPanel panelEtiqueta7;
    private javax.swing.JPanel panelEtiqueta8;
    private javax.swing.JPanel panelEtiqueta9;
    private javax.swing.JPasswordField txtConfirmPass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailLogin;
    private javax.swing.JPasswordField txtPassLogin;
    private javax.swing.JPasswordField txtPassRegister;
    private javax.swing.JTextField txtUserRegister;
    // End of variables declaration//GEN-END:variables
}
