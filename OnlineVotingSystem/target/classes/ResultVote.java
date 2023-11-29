import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultVote extends javax.swing.JFrame {

    /**
     * Creates new form voteresult
     */
    public ResultVote() {
        initComponents();
        setup();
    }

    public Connection getConnection(){

        try{                                                                        //username //database         =pass no password
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/voting_system","root","");
            return con;
        }
        catch(Exception e){
        }
        return null;
    }

    public void setup(){

        try{
            Connection con = getConnection();

            int president=1;
            String pre="SELECT * FROM candidate where position_id='"+president+"' order by -points limit 1";
            Statement st1 =con.createStatement();
            ResultSet rs1= st1.executeQuery(pre);

            int vicepresident=2;
            String vice="SELECT * FROM candidate where position_id='"+vicepresident+"' order by -points limit 1";
            Statement st2 =con.createStatement();
            ResultSet rs2= st2.executeQuery(vice);

            int secretary=3;
            String sec="SELECT * FROM candidate where position_id='"+secretary+"' order by -points limit 1";
            Statement st3 =con.createStatement();
            ResultSet rs3= st3.executeQuery(sec);

            int treasurer=5;
            String treas="SELECT * FROM candidate WHERE position_id='"+treasurer+"' ORDER BY -points limit 1";
            Statement st4 =con.createStatement();
            ResultSet rs4= st4.executeQuery(treas);

            int auditor=4;
            String audi="SELECT * FROM candidate WHERE position_id='"+auditor+"' ORDER BY -points limit 1";
            Statement st5 =con.createStatement();
            ResultSet rs5= st5.executeQuery(audi);

            int pio=6;
            String pio2="SELECT * FROM candidate WHERE position_id='"+pio+"' ORDER BY -points limit 1";
            Statement st6 =con.createStatement();
            ResultSet rs6= st6.executeQuery(pio2);

            if(rs1.next()  && rs2.next() &&rs3.next() && rs4.next() && rs5.next() && rs6.next())  {
                presidentvotes.setText(rs1.getString(5));
                presidentname.setText(rs1.getString(2));

                vicepresidentvotes.setText(rs2.getString(5));
                vicename.setText(rs2.getString(2));

                secretaryvotes.setText(rs3.getString(5));
                secretaryname.setText(rs3.getString(2));

                treasurervotes.setText(rs4.getString(5));
                treasurername.setText(rs4.getString(2));

                auditorvotes.setText(rs5.getString(5));
                auditorname.setText(rs5.getString(2));

                piovotes.setText(rs6.getString(5));
                pioname.setText(rs6.getString(2));

            }
        }
        catch(Exception e){
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        vicename = new javax.swing.JTextField();
        secretaryvotes = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        presidentname = new javax.swing.JTextField();
        secretaryname = new javax.swing.JTextField();
        treasurername = new javax.swing.JTextField();
        auditorname = new javax.swing.JTextField();
        pioname = new javax.swing.JTextField();
        presidentvotes = new javax.swing.JLabel();
        vicepresidentvotes = new javax.swing.JLabel();
        piovotes = new javax.swing.JLabel();
        treasurervotes = new javax.swing.JLabel();
        auditorvotes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new ViewportLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Position");
        getContentPane().add(jLabel1, new SpringLayout.Constraints(Spring.constant(240), Spring.constant(100), Spring.constant(90), Spring.constant(35)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Vice President");
        getContentPane().add(jLabel2, new SpringLayout.Constraints(Spring.constant(230), Spring.constant(230), Spring.constant(159), Spring.constant(30)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Secretary");
        getContentPane().add(jLabel3, new SpringLayout.Constraints(Spring.constant(230), Spring.constant(280), Spring.constant(159), Spring.constant(30)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Treasurer");
        getContentPane().add(jLabel4, new SpringLayout.Constraints(Spring.constant(230), Spring.constant(330), Spring.constant(159), Spring.constant(40)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Auditor");
        getContentPane().add(jLabel5, new SpringLayout.Constraints(Spring.constant(230), Spring.constant(380), Spring.constant(159), Spring.constant(50)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("P.I.O");
        getContentPane().add(jLabel6, new SpringLayout.Constraints(Spring.constant(230), Spring.constant(430), Spring.constant(159), Spring.constant(40)));

        vicename.setEditable(false);
        vicename.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(vicename, new SpringLayout.Constraints(Spring.constant(230), Spring.constant(220), Spring.constant(250), Spring.constant(40)));

        secretaryvotes.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        secretaryvotes.setText("10");
        getContentPane().add(secretaryvotes, new SpringLayout.Constraints(Spring.constant(710), Spring.constant(270), Spring.constant(50), Spring.constant(50)));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Main Menu");
        getContentPane().add(jButton1, new SpringLayout.Constraints(Spring.constant(440), Spring.constant(560), Spring.constant(-1), Spring.constant(-1)));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Winning Votes");
        getContentPane().add(jLabel13, new SpringLayout.Constraints(Spring.constant(670), Spring.constant(100), Spring.constant(-1), Spring.constant(-1)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("President");
        getContentPane().add(jLabel14, new SpringLayout.Constraints(Spring.constant(230), Spring.constant(170), Spring.constant(-1), Spring.constant(20)));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Cnadidate Name");
        getContentPane().add(jLabel15, new SpringLayout.Constraints(Spring.constant(420), Spring.constant(100), Spring.constant(-1), Spring.constant(-1)));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("WINNERS");
        getContentPane().add(jLabel16, new SpringLayout.Constraints(Spring.constant(450), Spring.constant(40), Spring.constant(-1), Spring.constant(-1)));
        getContentPane().add(jSeparator1, new SpringLayout.Constraints(Spring.constant(107), Spring.constant(132), Spring.constant(713), Spring.constant(10)));

        presidentname.setEditable(false);
        presidentname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(presidentname, new SpringLayout.Constraints(Spring.constant(380), Spring.constant(160), Spring.constant(250), Spring.constant(40)));

        secretaryname.setEditable(false);
        secretaryname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(secretaryname, new SpringLayout.Constraints(Spring.constant(380), Spring.constant(270), Spring.constant(250), Spring.constant(40)));

        treasurername.setEditable(false);
        treasurername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(treasurername, new SpringLayout.Constraints(Spring.constant(380), Spring.constant(330), Spring.constant(250), Spring.constant(40)));

        auditorname.setEditable(false);
        auditorname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(auditorname, new SpringLayout.Constraints(Spring.constant(380), Spring.constant(380), Spring.constant(250), Spring.constant(40)));

        pioname.setEditable(false);
        pioname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(pioname, new SpringLayout.Constraints(Spring.constant(380), Spring.constant(440), Spring.constant(250), Spring.constant(40)));

        presidentvotes.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        presidentvotes.setText("10");
        getContentPane().add(presidentvotes, new SpringLayout.Constraints(Spring.constant(710), Spring.constant(160), Spring.constant(50), Spring.constant(50)));

        vicepresidentvotes.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        vicepresidentvotes.setText("10");
        getContentPane().add(vicepresidentvotes, new SpringLayout.Constraints(Spring.constant(710), Spring.constant(220), Spring.constant(50), Spring.constant(50)));

        piovotes.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        piovotes.setText("10");
        getContentPane().add(piovotes, new SpringLayout.Constraints(Spring.constant(710), Spring.constant(440), Spring.constant(50), Spring.constant(50)));

        treasurervotes.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        treasurervotes.setText("10");
        getContentPane().add(treasurervotes, new SpringLayout.Constraints(Spring.constant(710), Spring.constant(330), Spring.constant(50), Spring.constant(50)));

        auditorvotes.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        auditorvotes.setText("10");
        getContentPane().add(auditorvotes, new SpringLayout.Constraints(Spring.constant(710), Spring.constant(390), Spring.constant(50), Spring.constant(50)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ResultVote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultVote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultVote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultVote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultVote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField auditorname;
    private javax.swing.JLabel auditorvotes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField pioname;
    private javax.swing.JLabel piovotes;
    private javax.swing.JTextField presidentname;
    private javax.swing.JLabel presidentvotes;
    private javax.swing.JTextField secretaryname;
    private javax.swing.JLabel secretaryvotes;
    private javax.swing.JTextField treasurername;
    private javax.swing.JLabel treasurervotes;
    private javax.swing.JTextField vicename;
    private javax.swing.JLabel vicepresidentvotes;
    // End of variables declaration//GEN-END:variables
}
