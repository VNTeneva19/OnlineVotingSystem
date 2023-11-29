import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class MainMenu extends javax.swing.JFrame {

    JPanel jPanel;
    public MainMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {

        JLabel jLabel3 = new JLabel();
        JLabel jLabel1 = new JLabel();
        JPanel jPanel1 = new JPanel();
        JLabel jLabel5 = new JLabel();
        JPanel jPanel3 = new JPanel();
        jLabel7 = new javax.swing.JLabel();
        JLabel jLabel8 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JButton jButton2 = new JButton();
        // Variables declaration - do not modify//GEN-BEGIN:variables
        JButton jButton1 = new JButton();
        JLabel jLabel6 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Courier New", Font.BOLD, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("2023-2024");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(480, 230, 430, 40);

        jLabel1.setFont(new java.awt.Font("Courier New", Font.BOLD, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Classroom Election");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 160, 560, 55);

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(370, 690, 700, 70);

        jLabel5.setFont(new java.awt.Font("Courier New", Font.BOLD, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("v.1");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 20, 40, 30);

        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(600, 20, 100, 50);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Courier New", Font.BOLD, 18)); // NOI18N
        jLabel7.setText("Date");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1240, 20, 70, 30);

        String now = String.valueOf(LocalDate.now());

        jLabel8.setFont(new java.awt.Font("Courier New", Font.BOLD, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(now);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1200, 60, 120, 25);

        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 0, 0);

        jButton2.setFont(new java.awt.Font("Courier New", Font.BOLD, 24)); // NOI18N
        jButton2.setText("ADMIN");
        jButton2.addActionListener(this::jButton2ActionPerformed);
        getContentPane().add(jButton2);
        jButton2.setBounds(620, 550, 190, 60);

        jButton1.setIcon(new javax.swing.ImageIcon("/icons/login.png")); // NOI18N
        jButton1.setToolTipText("LOGIN");
        jButton1.setOpaque(false);
        jButton1.addActionListener(this::jButton1ActionPerformed);
        getContentPane().add(jButton1);
        jButton1.setBounds(660, 310, 90, 100);

        jLabel6.setFont(new java.awt.Font("Courier New", Font.BOLD, 30)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("VOTE NOW!");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(610, 400, 190, 80);


        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        UserLogin info = new UserLogin();
        info.setVisible(true);
        info.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        AdminLogin info = new AdminLogin();
        info.setVisible(true);
        info.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MainMenu().setVisible(true));

    }

    public javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
