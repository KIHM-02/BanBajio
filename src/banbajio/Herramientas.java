package banbajio;

public class Herramientas extends javax.swing.JFrame {

    private Menu menu;
    
    public Herramientas(Menu menu) 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); 
        this.menu = menu;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        lblImagenLogo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnHerramientas = new javax.swing.JMenu();
        btnCalculadora = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnCerrarConversor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblImagenLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logotipo.png"))); // NOI18N

        desktopPane.setLayer(lblImagenLogo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPaneLayout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(lblImagenLogo)
                .addGap(130, 130, 130))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(lblImagenLogo)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        btnHerramientas.setText("Herramientas");

        btnCalculadora.setText("Calculadora");
        btnCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculadoraActionPerformed(evt);
            }
        });
        btnHerramientas.add(btnCalculadora);

        jMenuItem2.setText("Conversor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        btnHerramientas.add(jMenuItem2);

        jMenuBar1.add(btnHerramientas);

        jMenu1.setText("Regresar");

        btnCerrarConversor.setText("Cerrar");
        btnCerrarConversor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarConversorActionPerformed(evt);
            }
        });
        jMenu1.add(btnCerrarConversor);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarConversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarConversorActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarConversorActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Conversor cvMonedas = new Conversor();
        desktopPane.add(cvMonedas);
        cvMonedas.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculadoraActionPerformed
        Calculadora calculadora = new Calculadora();
        desktopPane.add(calculadora);
        calculadora.show();
    }//GEN-LAST:event_btnCalculadoraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCalculadora;
    private javax.swing.JMenuItem btnCerrarConversor;
    private javax.swing.JMenu btnHerramientas;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblImagenLogo;
    // End of variables declaration//GEN-END:variables
}
