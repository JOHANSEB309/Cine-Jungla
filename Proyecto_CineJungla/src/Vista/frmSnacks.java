/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.Controlador;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class frmSnacks extends javax.swing.JFrame {

    /**
     * Creates new form frmSnacks
     */
    
    private Controlador cntl;
    
    public frmSnacks(Controlador c) {
        initComponents();
        this.cntl=c;
        this.setTitle("Cine Jungla");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.error.setVisible(false);
        this.setSize(1050, 700);
        if(this.cntl.getEm()==null){
            this.verif.setVisible(false);
            this.docs.setVisible(false);
            this.cod.setVisible(false);
        }
    }

    

    public void verNumero(java.awt.event.KeyEvent evt) {
        //Verifica que sea un número
        char caracter = evt.getKeyChar();
        if (Character.isLetter(caracter)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten numeros");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtSaladas = new javax.swing.JTextField();
        txtDulces = new javax.swing.JTextField();
        txtMixtas = new javax.swing.JTextField();
        txtHotdog = new javax.swing.JTextField();
        txtNachos = new javax.swing.JTextField();
        txtChocolatina = new javax.swing.JTextField();
        txtGasesosa = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        cod = new javax.swing.JTextField();
        docs = new javax.swing.JLabel();
        verif = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuClose = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSaladas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSaladas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaladasKeyTyped(evt);
            }
        });
        jPanel1.add(txtSaladas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 80, 20));

        txtDulces.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDulces.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDulcesKeyTyped(evt);
            }
        });
        jPanel1.add(txtDulces, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 80, -1));

        txtMixtas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMixtas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMixtasKeyTyped(evt);
            }
        });
        jPanel1.add(txtMixtas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 80, 20));

        txtHotdog.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHotdog.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHotdogKeyTyped(evt);
            }
        });
        jPanel1.add(txtHotdog, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 80, 30));

        txtNachos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNachos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNachosKeyTyped(evt);
            }
        });
        jPanel1.add(txtNachos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 80, 30));

        txtChocolatina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtChocolatina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChocolatinaActionPerformed(evt);
            }
        });
        txtChocolatina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtChocolatinaKeyTyped(evt);
            }
        });
        jPanel1.add(txtChocolatina, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 80, 30));

        txtGasesosa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGasesosa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGasesosaKeyTyped(evt);
            }
        });
        jPanel1.add(txtGasesosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, 80, 30));

        btnConfirmar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConfirmar.setText("Confirmar Compra");
        jPanel1.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 180, 60));

        cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codActionPerformed(evt);
            }
        });
        jPanel1.add(cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, 90, 30));

        docs.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        docs.setText("Documento del usuario");
        jPanel1.add(docs, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 460, 150, -1));

        verif.setText("Verificar");
        jPanel1.add(verif, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 540, -1, -1));

        error.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        error.setText("El documento no se encuentra registrado");
        jPanel1.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 570, 260, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fondo6.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 840));

        jMenu1.setText("Ajustes");

        menuClose.setText("Cerrar Sesión");
        menuClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCloseActionPerformed(evt);
            }
        });
        jMenu1.add(menuClose);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSaladasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaladasKeyTyped
        //Verifica que sea un número
        char caracter = evt.getKeyChar();
        if (Character.isLetter(caracter)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten numeros");
        }
    }//GEN-LAST:event_txtSaladasKeyTyped

    private void txtDulcesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDulcesKeyTyped
        verNumero(evt);
    }//GEN-LAST:event_txtDulcesKeyTyped

    private void txtMixtasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMixtasKeyTyped
        verNumero(evt);
    }//GEN-LAST:event_txtMixtasKeyTyped

    private void txtHotdogKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHotdogKeyTyped
        verNumero(evt);
    }//GEN-LAST:event_txtHotdogKeyTyped

    private void txtNachosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNachosKeyTyped
        verNumero(evt);
    }//GEN-LAST:event_txtNachosKeyTyped

    private void txtChocolatinaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChocolatinaKeyTyped
        verNumero(evt);
    }//GEN-LAST:event_txtChocolatinaKeyTyped

    private void txtGasesosaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGasesosaKeyTyped
        verNumero(evt);
    }//GEN-LAST:event_txtGasesosaKeyTyped

    private void codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codActionPerformed

    private void txtChocolatinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChocolatinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChocolatinaActionPerformed

    private void menuCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
        this.cntl.setEmpleado(null);
        this.cntl.setPer(null);
        this.cntl.newPeli();
    }//GEN-LAST:event_menuCloseActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JTextField cod;
    private javax.swing.JLabel docs;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuClose;
    private javax.swing.JTextField txtChocolatina;
    private javax.swing.JTextField txtDulces;
    private javax.swing.JTextField txtGasesosa;
    private javax.swing.JTextField txtHotdog;
    private javax.swing.JTextField txtMixtas;
    private javax.swing.JTextField txtNachos;
    private javax.swing.JTextField txtSaladas;
    private javax.swing.JButton verif;
    // End of variables declaration//GEN-END:variables
}
