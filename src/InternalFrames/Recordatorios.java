package InternalFrames;

import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Recordatorios extends javax.swing.JFrame 
{

    public Recordatorios() 
    {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Icon/logotipo.png")).getImage());
        this.setLocationRelativeTo(null);
        
        notas = new HashMap<>();
        
        txt_area_recordatorios.setLineWrap(true);
        txt_area_recordatorios.setWrapStyleWord(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area_recordatorios = new javax.swing.JTextArea();
        btn_agregar_record = new javax.swing.JButton();
        btn_buscar_record = new javax.swing.JButton();
        btn_eliminar_record = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_recordatorio = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        btn_salir = new javax.swing.JMenu();
        btnGoBack = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        txt_area_recordatorios.setColumns(20);
        txt_area_recordatorios.setRows(5);
        jScrollPane1.setViewportView(txt_area_recordatorios);

        btn_agregar_record.setBackground(new java.awt.Color(183, 112, 255));
        btn_agregar_record.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_agregar_record.setText("AGREGAR");
        btn_agregar_record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_recordActionPerformed(evt);
            }
        });

        btn_buscar_record.setBackground(new java.awt.Color(183, 112, 255));
        btn_buscar_record.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_buscar_record.setText("BUSCAR");
        btn_buscar_record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_recordActionPerformed(evt);
            }
        });

        btn_eliminar_record.setBackground(new java.awt.Color(255, 51, 102));
        btn_eliminar_record.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_eliminar_record.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar_record.setText("ELIMINAR");
        btn_eliminar_record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_recordActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logotipo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Recordatorios");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese la fecha de su recordatorio");

        btn_salir.setText("Salir");

        btnGoBack.setText("Cerrar");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });
        btn_salir.add(btnGoBack);

        jMenuBar1.add(btn_salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_buscar_record, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_agregar_record, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_eliminar_record, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txt_recordatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_recordatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_agregar_record)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar_record)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar_record)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnGoBackActionPerformed
    
    private Map<String, String> notas;
    
    private void btn_agregar_recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_recordActionPerformed
        String fecha = txt_recordatorio.getText();
        String nota = txt_area_recordatorios.getText();
        
        notas.put(fecha, nota);
        
        JOptionPane.showMessageDialog(this, "Nota agregada correctamente");
        
        txt_recordatorio.setText("");
        txt_area_recordatorios.setText("");
    }//GEN-LAST:event_btn_agregar_recordActionPerformed

    private void btn_eliminar_recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_recordActionPerformed
        String fecha = txt_recordatorio.getText();
        
        if(notas.containsKey(fecha)){
            notas.remove(fecha);
            JOptionPane.showMessageDialog(this, "Nota eliminada correctamente");
            
            txt_recordatorio.setText("");
            txt_area_recordatorios.setText("");
        }else{
            JOptionPane.showMessageDialog(this, "La fecha ingresada no tiene ninguna nota asociada");
        }
    }//GEN-LAST:event_btn_eliminar_recordActionPerformed

    private void btn_buscar_recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_recordActionPerformed
        String fecha = txt_recordatorio.getText();
        
        if(notas.containsKey(fecha)){
            String notaEncontrada = notas.get(fecha);
            txt_area_recordatorios.setText(notaEncontrada);
        }else{
            JOptionPane.showMessageDialog(this, "No se encontró ninguna nota para la fecha ingresada");
        }
    }//GEN-LAST:event_btn_buscar_recordActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnGoBack;
    private javax.swing.JButton btn_agregar_record;
    private javax.swing.JButton btn_buscar_record;
    private javax.swing.JButton btn_eliminar_record;
    private javax.swing.JMenu btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt_area_recordatorios;
    private javax.swing.JTextField txt_recordatorio;
    // End of variables declaration//GEN-END:variables
}
