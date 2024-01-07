/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ibrahim_Gökdemir;

import static Ibrahim_Gökdemir.DBHelper.connectionString;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author ieren
 */
public class ManagerAssetRegistration extends javax.swing.JFrame {

    /**
     * Creates new form ManagerAssetRegistiration
     */
    public ManagerAssetRegistration() {
        initComponents();
    }
    private boolean updateMode;
    private String name;
    private String serialNumber;
    private String acquisitionDate;
    private String managername;

 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtmname = new javax.swing.JTextField();
        txtmserial = new javax.swing.JTextField();
        txtmacquisitiondate = new javax.swing.JTextField();
        txtmvalue = new javax.swing.JTextField();
        txtmregister = new javax.swing.JButton();
        btnmhome = new javax.swing.JButton();
        lblmnameerror = new javax.swing.JLabel();
        lblmserialerror = new javax.swing.JLabel();
        lblmacqerror = new javax.swing.JLabel();
        cmbmcategory = new javax.swing.JComboBox<>();
        lblmvalueerror = new javax.swing.JLabel();
        checkmfragile = new javax.swing.JCheckBox();
        mspiner = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtmanagername = new javax.swing.JTextField();
        txtmanagernameerror = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asset Registration for Manager");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Asset registration for manager");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 23, 352, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name*");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 90, 53, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Serial Number*");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Acquisition date*");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 96, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Current price*");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 85, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Category");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 69, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Number of items");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 100, -1));

        txtmname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 87, 175, -1));
        getContentPane().add(txtmserial, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 174, -1));
        getContentPane().add(txtmacquisitiondate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 174, -1));
        getContentPane().add(txtmvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 174, -1));

        txtmregister.setText("Register");
        txtmregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmregisterActionPerformed(evt);
            }
        });
        getContentPane().add(txtmregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 171, -1));

        btnmhome.setText("Home Page");
        btnmhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmhomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnmhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 167, -1));

        lblmnameerror.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(lblmnameerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 115, 217, 22));

        lblmserialerror.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(lblmserialerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 217, 24));

        lblmacqerror.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(lblmacqerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 241, 20));

        cmbmcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer equipments ", "Furniture", "Vehicles", "Tools"}));
        getContentPane().add(cmbmcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 175, -1));

        lblmvalueerror.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(lblmvalueerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 217, 18));

        checkmfragile.setForeground(new java.awt.Color(255, 255, 255));
        checkmfragile.setText("Fragile");
        checkmfragile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkmfragileActionPerformed(evt);
            }
        });
        getContentPane().add(checkmfragile, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 85, -1));
        getContentPane().add(mspiner, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 181, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("dd/mm/yyyy");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Manager Name*");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, -1));
        getContentPane().add(txtmanagername, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 170, -1));

        txtmanagernameerror.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(txtmanagernameerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 230, 20));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mountregister.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void txtmnameActionPerformed(java.awt.event.ActionEvent evt) {                                         

    }                                        

    private void txtmregisterActionPerformed(java.awt.event.ActionEvent evt) {                                             
        ManagerAsset MAsset = new ManagerAsset("name", "serialno", "acquisitiondate", "value", "category", "fragile", "managername", 123);
        String name = txtmname.getText();

        Pattern pattern = Pattern.compile("^[a-zA-ZşŞğĞüÜıIöÖçÇ\\s]+$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(name);
        boolean matchFound = matcher.find();
        if (!matchFound) {
            lblmnameerror.setText("*Name should only contain letters!");
            txtmname.setText("");
        }

        String managername = txtmanagername.getText();

        Pattern pattern4 = Pattern.compile("^[a-zA-ZşŞğĞüÜıIöÖçÇ\\s]+$", Pattern.CASE_INSENSITIVE);
        Matcher matcher4 = pattern4.matcher(managername);
        boolean matchFound4 = matcher4.find();
        if (!matchFound4) {
            txtmanagernameerror.setText("*Name should only contain letters!");
            txtmanagername.setText("");
        }

        String sserial = txtmserial.getText();
        Pattern pattern1 = Pattern.compile("^[0-9]+$", Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern1.matcher(sserial);
        boolean matchFound1 = matcher1.find();
        if (!matchFound1) {
            lblmserialerror.setText("*Serial number should only contain numbers!");
            txtmserial.setText("");
        }

        String sacquisitiondate = txtmacquisitiondate.getText();
        Pattern pattern2 = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher2 = pattern2.matcher(sacquisitiondate);
        boolean matchFound2 = matcher2.find();
        if (!matchFound2) {
            lblmacqerror.setText("Please enter a proper date.");
            txtmacquisitiondate.setText("");

        }
        String svalue = txtmvalue.getText();
        Pattern pattern3 = Pattern.compile("^[^\\s]+$", Pattern.CASE_INSENSITIVE);
        Matcher matcher3 = pattern3.matcher(svalue);
        boolean matchFound3 = matcher3.find();
        if (!matchFound3) {
            lblmvalueerror.setText("*Value cannot be empty!");
            txtmvalue.setText("");
        }

        int spinnerValue = Integer.parseInt(mspiner.getValue().toString());
        if (spinnerValue <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Quantity should be greater than 0.");
            return;
        }

        if (matchFound && matchFound1 && matchFound2 && matchFound3 && matchFound4 && spinnerValue >= 0) {
            MAsset.name = txtmname.getText();
            MAsset.serialno = txtmserial.getText();
            MAsset.value = txtmvalue.getText();
            MAsset.acquisitiondate = txtmacquisitiondate.getText();
            MAsset.managername = txtmanagername.getText();
            MAsset.category = cmbmcategory.getSelectedItem().toString();
            if (checkmfragile.isSelected()) {
                MAsset.fragile = "Fragile";
            } else if (!checkmfragile.isSelected()) {
                MAsset.fragile = "Not fragile";
            }
            MAsset.mnumber = Integer.parseInt(mspiner.getValue().toString());

            if (DBHelper.InsertNewManagerAsset(MAsset)) {
                txtmname.setText("");
                txtmserial.setText("");
                txtmvalue.setText("");
                txtmacquisitiondate.setText("");
                txtmanagername.setText("");
                lblmacqerror.setText("");
                lblmnameerror.setText("");
                lblmserialerror.setText("");
                lblmvalueerror.setText("");
                txtmanagernameerror.setText("");

                JOptionPane.showMessageDialog(rootPane, "Asset inserted");

                

            } else {
                // JOptionPane.showMessageDialog(rootPane, "User cannot be inserted");

            }
        }        
    }                                            

    private void btnmhomeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        ManagerHome frmManagerHome = new ManagerHome();
        frmManagerHome.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }                                        

    private void checkmfragileActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(ManagerAssetRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerAssetRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerAssetRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerAssetRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerAssetRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnmhome;
    private javax.swing.JCheckBox checkmfragile;
    private javax.swing.JComboBox<String> cmbmcategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblmacqerror;
    private javax.swing.JLabel lblmnameerror;
    private javax.swing.JLabel lblmserialerror;
    private javax.swing.JLabel lblmvalueerror;
    private javax.swing.JSpinner mspiner;
    private javax.swing.JTextField txtmacquisitiondate;
    private javax.swing.JTextField txtmanagername;
    private javax.swing.JLabel txtmanagernameerror;
    private javax.swing.JTextField txtmname;
    private javax.swing.JButton txtmregister;
    private javax.swing.JTextField txtmserial;
    private javax.swing.JTextField txtmvalue;
    // End of variables declaration                   
}
