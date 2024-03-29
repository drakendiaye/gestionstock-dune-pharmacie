
import connexiondb.connexiondb;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class famille1 extends javax.swing.JFrame {
  public static ResultSet rs = null;
//    public String req;
    
    connexiondb db ;


//    public Connection con = null;
//    public Statement S = null;
//    public ResultSet RS = null;
//    public String req;
    DefaultTableModel _modelT = null;

    /**
     * Creates new form famille1
     */
    
    public famille1() {
        initComponents();
        db = new connexiondb();
        loader();
    }
     public void loader() {
        try {
           

            _modelT = new DefaultTableModel();
            _modelT.setNumRows(0);
            rs= db.getDataBase("SELECT `code`, `designation` FROM `typemedicament`");
           // RS = S.executeQuery(req);
            _modelT.addColumn("CODE DU  FAMILLE");
            _modelT.addColumn("DesignAtion de la famille");
            while (rs.next()) {
                Vector row = new Vector<>();
                row.add(rs.getString(1));
                row.add(rs.getString(2));

                _modelT.addRow(row);
            }
            jTable1.setModel(_modelT);
        } catch (SQLException ex) {
            Logger.getLogger(GestionMedi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      void vider() {
        t1.setText("");

        t2.setText("");
        t1.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        brechercher = new javax.swing.JButton();
        bsupprimer = new javax.swing.JButton();
        bmodifier = new javax.swing.JButton();
        bajouter = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bfermer = new javax.swing.JButton();
        bannuler = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1163, 516));
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste Famille de Médicaments :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 18), new java.awt.Color(0, 102, 0))); // NOI18N

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(600, 230, 470, 260);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Les Opération :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 18), new java.awt.Color(0, 102, 0))); // NOI18N

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/images.jpg"))); // NOI18N
        jButton1.setText("Afficher");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        brechercher.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        brechercher.setForeground(new java.awt.Color(0, 102, 0));
        brechercher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/noloc_env_search_icon.gif"))); // NOI18N
        brechercher.setText("Rechercher");
        brechercher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brechercherMouseClicked(evt);
            }
        });
        brechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brechercherActionPerformed(evt);
            }
        });

        bsupprimer.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        bsupprimer.setForeground(new java.awt.Color(0, 102, 0));
        bsupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/overview_button_delete.gif"))); // NOI18N
        bsupprimer.setText("Supprimer");
        bsupprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bsupprimerMouseClicked(evt);
            }
        });
        bsupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsupprimerActionPerformed(evt);
            }
        });

        bmodifier.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        bmodifier.setForeground(new java.awt.Color(0, 102, 0));
        bmodifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icone_modifier.gif"))); // NOI18N
        bmodifier.setText("Modifier");
        bmodifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bmodifierMouseClicked(evt);
            }
        });
        bmodifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodifierActionPerformed(evt);
            }
        });

        bajouter.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        bajouter.setForeground(new java.awt.Color(0, 102, 0));
        bajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/enr.gif"))); // NOI18N
        bajouter.setText("Ajouter");
        bajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajouterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(bmodifier, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(bsupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(brechercher)
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(brechercher)
                    .addComponent(bmodifier)
                    .addComponent(bajouter)
                    .addComponent(bsupprimer))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 110, 1016, 100);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Les Informations :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 18), new java.awt.Color(0, 102, 0))); // NOI18N

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Code de la famille");

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("designation de la famille du Médicament");

        bfermer.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        bfermer.setForeground(new java.awt.Color(0, 102, 0));
        bfermer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bouton_fermer.png"))); // NOI18N
        bfermer.setText("Fermer");
        bfermer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bfermerMouseEntered(evt);
            }
        });
        bfermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfermerActionPerformed(evt);
            }
        });

        bannuler.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        bannuler.setForeground(new java.awt.Color(0, 102, 0));
        bannuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user-reset.png"))); // NOI18N
        bannuler.setText("Réinitialiser");
        bannuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bannulerMouseClicked(evt);
            }
        });
        bannuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bannulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(310, 310, 310)
                                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(bannuler, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(bfermer, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bfermer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bannuler, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 230, 550, 260);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Géstion Famille des Médicaments");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel3)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(320, 30, 510, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/d8e8c57e4c07ddfdbe387271e2930732_large.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-270, 0, 1440, 620);

        setSize(new java.awt.Dimension(1179, 554));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(_modelT.getRowCount()!=0) _modelT.setNumRows(0);
        else loader();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void brechercherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brechercherMouseClicked

    }//GEN-LAST:event_brechercherMouseClicked

    private void brechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brechercherActionPerformed
        if (!t1.getText().equals("")) {
            try {

                String  req = "SELECT `code`, `designation` FROM `typemedicament` WHERE code='" + t1.getText().toString() + "'";
                //                RS = S.executeQuery(req);
                rs=db.getDataBase(req);
                _modelT.setNumRows(0);
                if (rs.next()) {
                    Vector row = new Vector<>();
                    row.add(rs.getString(1));
                    row.add(rs.getString(2));

                    t2.setText(rs.getString(2));

                    _modelT.addRow(row);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(null, "donner le code de l'element a rechercher");
        }
    }//GEN-LAST:event_brechercherActionPerformed

    private void bsupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bsupprimerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bsupprimerMouseClicked

    private void bsupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsupprimerActionPerformed
        if (!t1.getText().equals("")) {
            try {
                int a =  db.setDataBase("DELETE FROM typemedicament WHERE code='"+t1.getText()+"'");

                loader();
                if(a==1)
                JOptionPane.showMessageDialog(null, "suppression par succee");
                vider();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "chercher l' element a supprimer");
        }
    }//GEN-LAST:event_bsupprimerActionPerformed

    private void bmodifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bmodifierMouseClicked

    }//GEN-LAST:event_bmodifierMouseClicked

    private void bmodifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmodifierActionPerformed
        if (!t1.getText().equals("")) {
            try {

                //                S = con.createStatement();
                String f = "update typemedicament set designation='" + t2.getText() + "' where code='" + t1.getText() + "'";
                //                S.executeUpdate(req);
                //                vider();
                //                JOptionPane.showMessageDialog(null, "modification avec succes");
                //                loader();
                //            } catch (Exception ex) {
                //                JOptionPane.showMessageDialog(null, ex.getMessage());
                //            }
            //        } else {
            //            JOptionPane.showMessageDialog(null, "donner le code de l'element a rechercher");
            int a=
            db.setDataBase(f);

            loader();

            if(a==1)
            JOptionPane.showMessageDialog(null, "modification par succee");
            vider();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        } else {
            JOptionPane.showMessageDialog(null, "chercher l' element a modifier");}
    }//GEN-LAST:event_bmodifierActionPerformed

    private void bajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajouterActionPerformed
        try {

            //            S = con.createStatement();
            String req = "insert into typemedicament values ('" + t1.getText() + "','" + t2.getText() + "')";
            //
            int a=
            db.setDataBase(req);
            vider();
            //            //JOptionPane.showMessageDialog(null,"OK");
            ////        } catch (Exception ex) {
            ////            JOptionPane.showMessageDialog(null, ex.getMessage());
            ////        }
        loader();
        if(a==1)
        JOptionPane.showMessageDialog(null, "ajout par succee");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_bajouterActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void bfermerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bfermerMouseEntered
        // System.exit(0);
    }//GEN-LAST:event_bfermerMouseEntered

    private void bfermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfermerActionPerformed
          fenetredemarrage fen = new fenetredemarrage();
            fen.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_bfermerActionPerformed

    private void bannulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bannulerMouseClicked
        vider();        // TODO add your handling code here:
    }//GEN-LAST:event_bannulerMouseClicked

    private void bannulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bannulerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bannulerActionPerformed

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
            java.util.logging.Logger.getLogger(famille1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(famille1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(famille1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(famille1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new famille1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bajouter;
    private javax.swing.JButton bannuler;
    private javax.swing.JButton bfermer;
    private javax.swing.JButton bmodifier;
    private javax.swing.JButton brechercher;
    private javax.swing.JButton bsupprimer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
