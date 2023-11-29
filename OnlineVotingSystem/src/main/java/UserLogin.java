import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserLogin extends javax.swing.JFrame {
    Connection con;
    ResultSet rs;
    PreparedStatement pst;

    /**
     * Creates new form logins
     */
    public UserLogin() {
        initComponents();
    }

    public Connection getConnection(){

        try{                                                                        //username //database         =pass no password
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;Database=voting_system;integratedSecurity=false;encrypt=false;", "admin", "admin");
            return con;
        }
        catch(Exception e){
        }

        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usertext = new javax.swing.JTextField();
        passtext = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        usertext.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        usertext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextActionPerformed(evt);
            }
        });
        usertext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userTextKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ID Number");

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Password");

        jButton2.setBackground(new java.awt.Color(176, 229, 209));
        jButton2.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButton2.setText("LOGIN");
        jButton2.setToolTipText("");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jButton2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jButton2InputMethodTextChanged(evt);
            }
        });

        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        passtext.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        passtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passtextActionPerformed(evt);
            }
        });
        passtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passTextKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(176, 229, 209));
        jButton1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButton1.setText("Main Menu");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(176, 229, 209));
        jButton3.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButton3.setText("Forgot Password");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(95, 95, 95)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton1)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(usertext)
                                                        .addComponent(passtext, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(usertext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(9, 9, 9)
                                                .addComponent(passtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertextActionPerformed

        String passId = usertext.getText();
        String login = "SELECT * FROM account WHERE student_name = ? AND password = ? AND status = 'no'";
        String already = "SELECT * FROM account WHERE student_name = ? AND password = ? AND status = 'yes'";
        String incorrect = "SELECT * FROM account WHERE student_name = ? AND password = ?";

        if (passId.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a username and password!");
            return;
        }

        try{
            Connection con = getConnection();
            pst = con.prepareStatement(login);

            PreparedStatement pst1= con.prepareStatement(incorrect);
            ResultSet rs1;
            rs1 = pst1.executeQuery();

            PreparedStatement pst2= con.prepareStatement(already);
            ResultSet rs2;
            rs2 = pst2.executeQuery();
            rs = pst.executeQuery();

            if (rs.next()){
                rs.close();
                pst.close();
                JOptionPane.showMessageDialog(null,"Success!");
                setVisible(false);

                new VotingSystem(passId).setVisible(true);
            }
            else if (rs2.next()){
                JOptionPane.showMessageDialog(null, "You already vote!");
                usertext.setText(null);
                passtext.setText(null);
            }
            else if (rs1.next()){
                JOptionPane.showMessageDialog(null, "Incorrect ID number AND Password!");
                usertext.setText(null);
                passtext.setText(null);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_usertextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String passId = usertext.getText();
        String login = "SELECT * FROM account WHERE student_name = ? AND password = ? AND status = 'no'";
        String already = "SELECT * FROM account WHERE student_name = ? AND password = ? AND status = 'yes'";
        String incorrect = "SELECT * FROM account WHERE student_name = ? AND password = ?";

        if (passId.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a username and password!");
            return;
        }

        try{
            Connection con = getConnection();
            pst = con.prepareStatement(login);

            PreparedStatement pst1= con.prepareStatement(incorrect);
            ResultSet rs1;
            rs1 = pst1.executeQuery();

            PreparedStatement pst2= con.prepareStatement(already);
            ResultSet rs2;
            rs2 = pst2.executeQuery();
            rs = pst.executeQuery();

            if (rs.next()){
                rs.close();
                pst.close();
                JOptionPane.showMessageDialog(null,"Success!");
                setVisible(false);

                new VotingSystem(passId).setVisible(true);
            }
            else if (rs2.next()){
                JOptionPane.showMessageDialog(null, "You already vote!");
                usertext.setText(null);
                passtext.setText(null);
            }
            else if (rs1.next()){
                JOptionPane.showMessageDialog(null, "Incorrect ID number AND Password!");
                usertext.setText(null);
                passtext.setText(null);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        setVisible(false);
        MainMenu main = new MainMenu();
        main.setVisible(true);
        main.setLocationRelativeTo(null);

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        setVisible(false);
        ForgotPassword main = new ForgotPassword();
        main.setVisible(true);
        main.setLocationRelativeTo(null);

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jButton2InputMethodTextChanged

        String passId = usertext.getText();
        String login = "SELECT * FROM account WHERE student_name = ? AND password = ? AND status = 'no'";
        String already = "SELECT * FROM account WHERE student_name = ? AND password = ? AND status = 'yes'";
        String incorrect = "SELECT * FROM account WHERE student_name = ? AND password = ?";

        if (passId.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a username and password!");
            return;
        }

        try{
            Connection con = getConnection();
            pst = con.prepareStatement(login);

            PreparedStatement pst1= con.prepareStatement(incorrect);
            ResultSet rs1;
            rs1 = pst1.executeQuery();

            PreparedStatement pst2= con.prepareStatement(already);
            ResultSet rs2;
            rs2 = pst2.executeQuery();
            rs = pst.executeQuery();

            if (rs.next()){
                rs.close();
                pst.close();
                JOptionPane.showMessageDialog(null,"Success!");
                setVisible(false);

                new VotingSystem(passId).setVisible(true);
            }
            else if (rs2.next()){
                JOptionPane.showMessageDialog(null, "You already vote!");
                usertext.setText(null);
                passtext.setText(null);
            }
            else if (rs1.next()){
                JOptionPane.showMessageDialog(null, "Incorrect ID number AND Password!");
                usertext.setText(null);
                passtext.setText(null);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2InputMethodTextChanged

    private void passTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passtextKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtextKeyPressed

    private void userTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usertextKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertextKeyPressed

    private void passtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtextActionPerformed

        String yes="yes";
        String no="no";
        String passid=usertext.getText();
        String login = "SELECT * FROM account WHERE student_name ='"+usertext.getText()+"' AND password = '"+passtext.getText() + " ' AND status = '"+no +"'";
        String already = "SELECT * FROM account WHERE student_name ='"+usertext.getText()+"' AND password = '"+passtext.getText() + " ' AND status = '"+yes +"'";
        String incorrect = "SELECT * FROM account WHERE student_name !='"+usertext.getText()+"' AND password != '"+passtext.getText() + " ' ";

        try{
            Connection con = getConnection();
            pst = con.prepareStatement(login);

            PreparedStatement pst1= con.prepareStatement(incorrect);
            ResultSet rs1;
            rs1 = pst1.executeQuery();

            PreparedStatement pst2= con.prepareStatement(already);
            ResultSet rs2;
            rs2 = pst2.executeQuery();
            rs = pst.executeQuery();

            if(rs.next()){
                rs.close();
                pst.close();
                JOptionPane.showMessageDialog(null,"Success!");
                setVisible(false);
                new VotingSystem(passid).setVisible(true);
            }
            else if (rs2.next()){
                JOptionPane.showMessageDialog(null, "You already vote!");
                usertext.setText(null);
                passtext.setText(null);
            }
            else if (rs1.next()){
                JOptionPane.showMessageDialog(null, "Incorrect ID number AND Password!");
                usertext.setText(null);
                passtext.setText(null);
            }
        }
        catch(Exception e){
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_passtextActionPerformed

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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField passtext;
    private javax.swing.JTextField usertext;
    // End of variables declaration//GEN-END:variables
}
