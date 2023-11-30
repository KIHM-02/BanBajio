
package banbajio;

import Listas.Pila_Tarjeta;

public class Formulario extends javax.swing.JFrame {
    
    private Menu menu;
    private Pila_Tarjeta pila;
    private int id;

    public Formulario(Menu menu, Pila_Tarjeta pila, int id) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.menu = menu;
        this.pila = pila;
        this.id = id;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_numero_Tarjeta = new javax.swing.JTextField();
        txt_fecha_Off = new javax.swing.JTextField();
        txt_security_Code = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_Telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cb_tipo_Tarjeta = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btn_Guardar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnCerrarFormulario = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(183, 112, 255));
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(183, 112, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logotipo.png"))); // NOI18N

        txt_numero_Tarjeta.setText("Numero de tarjeta");
        txt_numero_Tarjeta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_numero_TarjetaFocusGained(evt);
            }
        });

        txt_fecha_Off.setText("Fecha de expiracion");
        txt_fecha_Off.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_fecha_OffFocusGained(evt);
            }
        });

        txt_security_Code.setText("Codigo de seguridad");
        txt_security_Code.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_security_CodeFocusGained(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tarjeta.png"))); // NOI18N
        jLabel3.setToolTipText("");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/fecha.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lock.png"))); // NOI18N

        txt_Telefono.setText("Telefono");
        txt_Telefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_TelefonoFocusGained(evt);
            }
        });
        txt_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TelefonoActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/phone.png"))); // NOI18N

        cb_tipo_Tarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DEBITO", "CREDITO" }));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tarjeta.png"))); // NOI18N
        jLabel7.setToolTipText("");

        btn_Guardar.setBackground(new java.awt.Color(255, 51, 102));
        btn_Guardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_fecha_Off)
                                    .addComponent(txt_security_Code, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(txt_numero_Tarjeta)
                                    .addComponent(txt_Telefono)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cb_tipo_Tarjeta, 0, 175, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1)))
                .addGap(117, 117, 117))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Guardar)
                .addGap(170, 170, 170))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_tipo_Tarjeta))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_numero_Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_fecha_Off, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_security_Code, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(btn_Guardar)
                .addGap(9, 9, 9))
        );

        getContentPane().add(jPanel1);

        btnCerrarFormulario.setText("Regresar");

        jMenuItem1.setText("Cerrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        btnCerrarFormulario.add(jMenuItem1);

        jMenuBar1.add(btnCerrarFormulario);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        String tipoTarjeta = (String) cb_tipo_Tarjeta.getSelectedItem();
        String numeroTarjeta = txt_numero_Tarjeta.getText();
        String fecha_Off = txt_fecha_Off.getText();
        int security_Code = Integer.parseInt(txt_security_Code.getText());
        String Telefono = txt_Telefono.getText();
        
        pila.push(id, tipoTarjeta, numeroTarjeta, fecha_Off, security_Code);
        
        menu.verifyCards(true);
        dispose();
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txt_numero_TarjetaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_numero_TarjetaFocusGained
        txt_numero_Tarjeta.setText("");    
    }//GEN-LAST:event_txt_numero_TarjetaFocusGained

    private void txt_fecha_OffFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_fecha_OffFocusGained
        txt_fecha_Off.setText("");
    }//GEN-LAST:event_txt_fecha_OffFocusGained

    private void txt_security_CodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_security_CodeFocusGained
        txt_security_Code.setText("");
    }//GEN-LAST:event_txt_security_CodeFocusGained

    private void txt_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelefonoActionPerformed
        //SORRY
    }//GEN-LAST:event_txt_TelefonoActionPerformed

    private void txt_TelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TelefonoFocusGained
        txt_Telefono.setText("");
    }//GEN-LAST:event_txt_TelefonoFocusGained
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnCerrarFormulario;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JComboBox<String> cb_tipo_Tarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Telefono;
    private javax.swing.JTextField txt_fecha_Off;
    private javax.swing.JTextField txt_numero_Tarjeta;
    private javax.swing.JTextField txt_security_Code;
    // End of variables declaration//GEN-END:variables
}
