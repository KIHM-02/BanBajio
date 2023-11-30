package banbajio;

import java.text.DecimalFormat;

public class Conversor extends javax.swing.JInternalFrame {

    public Conversor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MonedaOrigen = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MonedaCambiada = new javax.swing.JComboBox<>();
        txtMoneda = new javax.swing.JTextField();
        txtMonedaCambiada = new javax.swing.JTextField();
        btn_agregar_inv = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        MonedaOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peso (Mexicano)", "Euro", "Dolar" }));

        jLabel1.setText("Tipo Moneda");

        jLabel2.setText("Moneda a cambiar");

        MonedaCambiada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peso (Mexicano)", "Euro", "Dolar" }));

        txtMoneda.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtMonedaCambiada.setEditable(false);
        txtMonedaCambiada.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMonedaCambiada.setForeground(new java.awt.Color(0, 0, 0));
        txtMonedaCambiada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMonedaCambiada.setEnabled(false);

        btn_agregar_inv.setBackground(new java.awt.Color(183, 112, 255));
        btn_agregar_inv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_agregar_inv.setText("CONVERTIR");
        btn_agregar_inv.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_agregar_inv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_invActionPerformed(evt);
            }
        });

        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_agregar_inv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMoneda)
                            .addComponent(MonedaOrigen, 0, 126, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtMonedaCambiada, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(MonedaCambiada, javax.swing.GroupLayout.Alignment.LEADING, 0, 126, Short.MAX_VALUE))
                            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 26, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MonedaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MonedaCambiada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonedaCambiada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_agregar_inv, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btn_agregar_invActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_invActionPerformed
        double cantidadOriginal = Double.parseDouble(txtMoneda.getText());
        
        String monedaOrigen = MonedaOrigen.getSelectedItem().toString();
        String monedaCambiada = MonedaCambiada.getSelectedItem().toString();
        
        double cantidadConvertida = convertirMoneda(cantidadOriginal, monedaOrigen, monedaCambiada);
        
        
        DecimalFormat df = new DecimalFormat("#.##");
        String resultadoFormateado = df.format(cantidadConvertida);
        
        txtMonedaCambiada.setText(resultadoFormateado);
    }//GEN-LAST:event_btn_agregar_invActionPerformed

    private double convertirMoneda(double cantidadOriginal, String MonedaOrigen, String MonedaCambiada){
        double factorConversion = 0.0;
        
        if(MonedaOrigen.equals("Dolar")){
            if(MonedaCambiada.equals("Euro")){
                factorConversion = 0.85;
            }else if(MonedaCambiada.equals("Peso (Mexicano)")){
                factorConversion = 17.14;
            }else{
                factorConversion = 1.0;
            }
        }else if(MonedaOrigen.equals("Euro")){
            if(MonedaCambiada.equals("Dolar")){
                factorConversion = 1.18;
            }else if(MonedaCambiada.equals("Peso (Mexicano)")){
                factorConversion = 18.75;
            }else{
                factorConversion = 1.0;
            }
        }else if(MonedaOrigen.equals("Peso (Mexicano)")){
            if(MonedaCambiada.equals("Dolar")){
                factorConversion = 0.058;
            }else if(MonedaCambiada.equals("Euro")){
                factorConversion = 0.053;
            }else{
                factorConversion = 1.0;
            }
        }
        
        return cantidadOriginal * factorConversion;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> MonedaCambiada;
    private javax.swing.JComboBox<String> MonedaOrigen;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btn_agregar_inv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtMoneda;
    private javax.swing.JTextField txtMonedaCambiada;
    // End of variables declaration//GEN-END:variables
}
