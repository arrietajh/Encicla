/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Geraldine Acevedo Restrepo
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(this);
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Registro_Btn = new javax.swing.JMenu();
        R_User_Btn = new javax.swing.JMenuItem();
        R_Bycicle_Btn = new javax.swing.JMenuItem();
        Operacion_Btn = new javax.swing.JMenu();
        Op_Prestamo_Btn = new javax.swing.JMenuItem();
        Op_Devolucion_Btn = new javax.swing.JMenuItem();
        Reporte_Btn = new javax.swing.JMenu();
        btnBicicletasPDF = new javax.swing.JMenuItem();
        Rep_Bycicle_Btn = new javax.swing.JMenu();
        Rep_Byc_Prestamo_Btn = new javax.swing.JMenuItem();
        Rep_Byc_Devolucion_Btn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        escritorio.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                escritorioComponentMoved(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Muevete libremente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 720, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Registro_Btn.setText("Registro");

        R_User_Btn.setText("Usuarios");
        R_User_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_User_BtnActionPerformed(evt);
            }
        });
        Registro_Btn.add(R_User_Btn);

        R_Bycicle_Btn.setText("Bicicletas");
        R_Bycicle_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_Bycicle_BtnActionPerformed(evt);
            }
        });
        Registro_Btn.add(R_Bycicle_Btn);

        jMenuBar1.add(Registro_Btn);

        Operacion_Btn.setText("Operaciones");

        Op_Prestamo_Btn.setText("Prestamo");
        Op_Prestamo_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op_Prestamo_BtnActionPerformed(evt);
            }
        });
        Operacion_Btn.add(Op_Prestamo_Btn);

        Op_Devolucion_Btn.setText("Devolución");
        Op_Devolucion_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op_Devolucion_BtnActionPerformed(evt);
            }
        });
        Operacion_Btn.add(Op_Devolucion_Btn);

        jMenuBar1.add(Operacion_Btn);

        Reporte_Btn.setText("Reportes");

        btnBicicletasPDF.setText("Bicicletas");
        btnBicicletasPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBicicletasPDFActionPerformed(evt);
            }
        });
        Reporte_Btn.add(btnBicicletasPDF);
        btnBicicletasPDF.getAccessibleContext().setAccessibleName("Bicicletas");

        Rep_Bycicle_Btn.setText("Historial");

        Rep_Byc_Prestamo_Btn.setText("Prestamo");
        Rep_Byc_Prestamo_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rep_Byc_Prestamo_BtnActionPerformed(evt);
            }
        });
        Rep_Bycicle_Btn.add(Rep_Byc_Prestamo_Btn);

        Rep_Byc_Devolucion_Btn.setText("Devolucion");
        Rep_Byc_Devolucion_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rep_Byc_Devolucion_BtnActionPerformed(evt);
            }
        });
        Rep_Bycicle_Btn.add(Rep_Byc_Devolucion_Btn);

        Reporte_Btn.add(Rep_Bycicle_Btn);

        jMenuBar1.add(Reporte_Btn);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void escritorioComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_escritorioComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_escritorioComponentMoved

    public JPanel getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JPanel escritorio) {
        this.escritorio = escritorio;
    }

    private void R_User_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_User_BtnActionPerformed
        // TODO add your handling code here:

        
    }//GEN-LAST:event_R_User_BtnActionPerformed

    private void R_Bycicle_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_Bycicle_BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_Bycicle_BtnActionPerformed

    private void Op_Prestamo_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op_Prestamo_BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Op_Prestamo_BtnActionPerformed

    private void Op_Devolucion_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op_Devolucion_BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Op_Devolucion_BtnActionPerformed

    private void btnBicicletasPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBicicletasPDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBicicletasPDFActionPerformed

    private void Rep_Byc_Prestamo_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rep_Byc_Prestamo_BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rep_Byc_Prestamo_BtnActionPerformed

    private void Rep_Byc_Devolucion_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rep_Byc_Devolucion_BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rep_Byc_Devolucion_BtnActionPerformed

    public JMenuItem getOp_Devolucion_Btn() {
        return Op_Devolucion_Btn;
    }

    public void setOp_Devolucion_Btn(JMenuItem Op_Devolucion_Btn) {
        this.Op_Devolucion_Btn = Op_Devolucion_Btn;
    }

    public JMenuItem getOp_Prestamo_Btn() {
        return Op_Prestamo_Btn;
    }

    public void setOp_Prestamo_Btn(JMenuItem Op_Prestamo_Btn) {
        this.Op_Prestamo_Btn = Op_Prestamo_Btn;
    }

    public JMenu getOperacion_Btn() {
        return Operacion_Btn;
    }

    public void setOperacion_Btn(JMenu Operacion_Btn) {
        this.Operacion_Btn = Operacion_Btn;
    }

    public JMenuItem getR_Bycicle_Btn() {
        return R_Bycicle_Btn;
    }

    public void setR_Bycicle_Btn(JMenuItem R_Bycicle_Btn) {
        this.R_Bycicle_Btn = R_Bycicle_Btn;
    }

    public JMenuItem getR_User_Btn() {
        return R_User_Btn;
    }

    public void setR_User_Btn(JMenuItem R_User_Btn) {
        this.R_User_Btn = R_User_Btn;
    }

    public JMenu getRegistro_Btn() {
        return Registro_Btn;
    }

    public void setRegistro_Btn(JMenu Registro_Btn) {
        this.Registro_Btn = Registro_Btn;
    }

    public JMenuItem getRep_Byc_Devolucion_Btn() {
        return Rep_Byc_Devolucion_Btn;
    }

    public void setRep_Byc_Devolucion_Btn(JMenuItem Rep_Byc_Devolucion_Btn) {
        this.Rep_Byc_Devolucion_Btn = Rep_Byc_Devolucion_Btn;
    }

    public JMenuItem getRep_Byc_Prestamo_Btn() {
        return Rep_Byc_Prestamo_Btn;
    }

    public void setRep_Byc_Prestamo_Btn(JMenuItem Rep_Byc_Prestamo_Btn) {
        this.Rep_Byc_Prestamo_Btn = Rep_Byc_Prestamo_Btn;
    }

    public JMenu getRep_Bycicle_Btn() {
        return Rep_Bycicle_Btn;
    }

    public void setRep_Bycicle_Btn(JMenu Rep_Bycicle_Btn) {
        this.Rep_Bycicle_Btn = Rep_Bycicle_Btn;
    }

    public JMenuItem getbtnBicicletasPDF() {
        return btnBicicletasPDF;
    }

    public void setbtnBicicletasPDF(JMenuItem Rep_Usuarios_Btn) {
        this.btnBicicletasPDF = Rep_Usuarios_Btn;
    }

    public JMenu getReporte_Btn() {
        return Reporte_Btn;
    }

    public void setReporte_Btn(JMenu Reporte_Btn) {
        this.Reporte_Btn = Reporte_Btn;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    public JPanel getjPanel1() {
        return escritorio;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.escritorio = jPanel1;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Op_Devolucion_Btn;
    private javax.swing.JMenuItem Op_Prestamo_Btn;
    private javax.swing.JMenu Operacion_Btn;
    private javax.swing.JMenuItem R_Bycicle_Btn;
    private javax.swing.JMenuItem R_User_Btn;
    private javax.swing.JMenu Registro_Btn;
    private javax.swing.JMenuItem Rep_Byc_Devolucion_Btn;
    private javax.swing.JMenuItem Rep_Byc_Prestamo_Btn;
    private javax.swing.JMenu Rep_Bycicle_Btn;
    private javax.swing.JMenu Reporte_Btn;
    private javax.swing.JMenuItem btnBicicletasPDF;
    private javax.swing.JPanel escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
