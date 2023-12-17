/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Color;

/**
 *
 * @author ryanf
 */
public class FrameUtama extends javax.swing.JFrame {

    /**
     * Creates new form Marketplace
     */
    
    public FrameUtama() {
        
        initComponents();
        
        PanelDashboard = new PanelDashboard().getPanelDashboard();
        add(PanelDashboard);
        PanelDashboard.setBounds(0, 0, 847, 505);
        
        PanelJual = new PanelPenjualan().getPanelPenjualan();
        add(PanelJual);
        PanelJual.setBounds(0, 0, 847, 505);
        
        PanelRestok = new PanelRestok().getPanelRestok();
        add(PanelRestok);
        PanelRestok.setBounds(0, 0, 847, 505);
        
        PanelJual.setVisible(false);
        PanelRestok.setVisible(false);
    }
    
    public void showPanelDashboard(){
        PanelJual.setVisible(false);
        PanelRestok.setVisible(false);
        PanelDashboard.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Navbar = new javax.swing.JPanel();
        TombolDashboard_bg = new javax.swing.JPanel();
        TombolDashboard = new javax.swing.JButton();
        TombolJual_bg = new javax.swing.JPanel();
        TombolJual = new javax.swing.JButton();
        TombolRestok_bg = new javax.swing.JPanel();
        TombolRestok = new javax.swing.JButton();
        TombolLogin_bg = new javax.swing.JPanel();
        TombolLogin = new javax.swing.JButton();
        Content = new javax.swing.JPanel();
        PanelDashboard = new javax.swing.JLayeredPane();
        PanelJual = new javax.swing.JLayeredPane();
        PanelRestok = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Navbar.setBackground(new java.awt.Color(0, 128, 129));

        TombolDashboard_bg.setBackground(new java.awt.Color(0, 128, 129));

        TombolDashboard.setBackground(new java.awt.Color(0, 152, 153));
        TombolDashboard.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TombolDashboard.setForeground(new java.awt.Color(255, 255, 255));
        TombolDashboard.setText("Dashboard");
        TombolDashboard.setBorder(null);
        TombolDashboard.setContentAreaFilled(false);
        TombolDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TombolDashboard.setFocusPainted(false);
        TombolDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TombolDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TombolDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TombolDashboardMouseExited(evt);
            }
        });
        TombolDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolDashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TombolDashboard_bgLayout = new javax.swing.GroupLayout(TombolDashboard_bg);
        TombolDashboard_bg.setLayout(TombolDashboard_bgLayout);
        TombolDashboard_bgLayout.setHorizontalGroup(
            TombolDashboard_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
            .addGroup(TombolDashboard_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TombolDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
        );
        TombolDashboard_bgLayout.setVerticalGroup(
            TombolDashboard_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
            .addGroup(TombolDashboard_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TombolDashboard_bgLayout.createSequentialGroup()
                    .addComponent(TombolDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        TombolJual_bg.setBackground(new java.awt.Color(0, 128, 129));

        TombolJual.setBackground(new java.awt.Color(0, 152, 153));
        TombolJual.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TombolJual.setForeground(new java.awt.Color(255, 255, 255));
        TombolJual.setText("Transaksi");
        TombolJual.setBorder(null);
        TombolJual.setContentAreaFilled(false);
        TombolJual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TombolJual.setFocusPainted(false);
        TombolJual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TombolJualMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TombolJualMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TombolJualMouseExited(evt);
            }
        });
        TombolJual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolJualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TombolJual_bgLayout = new javax.swing.GroupLayout(TombolJual_bg);
        TombolJual_bg.setLayout(TombolJual_bgLayout);
        TombolJual_bgLayout.setHorizontalGroup(
            TombolJual_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TombolJual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TombolJual_bgLayout.setVerticalGroup(
            TombolJual_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TombolJual, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        TombolRestok_bg.setBackground(new java.awt.Color(0, 128, 129));

        TombolRestok.setBackground(new java.awt.Color(0, 152, 153));
        TombolRestok.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TombolRestok.setForeground(new java.awt.Color(255, 255, 255));
        TombolRestok.setText("Pergudangan");
        TombolRestok.setBorder(null);
        TombolRestok.setBorderPainted(false);
        TombolRestok.setContentAreaFilled(false);
        TombolRestok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TombolRestok.setFocusPainted(false);
        TombolRestok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TombolRestokMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TombolRestokMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TombolRestokMouseExited(evt);
            }
        });
        TombolRestok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolRestokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TombolRestok_bgLayout = new javax.swing.GroupLayout(TombolRestok_bg);
        TombolRestok_bg.setLayout(TombolRestok_bgLayout);
        TombolRestok_bgLayout.setHorizontalGroup(
            TombolRestok_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TombolRestok, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TombolRestok_bgLayout.setVerticalGroup(
            TombolRestok_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TombolRestok, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        TombolLogin_bg.setBackground(new java.awt.Color(0, 128, 129));

        TombolLogin.setBackground(new java.awt.Color(0, 152, 153));
        TombolLogin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TombolLogin.setForeground(new java.awt.Color(255, 255, 255));
        TombolLogin.setText("Logout");
        TombolLogin.setBorder(null);
        TombolLogin.setBorderPainted(false);
        TombolLogin.setContentAreaFilled(false);
        TombolLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TombolLogin.setFocusPainted(false);
        TombolLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TombolLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TombolLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TombolLoginMouseExited(evt);
            }
        });
        TombolLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TombolLogin_bgLayout = new javax.swing.GroupLayout(TombolLogin_bg);
        TombolLogin_bg.setLayout(TombolLogin_bgLayout);
        TombolLogin_bgLayout.setHorizontalGroup(
            TombolLogin_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
            .addGroup(TombolLogin_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TombolLogin_bgLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(TombolLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        TombolLogin_bgLayout.setVerticalGroup(
            TombolLogin_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
            .addGroup(TombolLogin_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TombolLogin_bgLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(TombolLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout NavbarLayout = new javax.swing.GroupLayout(Navbar);
        Navbar.setLayout(NavbarLayout);
        NavbarLayout.setHorizontalGroup(
            NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TombolJual_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TombolRestok_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(NavbarLayout.createSequentialGroup()
                .addComponent(TombolLogin_bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TombolDashboard_bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NavbarLayout.setVerticalGroup(
            NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavbarLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(TombolJual_bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(TombolRestok_bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                .addComponent(TombolLogin_bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NavbarLayout.createSequentialGroup()
                    .addComponent(TombolDashboard_bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Content.setBackground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout PanelDashboardLayout = new javax.swing.GroupLayout(PanelDashboard);
        PanelDashboard.setLayout(PanelDashboardLayout);
        PanelDashboardLayout.setHorizontalGroup(
            PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
        );
        PanelDashboardLayout.setVerticalGroup(
            PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        PanelJual.setBackground(new java.awt.Color(30, 30, 30));

        javax.swing.GroupLayout PanelJualLayout = new javax.swing.GroupLayout(PanelJual);
        PanelJual.setLayout(PanelJualLayout);
        PanelJualLayout.setHorizontalGroup(
            PanelJualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
        );
        PanelJualLayout.setVerticalGroup(
            PanelJualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelRestokLayout = new javax.swing.GroupLayout(PanelRestok);
        PanelRestok.setLayout(PanelRestokLayout);
        PanelRestokLayout.setHorizontalGroup(
            PanelRestokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
        );
        PanelRestokLayout.setVerticalGroup(
            PanelRestokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelJual)
            .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelRestok))
            .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelDashboard))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelJual)
            .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelRestok))
            .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelDashboard))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 740, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 161, Short.MAX_VALUE)
                    .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Content.setOpaque(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TombolJualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolJualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TombolJualActionPerformed

    private void TombolJualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolJualMouseClicked
        PanelJual.setVisible(true);
        PanelRestok.setVisible(false);
        PanelDashboard.setVisible(false);
    }//GEN-LAST:event_TombolJualMouseClicked

    private void TombolJualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolJualMouseEntered
        TombolJual_bg.setBackground(new Color(0, 152, 153));
    }//GEN-LAST:event_TombolJualMouseEntered

    private void TombolJualMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolJualMouseExited
        TombolJual_bg.setBackground(new Color(0, 128, 129));
    }//GEN-LAST:event_TombolJualMouseExited

    private void TombolLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TombolLoginActionPerformed

    private void TombolLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolLoginMouseExited
        TombolLogin_bg.setBackground(new Color(0, 128, 129));
    }//GEN-LAST:event_TombolLoginMouseExited

    private void TombolLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolLoginMouseEntered
        TombolLogin_bg.setBackground(new Color(0, 152, 153));
    }//GEN-LAST:event_TombolLoginMouseEntered

    private void TombolLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolLoginMouseClicked
        AccessXML.writeXML();
        dispose();
        
        form_login login = new form_login();
        form_login.isLogin = false;
        form_login.usernameLogin = null;
        login.setVisible(true);
    }//GEN-LAST:event_TombolLoginMouseClicked

    private void TombolRestokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolRestokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TombolRestokActionPerformed

    private void TombolRestokMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolRestokMouseExited
        TombolRestok_bg.setBackground(new Color(0, 128, 129));
    }//GEN-LAST:event_TombolRestokMouseExited

    private void TombolRestokMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolRestokMouseEntered
        TombolRestok_bg.setBackground(new Color(0, 152, 153));
    }//GEN-LAST:event_TombolRestokMouseEntered

    private void TombolRestokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolRestokMouseClicked
        PanelJual.setVisible(false);
        PanelRestok.setVisible(true);
        PanelDashboard.setVisible(false);
    }//GEN-LAST:event_TombolRestokMouseClicked

    private void TombolDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolDashboardMouseClicked
        PanelJual.setVisible(false);
        PanelRestok.setVisible(false);
        PanelDashboard.setVisible(true);
    }//GEN-LAST:event_TombolDashboardMouseClicked

    private void TombolDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolDashboardMouseEntered
        TombolDashboard_bg.setBackground(new Color(0, 152, 153));
    }//GEN-LAST:event_TombolDashboardMouseEntered

    private void TombolDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolDashboardMouseExited
        TombolDashboard_bg.setBackground(new Color(0, 128, 129));
    }//GEN-LAST:event_TombolDashboardMouseExited

    private void TombolDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolDashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TombolDashboardActionPerformed
    
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
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>      
        //</editor-fold>      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JPanel Navbar;
    private javax.swing.JLayeredPane PanelDashboard;
    private javax.swing.JLayeredPane PanelJual;
    private javax.swing.JLayeredPane PanelRestok;
    private javax.swing.JButton TombolDashboard;
    private javax.swing.JPanel TombolDashboard_bg;
    private javax.swing.JButton TombolJual;
    private javax.swing.JPanel TombolJual_bg;
    private javax.swing.JButton TombolLogin;
    private javax.swing.JPanel TombolLogin_bg;
    private javax.swing.JButton TombolRestok;
    private javax.swing.JPanel TombolRestok_bg;
    // End of variables declaration//GEN-END:variables

}