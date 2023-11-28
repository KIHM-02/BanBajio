package banbajio;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    private Usuarios usuarios; 
    
    public Menu(Usuarios usuarios) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        hidePanel(panel_mov, true);
        hidePanel(panel_usuario, false);
        hidePanel(panel_c_banco, false);
        hidePanel(panel_inversion, false);
        
        this.usuarios = usuarios;
    }
    
    public void hidePanel(JPanel panel, boolean state)
    {
        panel.setVisible(state);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_inversion = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_agregar_inv = new javax.swing.JButton();
        btn_eliminar_inv = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        combox_proyeccion = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtA_inv = new javax.swing.JTextArea();
        lblRendimiento = new javax.swing.JLabel();
        panel_mov = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_mov = new javax.swing.JTable();
        btn_ingresos = new javax.swing.JButton();
        btn_gastos = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        panel_c_banco = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        combox_tipo_tarjeta = new javax.swing.JComboBox<>();
        txt_num_tarjeta = new javax.swing.JLabel();
        txt_ccv = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        panel_usuario = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_email = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_celular = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_agregar_inv1 = new javax.swing.JButton();
        chbMostrarPassword = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        panel_menulat = new javax.swing.JPanel();
        btn_app = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_menu = new javax.swing.JButton();
        btn_usuario = new javax.swing.JButton();
        btn_cuentabanco = new javax.swing.JButton();
        btn_inversiones = new javax.swing.JButton();
        btn_prestamos = new javax.swing.JButton();
        btn_conversion = new javax.swing.JButton();
        panel_saldo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenu = new javax.swing.JMenuBar();
        btnSalir = new javax.swing.JMenu();
        btnCerrarSesion = new javax.swing.JMenuItem();
        btnClose = new javax.swing.JMenuItem();
        btnDevInfo = new javax.swing.JMenu();
        btnInformacion = new javax.swing.JMenuItem();
        btnRecordatorios = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_inversion.setBackground(new java.awt.Color(255, 255, 255));
        panel_inversion.setPreferredSize(new java.awt.Dimension(600, 595));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Número", "Tipo de inversión", "Rendimiento", "Proyección"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        btn_agregar_inv.setBackground(new java.awt.Color(183, 112, 255));
        btn_agregar_inv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_agregar_inv.setText("AGREGAR");
        btn_agregar_inv.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_eliminar_inv.setBackground(new java.awt.Color(183, 112, 255));
        btn_eliminar_inv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_eliminar_inv.setText("ELIMINAR");
        btn_eliminar_inv.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("Proyección");

        combox_proyeccion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        combox_proyeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Corto", "Medio", "Largo" }));

        txtA_inv.setColumns(20);
        txtA_inv.setRows(5);
        jScrollPane3.setViewportView(txtA_inv);

        lblRendimiento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRendimiento.setText("Rendimiento");

        javax.swing.GroupLayout panel_inversionLayout = new javax.swing.GroupLayout(panel_inversion);
        panel_inversion.setLayout(panel_inversionLayout);
        panel_inversionLayout.setHorizontalGroup(
            panel_inversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inversionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_inversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addGroup(panel_inversionLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panel_inversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRendimiento)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_agregar_inv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar_inv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combox_proyeccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );
        panel_inversionLayout.setVerticalGroup(
            panel_inversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inversionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panel_inversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_inversionLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(27, 27, 27)
                        .addComponent(lblRendimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combox_proyeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_agregar_inv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminar_inv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(panel_inversionLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))))
        );

        getContentPane().add(panel_inversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 105, -1, -1));

        panel_mov.setBackground(new java.awt.Color(255, 255, 255));

        tabla_mov.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tipo de movimiento", "Cantidad", "Fecha", "Descripción"
            }
        ));
        jScrollPane1.setViewportView(tabla_mov);

        btn_ingresos.setBackground(new java.awt.Color(183, 112, 255));
        btn_ingresos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ingresos.setText("INGRESOS");
        btn_ingresos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_gastos.setBackground(new java.awt.Color(183, 112, 255));
        btn_gastos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_gastos.setText("GASTOS");
        btn_gastos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_agregar.setBackground(new java.awt.Color(183, 112, 255));
        btn_agregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_agregar.setText("AGREGAR");
        btn_agregar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_eliminar.setBackground(new java.awt.Color(183, 112, 255));
        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panel_movLayout = new javax.swing.GroupLayout(panel_mov);
        panel_mov.setLayout(panel_movLayout);
        panel_movLayout.setHorizontalGroup(
            panel_movLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_movLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panel_movLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btn_ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_gastos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_movLayout.setVerticalGroup(
            panel_movLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_movLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_movLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_gastos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        getContentPane().add(panel_mov, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 105, 600, 595));

        panel_c_banco.setBackground(new java.awt.Color(255, 255, 255));
        panel_c_banco.setPreferredSize(new java.awt.Dimension(600, 595));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Tipo de tarjeta");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Número de tarjeta");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Código de seguridad (CVV)");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Fecha de expiración");

        combox_tipo_tarjeta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        combox_tipo_tarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Débito", "Crédito" }));

        txt_num_tarjeta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_num_tarjeta.setText("número predeterminado");

        txt_ccv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_ccv.setText("código predeterminado");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("fecha predeterminada");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tarjeta.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tarjeta.png"))); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lock.png"))); // NOI18N

        javax.swing.GroupLayout panel_c_bancoLayout = new javax.swing.GroupLayout(panel_c_banco);
        panel_c_banco.setLayout(panel_c_bancoLayout);
        panel_c_bancoLayout.setHorizontalGroup(
            panel_c_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_c_bancoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panel_c_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_c_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_c_bancoLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(combox_tipo_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_c_bancoLayout.createSequentialGroup()
                        .addGroup(panel_c_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(panel_c_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_num_tarjeta)
                            .addComponent(jLabel16)
                            .addComponent(txt_ccv))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        panel_c_bancoLayout.setVerticalGroup(
            panel_c_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_c_bancoLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(panel_c_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(panel_c_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(combox_tipo_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(panel_c_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_c_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txt_num_tarjeta))
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(panel_c_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_c_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txt_ccv))
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(panel_c_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addContainerGap(269, Short.MAX_VALUE))
        );

        getContentPane().add(panel_c_banco, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 105, -1, -1));

        panel_usuario.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Nombre de usuario");

        txt_nombre.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        txt_nombre.setText("nombre predeterminado");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Correo electrónico");

        txt_email.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        txt_email.setText("correo predeterminado");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Número de teléfono");

        txt_celular.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        txt_celular.setText("número predeterminado");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Contraseña");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel9.setText("contraseña predeterminada");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/usuario.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/correo.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lock.png"))); // NOI18N

        btn_agregar_inv1.setBackground(new java.awt.Color(183, 112, 255));
        btn_agregar_inv1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_agregar_inv1.setText("MODIFICAR DATOS");
        btn_agregar_inv1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        chbMostrarPassword.setText("Mostrar");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/phone.png"))); // NOI18N

        javax.swing.GroupLayout panel_usuarioLayout = new javax.swing.GroupLayout(panel_usuario);
        panel_usuario.setLayout(panel_usuarioLayout);
        panel_usuarioLayout.setHorizontalGroup(
            panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_usuarioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_agregar_inv1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_usuarioLayout.createSequentialGroup()
                        .addGroup(panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_usuarioLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel_usuarioLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(88, 88, 88)
                                    .addGroup(panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chbMostrarPassword)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panel_usuarioLayout.createSequentialGroup()
                                .addGroup(panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        panel_usuarioLayout.setVerticalGroup(
            panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_usuarioLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txt_nombre))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txt_email))
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txt_celular))
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbMostrarPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_agregar_inv1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        getContentPane().add(panel_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 105, 600, 595));

        panel_menulat.setBackground(new java.awt.Color(183, 112, 255));

        btn_app.setBackground(new java.awt.Color(255, 51, 102));
        btn_app.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_app.setForeground(new java.awt.Color(255, 255, 255));
        btn_app.setText("Información de la aplicación");
        btn_app.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_app.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_appActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logotipo.png"))); // NOI18N

        btn_menu.setBackground(new java.awt.Color(255, 51, 102));
        btn_menu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_menu.setForeground(new java.awt.Color(255, 255, 255));
        btn_menu.setText("Menú principal");
        btn_menu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        btn_usuario.setBackground(new java.awt.Color(255, 51, 102));
        btn_usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_usuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_usuario.setText("Información de usuario");
        btn_usuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuarioActionPerformed(evt);
            }
        });

        btn_cuentabanco.setBackground(new java.awt.Color(255, 51, 102));
        btn_cuentabanco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cuentabanco.setForeground(new java.awt.Color(255, 255, 255));
        btn_cuentabanco.setText("Información de cuenta bancaria");
        btn_cuentabanco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_cuentabanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cuentabancoActionPerformed(evt);
            }
        });

        btn_inversiones.setBackground(new java.awt.Color(255, 51, 102));
        btn_inversiones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_inversiones.setForeground(new java.awt.Color(255, 255, 255));
        btn_inversiones.setText("Inversiones");
        btn_inversiones.setAutoscrolls(true);
        btn_inversiones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_inversiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inversionesActionPerformed(evt);
            }
        });

        btn_prestamos.setBackground(new java.awt.Color(255, 51, 102));
        btn_prestamos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_prestamos.setForeground(new java.awt.Color(255, 255, 255));
        btn_prestamos.setText("Préstamos");
        btn_prestamos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_conversion.setBackground(new java.awt.Color(255, 51, 102));
        btn_conversion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_conversion.setForeground(new java.awt.Color(255, 255, 255));
        btn_conversion.setText("Calculadora / Conversor de monedas");
        btn_conversion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_conversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conversionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_menulatLayout = new javax.swing.GroupLayout(panel_menulat);
        panel_menulat.setLayout(panel_menulatLayout);
        panel_menulatLayout.setHorizontalGroup(
            panel_menulatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_app, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_menulatLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addComponent(btn_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_cuentabanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_inversiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_prestamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_conversion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_menulatLayout.setVerticalGroup(
            panel_menulatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menulatLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cuentabanco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_inversiones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_prestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_conversion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(btn_app, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(panel_menulat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel_saldo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Saldo a favor");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("$0.00");

        javax.swing.GroupLayout panel_saldoLayout = new javax.swing.GroupLayout(panel_saldo);
        panel_saldo.setLayout(panel_saldoLayout);
        panel_saldoLayout.setHorizontalGroup(
            panel_saldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_saldoLayout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addGroup(panel_saldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_saldoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_saldoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(275, 275, 275))))
        );
        panel_saldoLayout.setVerticalGroup(
            panel_saldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_saldoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(panel_saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 600, 110));

        btnSalir.setText("Salir");

        btnCerrarSesion.setText("Cerrar sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        btnSalir.add(btnCerrarSesion);

        btnClose.setText("Salir de la app");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        btnSalir.add(btnClose);

        jMenu.add(btnSalir);

        btnDevInfo.setText("Desarrolladores");
        btnDevInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevInfoActionPerformed(evt);
            }
        });

        btnInformacion.setText("Informacion");
        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });
        btnDevInfo.add(btnInformacion);

        jMenu.add(btnDevInfo);

        btnRecordatorios.setText("Recordatorios");

        jMenuItem1.setText("Notas");
        btnRecordatorios.add(jMenuItem1);

        jMenu.add(btnRecordatorios);

        setJMenuBar(jMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_conversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conversionActionPerformed
        Herramientas conversion = new Herramientas(this);
        conversion.setVisible(true);        
    }//GEN-LAST:event_btn_conversionActionPerformed

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        hidePanel(panel_mov, true);
        hidePanel(panel_usuario, false);
        hidePanel(panel_c_banco, false);
        hidePanel(panel_inversion, false);
    }//GEN-LAST:event_btn_menuActionPerformed

    private void btn_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuarioActionPerformed
        hidePanel(panel_mov, false);
        hidePanel(panel_usuario, true);
        hidePanel(panel_c_banco, false);
        hidePanel(panel_inversion, false);
    }//GEN-LAST:event_btn_usuarioActionPerformed

    private void btn_cuentabancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cuentabancoActionPerformed
        hidePanel(panel_mov, false);
        hidePanel(panel_usuario, false);
        hidePanel(panel_c_banco, true);
        hidePanel(panel_inversion, false);
    }//GEN-LAST:event_btn_cuentabancoActionPerformed

    private void btn_inversionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inversionesActionPerformed
        hidePanel(panel_mov, false);
        hidePanel(panel_usuario, false);
        hidePanel(panel_c_banco, false);
        hidePanel(panel_inversion, true);
    }//GEN-LAST:event_btn_inversionesActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.dispose();
        usuarios.setVisible(true);
        
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btn_appActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_appActionPerformed
        String mensaje = "<html><div style='text-aling: center;'>"+
                "<h1>Informacion de la Aplicación</h1><br/>"+
                "<p>Este proyecto está realizado con proposito academico sin intencion de lucro por el instituto de Ingenierias CETI.</p"+
                "<p>Quejas y Sugerencias comuniquece con @CETI.</p></div></html>";
        
        JOptionPane.showMessageDialog(null,mensaje, "Información de la Aplicación",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_appActionPerformed

    private void btnDevInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevInfoActionPerformed
        //SORRY
    }//GEN-LAST:event_btnDevInfoActionPerformed

    private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed
        String mensaje = "<html><div style='text-aling: center;'>"+
                "<h1>Desarrolladores</h1><br/>"+
                "<p>Programadores: Claudio Lara: 22310545, Kevin Huerta: 22310411, Randal Rojas: 22310438, Jorge Petterson: 22310359.</p"+
                "<p>Grupo: 3-P | CETI Colomos 2023 | Proyecto tercer parcial | Programación Orientada a Eventos.</p></div></html>";
        
        JOptionPane.showMessageDialog(null,mensaje, "Información",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnInformacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCerrarSesion;
    private javax.swing.JMenuItem btnClose;
    private javax.swing.JMenu btnDevInfo;
    private javax.swing.JMenuItem btnInformacion;
    private javax.swing.JMenu btnRecordatorios;
    private javax.swing.JMenu btnSalir;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_agregar_inv;
    private javax.swing.JButton btn_agregar_inv1;
    private javax.swing.JButton btn_app;
    private javax.swing.JButton btn_conversion;
    private javax.swing.JButton btn_cuentabanco;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_eliminar_inv;
    private javax.swing.JButton btn_gastos;
    private javax.swing.JButton btn_ingresos;
    private javax.swing.JButton btn_inversiones;
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_prestamos;
    private javax.swing.JButton btn_usuario;
    private javax.swing.JCheckBox chbMostrarPassword;
    private javax.swing.JComboBox<String> combox_proyeccion;
    private javax.swing.JComboBox<String> combox_tipo_tarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblRendimiento;
    private javax.swing.JPanel panel_c_banco;
    private javax.swing.JPanel panel_inversion;
    private javax.swing.JPanel panel_menulat;
    private javax.swing.JPanel panel_mov;
    private javax.swing.JPanel panel_saldo;
    private javax.swing.JPanel panel_usuario;
    private javax.swing.JTable tabla_mov;
    private javax.swing.JTextArea txtA_inv;
    private javax.swing.JLabel txt_ccv;
    private javax.swing.JLabel txt_celular;
    private javax.swing.JLabel txt_email;
    private javax.swing.JLabel txt_nombre;
    private javax.swing.JLabel txt_num_tarjeta;
    // End of variables declaration//GEN-END:variables
}
