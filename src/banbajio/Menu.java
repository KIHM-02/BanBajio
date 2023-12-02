package banbajio;

import Listas.Lista_User;
import Listas.Pila_Tarjeta;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    private Usuarios usuarios; 
    private Pila_Tarjeta pila;
    private int id;
    private Lista_User lista;
    
    public Menu(Usuarios usuarios,Lista_User lista, Pila_Tarjeta pila, int id) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        hidePanel(panel_mov, true);
        hidePanel(panel_usuario, false);
        hidePanel(panel_c_banco, false);
        hidePanel(panel_inversion, false);
        
        this.usuarios = usuarios;
        this.lista = lista;
        this.pila = pila;
        this.id = id;
        
        verifyCards(false);
    }

    public void verifyCards(boolean state)
    {
        if(pila.buscartarjeta(id) == false)
        {
            btn_usuario.setEnabled(state);
            btn_inversiones.setEnabled(state);
            btn_cuentabanco.setEnabled(state);
            btn_menu.setEnabled(state);
            btn_prestamos.setEnabled(state);
            
            hidePanel(panel_mov, state);
            hidePanel(panel_usuario, false);
            hidePanel(panel_c_banco, false);
            hidePanel(panel_inversion, false);
        }
        else
        {
            btn_usuario.setEnabled(state);
            btn_inversiones.setEnabled(state);
            btn_cuentabanco.setEnabled(state);
            btn_menu.setEnabled(state);
            btn_prestamos.setEnabled(state);
            
            hidePanel(panel_mov, state);
            hidePanel(panel_usuario, false);
            hidePanel(panel_c_banco, false);
            hidePanel(panel_inversion, false);
        }
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
        lbl_num_tarjeta = new javax.swing.JLabel();
        lbl_ccv = new javax.swing.JLabel();
        lblFechaExpiracion = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnBuscarTarjeta = new javax.swing.JButton();
        panel_usuario = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel6 = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblcontraseña = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnModificarUsuario = new javax.swing.JButton();
        chbMostrarPassword = new javax.swing.JCheckBox();
        panel_menulat = new javax.swing.JPanel();
        btn_app = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_menu = new javax.swing.JButton();
        btn_usuario = new javax.swing.JButton();
        btn_cuentabanco = new javax.swing.JButton();
        btn_inversiones = new javax.swing.JButton();
        btn_prestamos = new javax.swing.JButton();
        btn_conversion = new javax.swing.JButton();
        btn_Formulario = new javax.swing.JButton();
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
        combox_tipo_tarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DEBITO", "CREDITO" }));

        lbl_num_tarjeta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_num_tarjeta.setText("número predeterminado");

        lbl_ccv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_ccv.setText("código predeterminado");

        lblFechaExpiracion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaExpiracion.setText("fecha predeterminada");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tarjeta.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tarjeta.png"))); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lock.png"))); // NOI18N

        btnBuscarTarjeta.setText("BUSCAR");
        btnBuscarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTarjetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_c_bancoLayout = new javax.swing.GroupLayout(panel_c_banco);
        panel_c_banco.setLayout(panel_c_bancoLayout);
        panel_c_bancoLayout.setHorizontalGroup(
            panel_c_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_c_bancoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panel_c_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_c_bancoLayout.createSequentialGroup()
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
                                    .addComponent(lbl_num_tarjeta)
                                    .addComponent(lblFechaExpiracion)
                                    .addComponent(lbl_ccv)))))
                    .addComponent(btnBuscarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(lbl_num_tarjeta))
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(panel_c_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_c_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(lbl_ccv))
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(panel_c_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lblFechaExpiracion))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        getContentPane().add(panel_c_banco, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 105, -1, -1));

        panel_usuario.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Nombre de usuario");

        lblnombre.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblnombre.setText("nombre predeterminado");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Correo electrónico");

        lblemail.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblemail.setText("correo predeterminado");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Contraseña");

        lblcontraseña.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblcontraseña.setText("contraseña predeterminada");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/usuario.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/correo.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lock.png"))); // NOI18N

        btnModificarUsuario.setBackground(new java.awt.Color(183, 112, 255));
        btnModificarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificarUsuario.setText("MODIFICAR DATOS");
        btnModificarUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUsuarioActionPerformed(evt);
            }
        });

        chbMostrarPassword.setText("Mostrar");
        chbMostrarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbMostrarPasswordActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblnombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblemail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblcontraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnModificarUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(chbMostrarPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(54, 54, 54)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chbMostrarPassword)
                                    .addComponent(lblcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(lblnombre))
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(lblemail))
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(lblcontraseña)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbMostrarPassword)
                .addGap(39, 39, 39)
                .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_usuarioLayout = new javax.swing.GroupLayout(panel_usuario);
        panel_usuario.setLayout(panel_usuarioLayout);
        panel_usuarioLayout.setHorizontalGroup(
            panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        panel_usuarioLayout.setVerticalGroup(
            panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
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

        btn_Formulario.setBackground(new java.awt.Color(255, 51, 102));
        btn_Formulario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Formulario.setForeground(new java.awt.Color(255, 255, 255));
        btn_Formulario.setText("Agregar Tarjeta");
        btn_Formulario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_Formulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FormularioActionPerformed(evt);
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
            .addComponent(btn_Formulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Formulario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
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
                .addContainerGap(191, Short.MAX_VALUE)
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
        System.exit(0);
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

    private void btn_FormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FormularioActionPerformed
        Formulario formulario = new Formulario(this, pila, id);
        formulario.setVisible(true);
    }//GEN-LAST:event_btn_FormularioActionPerformed

    private void btnBuscarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTarjetaActionPerformed
        String tipoTarjeta = (String) combox_tipo_tarjeta.getSelectedItem();
        
        String[] datos = pila.displayCardInformation(id, tipoTarjeta);
        
        if(datos != null)
        {
            lbl_num_tarjeta.setText(datos[0]);
            lblFechaExpiracion.setText(datos[1]);
            lbl_ccv.setText(datos[2]);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Hubo un error al mostrar los datos", "Avisos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarTarjetaActionPerformed

    private void chbMostrarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbMostrarPasswordActionPerformed
      //Sorry
    }//GEN-LAST:event_chbMostrarPasswordActionPerformed

    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
       String[] datos = lista.getUserInformation(id);
       
       lblnombre.setText(datos[0]);
       lblcontraseña.setText(datos[2]);
       lblemail.setText(datos[1]);
        
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarTarjeta;
    private javax.swing.JMenuItem btnCerrarSesion;
    private javax.swing.JMenuItem btnClose;
    private javax.swing.JMenu btnDevInfo;
    private javax.swing.JMenuItem btnInformacion;
    private javax.swing.JButton btnModificarUsuario;
    private javax.swing.JMenu btnRecordatorios;
    private javax.swing.JMenu btnSalir;
    private javax.swing.JButton btn_Formulario;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_agregar_inv;
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
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFechaExpiracion;
    private javax.swing.JLabel lblRendimiento;
    private javax.swing.JLabel lbl_ccv;
    private javax.swing.JLabel lbl_num_tarjeta;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JPanel panel_c_banco;
    private javax.swing.JPanel panel_inversion;
    private javax.swing.JPanel panel_menulat;
    private javax.swing.JPanel panel_mov;
    private javax.swing.JPanel panel_saldo;
    private javax.swing.JPanel panel_usuario;
    private javax.swing.JTable tabla_mov;
    private javax.swing.JTextArea txtA_inv;
    // End of variables declaration//GEN-END:variables
}
