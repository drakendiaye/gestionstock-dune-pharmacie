/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Vente.java
 *
 * Created on 16 déc. 2014, 12:00:55
 */



import java.awt.Color;
import java.sql.*;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gh
 */
public class Vente extends javax.swing.JFrame {

    /** Creates new form Vente */
    public static Connection cnx;
    public Vente() {
        initComponents();
        date();
        conn();
        init();
        table();

    }
    public void table()
    {
        DefaultTableModel t=new DefaultTableModel();
        t=(DefaultTableModel) table.getModel();
        t.setColumnCount(0);
        t.addColumn("num vente");
         t.addColumn("date vente ");
         t.addColumn("montant");
    }
    public void init()
    {
        try

        {
        Statement st=cnx.createStatement();
        ResultSet rs=st.executeQuery("select * from medicament");
        while (rs.next())
        {
            code.addItem(rs.getString(1));
        }
        }
        catch(Exception e)
                {
            e.printStackTrace();
        }
    }
    public void conn()
    {
        try{
    Class.forName("com.mysql.jdbc.Driver");
      cnx = DriverManager.getConnection("jdbc:mysql://localhost/pharmacie?useUnicode=true&characterEncoding=cp1256", "root", "");
   
}
catch(Exception e){
    e.printStackTrace();

}
    }
    public void date()
    {
        DateFormat d=new SimpleDateFormat("yyyy-MM-dd");
        date.setText(d.format(new java.util.Date().getTime()));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        num = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        mon = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        code = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        prix = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        qte = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Menu = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de Vente");
        setMinimumSize(new java.awt.Dimension(1163, 516));
        getContentPane().setLayout(null);
        getContentPane().add(num);
        num.setBounds(650, 60, 195, 31);

        date.setEnabled(false);
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        getContentPane().add(date);
        date.setBounds(650, 110, 195, 30);

        mon.setEnabled(false);
        getContentPane().add(mon);
        mon.setBounds(650, 160, 195, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Numero de vente ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(490, 70, 106, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Montant");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(490, 180, 106, 14);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date Vente ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(490, 120, 106, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Code medicament");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 60, 185, 32);

        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });
        getContentPane().add(code);
        code.setBounds(240, 60, 206, 32);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("prix");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 120, 118, 27);

        prix.setEnabled(false);
        getContentPane().add(prix);
        prix.setBounds(240, 110, 206, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantité");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 160, 154, 43);

        qte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qteActionPerformed(evt);
            }
        });
        getContentPane().add(qte);
        qte.setBounds(240, 170, 206, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/enr.gif"))); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 220, 128, 38);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/overview_button_delete.gif"))); // NOI18N
        jButton2.setText("Supprimer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(240, 220, 137, 38);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/noloc_env_search_icon.gif"))); // NOI18N
        jButton3.setText("Rechercher");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(430, 220, 127, 38);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/images.jpg"))); // NOI18N
        jButton4.setText("Afficher");
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(600, 220, 127, 38);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(28, 292, 946, 142);

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.gif"))); // NOI18N
        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        getContentPane().add(Menu);
        Menu.setBounds(780, 220, 127, 38);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gestion de Vente");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(380, 10, 250, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/d8e8c57e4c07ddfdbe387271e2930732_large.jpeg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-300, -10, 1570, 570);

        setSize(new java.awt.Dimension(1257, 497));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed
 try

        {
        PreparedStatement st=cnx.prepareStatement("select * from medicament where codemedicament=?");
        st.setString(1, code.getSelectedItem().toString());
        ResultSet rs =st.executeQuery();

        while (rs.next())
        {
            prix.setText(""+rs.getInt("prixvente"));
        }
        }
        catch(Exception e)
                {
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_codeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 try

        {
     int num_vente=0;
        Statement st10=cnx.createStatement();
        ResultSet rs10=st10.executeQuery("select * from vente");
        while(rs10.next())
        {

            num_vente=rs10.getInt("numvente");
        }
         num_vente= num_vente+1;

        PreparedStatement st=cnx.prepareStatement("insert into vente (numvente,datevente,montant) values (?,?,?)");
       st.setInt(1, num_vente);
        st.setString(2,date.getText());
        int p=Integer.parseInt(qte.getText())*Integer.parseInt(prix.getText());
        mon.setText(""+p);
        st.setInt(3,p);
         PreparedStatement st1=cnx.prepareStatement("insert into ventemedicament (codemedicament,numvente,qtevente) values (?,?,?)");
        st1.setString(1, code.getSelectedItem().toString());
        st1.setInt(2,num_vente);

        st1.setInt(3,Integer.parseInt(qte.getText()));
        num.setText(""+num_vente);
        JOptionPane jp=new JOptionPane();
      
 
            st.executeUpdate();
            st1.executeUpdate();
            jp.showConfirmDialog(null, "ajouter");
 

       
        }
        catch(Exception e)
                {
            qte.setBackground(Color.red);
            num.setBackground(Color.red);
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int a=0;
try

        {
        num.setBackground(Color.white);
        PreparedStatement st=cnx.prepareStatement("select * from vente where numvente=?",ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
        st.setInt(1, Integer.parseInt(num.getText()));
        ResultSet rs=st.executeQuery();
     
     
        
        while(rs.next())
        {
            date.setText(rs.getString("datevente"));
            mon.setText(rs.getString("montant"));
            

        }

        }
        catch(Exception e)
                {
            javax.swing.JOptionPane.showMessageDialog(null, "Erreur de recherche", "Rechercher", javax.swing.JOptionPane.INFORMATION_MESSAGE);

                        //e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 try

        {
PreparedStatement st1=cnx.prepareStatement("delete from ventemedicament where numvente=?");
        PreparedStatement st=cnx.prepareStatement("delete from vente where numvente=?");
        st1.setInt(1, Integer.parseInt(num.getText()));
        st.setInt(1, Integer.parseInt(num.getText()));

        JOptionPane jp=new JOptionPane();

st1.executeUpdate();
            st.executeUpdate();

            jp.showConfirmDialog(null, "supprimer");



        }
        catch(Exception e)
                {
            
            num.setBackground(Color.red);
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 DefaultTableModel t=new DefaultTableModel();
        t=(DefaultTableModel) table.getModel();
        t.setRowCount(0);
        try {
            Statement st = cnx.createStatement();
            ResultSet rs=st.executeQuery("select * from vente ");
                    while(rs.next())
                    {
                         Object[] ob={rs.getInt(1),rs.getString(2),rs.getInt(3)};
                        t.addRow(ob);
                    }
            // TODO add your handling code here:
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
         fenetredemarrage fen = new fenetredemarrage();
            fen.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_MenuActionPerformed

    private void qteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qteActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Menu;
    private javax.swing.JComboBox code;
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mon;
    private javax.swing.JTextField num;
    private javax.swing.JTextField prix;
    private javax.swing.JTextField qte;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}