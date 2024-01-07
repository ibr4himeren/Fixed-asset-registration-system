/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ibrahim_Gökdemir;

/**
 *
 * @author ieren
 */
public class StaffHome extends javax.swing.JFrame {

    /**
     * Creates new form Staff
     */
    public StaffHome() {
        initComponents();
    }

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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menusasset = new javax.swing.JMenuItem();
        menulog = new javax.swing.JMenu();
        menulogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home page for Staff");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome staff");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 112, 301, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mounthome.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        jMenu1.setText("Registration");

        menusasset.setIcon(new javax.swing.ImageIcon("C:\\Users\\ieren\\Desktop\\Yeni klasör\\financial.png")); // NOI18N
        menusasset.setText("New asset");
        menusasset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menusassetActionPerformed(evt);
            }
        });
        jMenu1.add(menusasset);

        jMenuBar1.add(jMenu1);

        menulog.setText("Log");

        menulogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\ieren\\Desktop\\Yeni klasör\\logout.png")); // NOI18N
        menulogout.setText("Log out");
        menulogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menulogoutActionPerformed(evt);
            }
        });
        menulog.add(menulogout);

        jMenuBar1.add(menulog);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void menulogoutActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Login frmlogin = new Login();
        frmlogin.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }                                          

    private void menusassetActionPerformed(java.awt.event.ActionEvent evt) {                                           
        StaffAssetRegistration frmStaffAssetRegistration = new StaffAssetRegistration();
        frmStaffAssetRegistration.setVisible(true);
        this.dispose(); // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(StaffHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menulog;
    private javax.swing.JMenuItem menulogout;
    private javax.swing.JMenuItem menusasset;
    // End of variables declaration                   
}
