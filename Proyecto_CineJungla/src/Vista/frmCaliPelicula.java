/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.Controlador;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;

/**
 *
 * @author user
 */
public class frmCaliPelicula extends javax.swing.JFrame {

    /**
     * Creates new form frmCaliPelicula
     */
    private Controlador cntl;
    public frmCaliPelicula(Controlador c) {
        initComponents();
        this.setTitle("Cine Jungla");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.cntl=c;
    }

    public JToggleButton getEstrella1() {
        return Estrella1;
    }

    public void setEstrella1(JToggleButton Estrella1) {
        this.Estrella1 = Estrella1;
    }

    public JToggleButton getEstrella2() {
        return Estrella2;
    }

    public void setEstrella2(JToggleButton Estrella2) {
        this.Estrella2 = Estrella2;
    }

    public JToggleButton getEstrella3() {
        return Estrella3;
    }

    public void setEstrella3(JToggleButton Estrella3) {
        this.Estrella3 = Estrella3;
    }

    public JToggleButton getEstrella4() {
        return Estrella4;
    }

    public void setEstrella4(JToggleButton Estrella4) {
        this.Estrella4 = Estrella4;
    }

    public JToggleButton getEstrella5() {
        return Estrella5;
    }

    public void setEstrella5(JToggleButton Estrella5) {
        this.Estrella5 = Estrella5;
    }

    public JTextArea getTxtReseñaP() {
        return txtReseñaP;
    }

    public void setTxtReseñaP(JTextArea txtReseñaP) {
        this.txtReseñaP = txtReseñaP;
    }

    public JButton getBtnBatman() {
        return btnBatman;
    }

    public void setBtnBatman(JButton btnBatman) {
        this.btnBatman = btnBatman;
    }

    public JButton getBtnContinuar() {
        return btnContinuar;
    }

    public void setBtnContinuar(JButton btnContinuar) {
        this.btnContinuar = btnContinuar;
    }

    public JButton getBtnEncanto() {
        return btnEncanto;
    }

    public void setBtnEncanto(JButton btnEncanto) {
        this.btnEncanto = btnEncanto;
    }

    public JButton getBtnMorbius() {
        return btnMorbius;
    }

    public void setBtnMorbius(JButton btnMorbius) {
        this.btnMorbius = btnMorbius;
    }

    public JButton getBtnSonic() {
        return btnSonic;
    }

    public void setBtnSonic(JButton btnSonic) {
        this.btnSonic = btnSonic;
    }

    public JButton getBtnUncharted() {
        return btnUncharted;
    }

    public void setBtnUncharted(JButton btnUncharted) {
        this.btnUncharted = btnUncharted;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnBatman = new javax.swing.JButton();
        btnUncharted = new javax.swing.JButton();
        btnMorbius = new javax.swing.JButton();
        btnSonic = new javax.swing.JButton();
        btnEncanto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        Estrella1 = new javax.swing.JToggleButton();
        Estrella2 = new javax.swing.JToggleButton();
        Estrella3 = new javax.swing.JToggleButton();
        Estrella4 = new javax.swing.JToggleButton();
        Estrella5 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReseñaP = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(253, 255, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBatman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Batman.png"))); // NOI18N
        btnBatman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatmanActionPerformed(evt);
            }
        });
        jPanel1.add(btnBatman, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 240, 330));

        btnUncharted.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Uncharted.jpg"))); // NOI18N
        btnUncharted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnchartedActionPerformed(evt);
            }
        });
        jPanel1.add(btnUncharted, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 100, 240, 330));

        btnMorbius.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Morbius.jpg"))); // NOI18N
        btnMorbius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMorbiusActionPerformed(evt);
            }
        });
        jPanel1.add(btnMorbius, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 240, 330));

        btnSonic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sonic.jpg"))); // NOI18N
        btnSonic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonicActionPerformed(evt);
            }
        });
        jPanel1.add(btnSonic, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 240, 330));

        btnEncanto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Encanto.jpg"))); // NOI18N
        btnEncanto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncantoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEncanto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 100, 240, 330));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calificación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 260, 70));

        btnContinuar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 520, 150, 50));

        buttonGroup1.add(Estrella1);
        Estrella1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Estrella1.png"))); // NOI18N
        jPanel1.add(Estrella1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 80, 80));

        buttonGroup1.add(Estrella2);
        Estrella2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Estrella2.png"))); // NOI18N
        jPanel1.add(Estrella2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 80, 80));

        buttonGroup1.add(Estrella3);
        Estrella3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Estrella3.png"))); // NOI18N
        jPanel1.add(Estrella3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 80, 80));

        buttonGroup1.add(Estrella4);
        Estrella4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Estrella4.png"))); // NOI18N
        jPanel1.add(Estrella4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 80, 80));

        buttonGroup1.add(Estrella5);
        Estrella5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Estrella5.png"))); // NOI18N
        jPanel1.add(Estrella5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 80, 80));

        txtReseñaP.setColumns(20);
        txtReseñaP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtReseñaP.setRows(5);
        jScrollPane1.setViewportView(txtReseñaP);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, 410, 180));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Reseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1299, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncantoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncantoActionPerformed
        btnBatman.setEnabled(true);
        btnUncharted.setEnabled(true);
        btnEncanto.setEnabled(false);
        btnMorbius.setEnabled(true);
        btnSonic.setEnabled(true);
    }//GEN-LAST:event_btnEncantoActionPerformed

    private void btnSonicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonicActionPerformed
        btnBatman.setEnabled(true);
        btnUncharted.setEnabled(true);
        btnEncanto.setEnabled(true);
        btnMorbius.setEnabled(true);
        btnSonic.setEnabled(false);
    }//GEN-LAST:event_btnSonicActionPerformed

    private void btnMorbiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMorbiusActionPerformed
        btnBatman.setEnabled(true);
        btnUncharted.setEnabled(true);
        btnEncanto.setEnabled(true);
        btnMorbius.setEnabled(false);
        btnSonic.setEnabled(true);
    }//GEN-LAST:event_btnMorbiusActionPerformed

    private void btnUnchartedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnchartedActionPerformed
        btnBatman.setEnabled(true);
        btnUncharted.setEnabled(false);
        btnEncanto.setEnabled(true);
        btnMorbius.setEnabled(true);
        btnSonic.setEnabled(true);
    }//GEN-LAST:event_btnUnchartedActionPerformed

    private void btnBatmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatmanActionPerformed
        btnBatman.setEnabled(false);
        btnUncharted.setEnabled(true);
        btnEncanto.setEnabled(true);
        btnMorbius.setEnabled(true);
        btnSonic.setEnabled(true);
    }//GEN-LAST:event_btnBatmanActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        this.cntl.newPeli();
    }//GEN-LAST:event_btnContinuarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Estrella1;
    private javax.swing.JToggleButton Estrella2;
    private javax.swing.JToggleButton Estrella3;
    private javax.swing.JToggleButton Estrella4;
    private javax.swing.JToggleButton Estrella5;
    private javax.swing.JButton btnBatman;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnEncanto;
    private javax.swing.JButton btnMorbius;
    private javax.swing.JButton btnSonic;
    private javax.swing.JButton btnUncharted;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtReseñaP;
    // End of variables declaration//GEN-END:variables
}
