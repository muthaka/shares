/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shares;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author MUTHAKA
 */
public class TableData extends javax.swing.JFrame {
private Connection con;
private Statement st;
private ResultSet cr;
String currentquery, current;
String share, month;
    /**
     * Creates new form TableData
     */
    public TableData() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel1 = new javax.swing.JLabel();
        combomonth = new javax.swing.JComboBox();
        btnshowtbl = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblshare = new javax.swing.JTable();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("SELECT MONTH");

        combomonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "june2014", "july2014", "august2014", "september2014", "october2014", "november2014", "december2014", "january2015", "february2015", "march2015", "april2015", "may2015", "june2015", "july2015", "august2015", "september2015", "november2015", "december2015" }));

        btnshowtbl.setText("SHOW TABLE");
        btnshowtbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowtblActionPerformed(evt);
            }
        });

        tblshare.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblshare);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addComponent(combomonth, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnshowtbl)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(combomonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(btnshowtbl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnshowtblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowtblActionPerformed
        // TODO add your handling code here:
        try
        {
            /* connecting to the database */
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shares","root","root");
           st = con.createStatement();
           
           month = combomonth.getSelectedItem().toString();
           
           
           
           if (month.equals("june2014"))
           {  
                   currentquery = "SELECT * FROM june2014";
           }
           if (month.equals("july2014"))
           {
            
                   currentquery = "SELECT * FROM july2014";
              
           }
           if (month.equals("august2014"))
           {
               
                   currentquery = "SELECT * FROM august2014";
               
               
           }
           if (month.equals("september2014"))
           {
               
                   currentquery = "SELECT * FROM september2014";
               
           }
           if (month.equals("october2014"))
           {
               
                   currentquery = "SELECT * FROM october2014";
               
           }
           if (month.equals("november2014"))
           {
               
                   currentquery = "SELECT * FROM november2014";
               
           }
           if (month.equals("december2014"))
           {
              
                   currentquery = "SELECT * FROM december2014";
               
           }
           if (month.equals("january2015"))
           {
              
                   currentquery = "SELECT * FROM january2015";
              
           }
           if (month.equals("february2015"))
           {
              
                   currentquery = "SELECT * FROM february2015";
              
           }
           if (month.equals("march2015"))
           {
              
                   currentquery = "SELECT * FROM march2015";
              
           }
           if (month.equals("april2015"))
           {
                 currentquery = "SELECT * FROM april2015";
              
           }
           if (month.equals("may2015"))
           {
                currentquery = "SELECT * FROM may2015";
              
           }
           if (month.equals("june2015"))
           {
              
                  currentquery = "SELECT * FROM june2015";
               
           }
           if (month.equals("july2015"))
           {
                currentquery = "SELECT * FROM july2015";
              
           }
           
           cr = st.executeQuery(currentquery);
           
        
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            System.out.println(ex);
        }
        tblshare.setModel(DbUtils.resultSetToTableModel(cr));
    }//GEN-LAST:event_btnshowtblActionPerformed

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
            java.util.logging.Logger.getLogger(TableData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TableData td = new TableData();
                td.setLocationRelativeTo(null);
                td.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnshowtbl;
    private javax.swing.JComboBox combomonth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblshare;
    // End of variables declaration//GEN-END:variables
}
