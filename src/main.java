
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JColorChooser;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mybaby
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
    }
    
    int newid;
    String uname; 
    String usertype;
    
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(g.getFont().deriveFont(100f));
        String s = "Şehir Hastanesi";
        FontMetrics fm = g.getFontMetrics();
        Rectangle2D fBounds = fm.getStringBounds(s, null);

        g.drawRect(200, 180 - fm.getAscent() + fm.getDescent(), (int)fBounds.getWidth(), (int)fm.getAscent());
        g.drawString(s, 200, 180);
        
    }
    
    public main(int id, String username, String utype) {
        initComponents();
        
        this.newid = id;
        
        this.uname = username;
        lbl_username.setText(uname);
        this.usertype = utype;
        lbl_utype.setText(usertype);

        String uctype = lbl_utype.getText();
        
        if(uctype.equals("Doktor")) {
            btn_createUser.setEnabled(false);
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mit_colorBtns = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        mit_colorInfo = new javax.swing.JMenuItem();
        pnl_butons = new javax.swing.JPanel();
        btn_patient = new javax.swing.JButton();
        btn_doctor = new javax.swing.JButton();
        btn_createUser = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        pnl_info = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_utype = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();

        mit_colorBtns.setText("Rengi değiştir\n");
        mit_colorBtns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mit_colorBtnsActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mit_colorBtns);

        mit_colorInfo.setText("Rengi değiştir");
        mit_colorInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mit_colorInfoActionPerformed(evt);
            }
        });
        jPopupMenu2.add(mit_colorInfo);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_butons.setBackground(new java.awt.Color(153, 0, 153));
        pnl_butons.setComponentPopupMenu(jPopupMenu1);

        btn_patient.setText("Patient");
        btn_patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_patientActionPerformed(evt);
            }
        });

        btn_doctor.setText("Doctor");
        btn_doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_doctorActionPerformed(evt);
            }
        });

        btn_createUser.setText("Create User");
        btn_createUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createUserActionPerformed(evt);
            }
        });

        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Yatak Durumu");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_butonsLayout = new javax.swing.GroupLayout(pnl_butons);
        pnl_butons.setLayout(pnl_butonsLayout);
        pnl_butonsLayout.setHorizontalGroup(
            pnl_butonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_butonsLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addGroup(pnl_butonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_butonsLayout.createSequentialGroup()
                        .addComponent(btn_patient, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnl_butonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_doctor, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(btn_createUser, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );
        pnl_butonsLayout.setVerticalGroup(
            pnl_butonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_butonsLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnl_butonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_patient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_createUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pnl_info.setBackground(new java.awt.Color(102, 102, 102));
        pnl_info.setComponentPopupMenu(jPopupMenu2);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("User Type");

        lbl_utype.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_utype.setForeground(new java.awt.Color(255, 255, 255));
        lbl_utype.setText("Username");

        lbl_username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(255, 255, 255));
        lbl_username.setText("Username");

        javax.swing.GroupLayout pnl_infoLayout = new javax.swing.GroupLayout(pnl_info);
        pnl_info.setLayout(pnl_infoLayout);
        pnl_infoLayout.setHorizontalGroup(
            pnl_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_infoLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(pnl_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(pnl_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_infoLayout.createSequentialGroup()
                        .addComponent(lbl_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addComponent(lbl_utype, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
        );
        pnl_infoLayout.setVerticalGroup(
            pnl_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_infoLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(pnl_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_username))
                .addGap(48, 48, 48)
                .addGroup(pnl_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl_utype))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnl_butons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnl_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(298, 298, 298))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addComponent(pnl_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_butons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_createUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createUserActionPerformed
        User u = new User();
        u.setVisible(true);
    }//GEN-LAST:event_btn_createUserActionPerformed

    private void btn_patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_patientActionPerformed
        patient p = new patient();
        p.setVisible(true);
    }//GEN-LAST:event_btn_patientActionPerformed

    private void btn_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_doctorActionPerformed
        doctor d = new doctor();
        d.setVisible(true);
    }//GEN-LAST:event_btn_doctorActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        bed nb = new bed();
        nb.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        this.setVisible(false);
        this.dispose();
        login lg = new login();
        lg.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void mit_colorBtnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mit_colorBtnsActionPerformed
        JColorChooser colorChooser = new JColorChooser();
        Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);
        
        pnl_butons.setBackground(color);
    }//GEN-LAST:event_mit_colorBtnsActionPerformed

    private void mit_colorInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mit_colorInfoActionPerformed
        JColorChooser colorChooser = new JColorChooser();
        Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);
        
        pnl_info.setBackground(color);
    }//GEN-LAST:event_mit_colorInfoActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_createUser;
    private javax.swing.JButton btn_doctor;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_patient;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JLabel lbl_utype;
    private javax.swing.JMenuItem mit_colorBtns;
    private javax.swing.JMenuItem mit_colorInfo;
    private javax.swing.JPanel pnl_butons;
    private javax.swing.JPanel pnl_info;
    // End of variables declaration//GEN-END:variables
}
