package latihan1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class frame1 extends javax.swing.JFrame {

    /**
     * Creates new form latihan1
     */
    public frame1() {
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

        angga = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        absen = new javax.swing.JLabel();
        nama1 = new javax.swing.JTextField();
        absen1 = new javax.swing.JTextField();
        kelas = new javax.swing.JLabel();
        kelass = new javax.swing.JComboBox<>();
        jurusan = new javax.swing.JLabel();
        rdb1 = new javax.swing.JRadioButton();
        rdb2 = new javax.swing.JRadioButton();
        alamat = new javax.swing.JLabel();
        alamat1 = new javax.swing.JTextField();
        send = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Biodata");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(171, 11, 47, 15);

        nama.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nama.setText("Nama");
        jPanel1.add(nama);
        nama.setBounds(105, 40, 32, 14);

        absen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        absen.setText("Absen");
        jPanel1.add(absen);
        absen.setBounds(105, 71, 35, 14);
        jPanel1.add(nama1);
        nama1.setBounds(171, 37, 121, 20);
        jPanel1.add(absen1);
        absen1.setBounds(171, 68, 121, 20);

        kelas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kelas.setText("Kelas");
        jPanel1.add(kelas);
        kelas.setBounds(105, 109, 30, 14);

        kelass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kelass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X RPL 1", "X RPL 2", "X RPL 3", "X RPL 4", "X RPL 5", "X RPL 6", "X RPL 7" }));
        kelass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelassActionPerformed(evt);
            }
        });
        jPanel1.add(kelass);
        kelass.setBounds(171, 106, 66, 20);

        jurusan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jurusan.setText("Jurusan");
        jPanel1.add(jurusan);
        jurusan.setBounds(105, 132, 45, 14);

        angga.add(rdb1);
        rdb1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rdb1.setText("RPL");
        jPanel1.add(rdb1);
        rdb1.setBounds(168, 128, 47, 23);

        angga.add(rdb2);
        rdb2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rdb2.setText("TKJ");
        jPanel1.add(rdb2);
        rdb2.setBounds(233, 128, 45, 23);

        alamat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        alamat.setText("Alamat");
        jPanel1.add(alamat);
        alamat.setBounds(105, 158, 41, 14);
        jPanel1.add(alamat1);
        alamat1.setBounds(168, 158, 124, 20);

        send.setForeground(new java.awt.Color(0, 0, 204));
        send.setText("SEND");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        jPanel1.add(send);
        send.setBounds(153, 196, 59, 23);

        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(230, 196, 55, 23);

        jPanel2.setLayout(null);
        jPanel2.add(jLabel7);
        jLabel7.setBounds(354, 161, 0, 0);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Pictures\\ahn jae hyun.jpg")); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(92, 11, 252, 278);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 300);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kelassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kelassActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        // TODO add your handling code here:
        String Nama = nama1.getText();
        String Absen = absen1.getText();
        String Kelas = kelass.getSelectedItem().toString();
        String Jurusan = "";
        String Alamat = alamat1.getText();
        
        if (rdb1.isSelected())
            Jurusan = "RPL";
        else  if (rdb2.isSelected())
            Jurusan = "TKJ";
        else
            
        if (kelass.getSelectedItem()==" X RPL 1"){
            
        }if (kelass.getSelectedItem()==" X RPL 2"){
            
        }if (kelass.getSelectedItem()==" X RPL 3"){
            
        }if (kelass.getSelectedItem()==" X RPL 4"){
            
        }if (kelass.getSelectedItem()==" X RPL 5"){
            
        }if (kelass.getSelectedItem()==" X RPL 6"){
            
        }if (kelass.getSelectedItem()==" X RPL 7"){
            
        }new frame2(Nama, Absen, Kelas, Jurusan, Alamat).setVisible(true);
    }//GEN-LAST:event_sendActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel absen;
    private javax.swing.JTextField absen1;
    private javax.swing.JLabel alamat;
    private javax.swing.JTextField alamat1;
    private javax.swing.ButtonGroup angga;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jurusan;
    private javax.swing.JLabel kelas;
    private javax.swing.JComboBox<String> kelass;
    private javax.swing.JLabel nama;
    private javax.swing.JTextField nama1;
    private javax.swing.JRadioButton rdb1;
    private javax.swing.JRadioButton rdb2;
    private javax.swing.JButton send;
    // End of variables declaration//GEN-END:variables
}
