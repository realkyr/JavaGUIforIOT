/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiforfirebase;

import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phureekanusont
 */
public class SecurityGUI extends javax.swing.JFrame {

    /**
     * Creates new form SecurityGUI
     */
    public SecurityGUI() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Empty = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField41 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Empty1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Security");
        setBackground(new java.awt.Color(34, 34, 34));
        setPreferredSize(new java.awt.Dimension(544, 450));

        jPanel3.setBackground(new java.awt.Color(34, 34, 34));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(34, 34, 34));

        jLabel1.setFont(new java.awt.Font("RSU", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hand.png"))); // NOI18N
        jLabel1.setText("Home Security");
        jPanel2.add(jLabel1);

        jPanel3.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(34, 34, 34));
        jPanel4.setPreferredSize(new java.awt.Dimension(200, 306));
        jPanel4.setLayout(new java.awt.GridLayout(6, 0));

        jLabel8.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("อุณหภูมิปัจจุบัน");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setPreferredSize(new java.awt.Dimension(99, 20));
        jPanel4.add(jLabel8);

        jLabel4.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("อุณหภูมิที่จะควบคุม");
        jLabel4.setPreferredSize(new java.awt.Dimension(145, 15));
        jPanel4.add(jLabel4);

        Empty.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        Empty.setForeground(new java.awt.Color(255, 255, 255));
        Empty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(Empty);

        jLabel2.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ปริมาณควัน");
        jPanel4.add(jLabel2);

        jLabel12.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ปริมาณควันที่จะควบคุม");
        jPanel4.add(jLabel12);

        jPanel3.add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setBackground(new java.awt.Color(34, 34, 34));
        jPanel5.setLayout(new java.awt.GridLayout(6, 0));

        jTextField1.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("loading");
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField1);

        jTextField2.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("loading");
        jTextField2.setEnabled(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField2);

        jButton1.setFont(new java.awt.Font("RSU", 0, 13)); // NOI18N
        jButton1.setText("บันทึก");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);

        jTextField41.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jTextField41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField41.setText("loading");
        jTextField41.setEnabled(false);
        jTextField41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField41ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField41);

        jTextField4.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("loading");
        jTextField4.setEnabled(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField4);

        jButton3.setFont(new java.awt.Font("RSU", 0, 13)); // NOI18N
        jButton3.setText("บันทึก");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel6.setBackground(new java.awt.Color(34, 34, 34));
        jPanel6.setLayout(new java.awt.GridLayout(3, 0));

        jPanel9.setBackground(new java.awt.Color(34, 34, 34));
        jPanel9.setLayout(new java.awt.GridLayout(1, 2));

        jLabel9.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText(" ");
        jPanel9.add(jLabel9);

        jLabel7.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(" ");
        jPanel9.add(jLabel7);

        jPanel6.add(jPanel9);

        jPanel1.setBackground(new java.awt.Color(34, 34, 34));

        jButton4.setFont(new java.awt.Font("RSU", 0, 13)); // NOI18N
        jButton4.setText("กราฟค่าเฉลี่ยอุณหภูมิ");
        jPanel1.add(jButton4);

        jButton6.setFont(new java.awt.Font("RSU", 0, 13)); // NOI18N
        jButton6.setText("กราฟค่าเฉลี่ยควัน");
        jPanel1.add(jButton6);

        jPanel6.add(jPanel1);

        jPanel8.setBackground(new java.awt.Color(34, 34, 34));

        jLabel10.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("เสียงเมื่อแจ้งตือน :");
        jPanel8.add(jLabel10);

        jButton2.setFont(new java.awt.Font("RSU", 0, 13)); // NOI18N
        jButton2.setText("ตั้งค่าเสียง");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton2);

        jPanel6.add(jPanel8);

        jPanel3.add(jPanel6, java.awt.BorderLayout.SOUTH);

        jPanel7.setBackground(new java.awt.Color(34, 34, 34));
        jPanel7.setPreferredSize(new java.awt.Dimension(150, 0));
        jPanel7.setLayout(new java.awt.GridLayout(6, 0));

        jLabel3.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("องศาเซลเซียส");
        jPanel7.add(jLabel3);

        jLabel11.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("องศาเซลเซียส");
        jPanel7.add(jLabel11);

        Empty1.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        Empty1.setForeground(new java.awt.Color(255, 255, 255));
        Empty1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(Empty1);

        jLabel5.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PPM");
        jPanel7.add(jLabel5);

        jLabel13.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("PPM");
        jPanel7.add(jLabel13);

        jPanel3.add(jPanel7, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String val = jTextField2.getText();
        if (!val.equals("loading")){
            SecurityUtil.setValue("Controller/max_temp", val);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField41ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String val = jTextField4.getText();
        if (!val.equals("loading")){
            SecurityUtil.setValue("Controller/max_smoke", val);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    public javax.swing.JLabel getLabel(int index){
        switch (index){
            case 1: return jLabel1;
            case 2: return jLabel2;
            case 3: return jLabel3;
            case 4: return jLabel4;
            case 5: return jLabel5;
            case 7: return jLabel7;
            case 9: return jLabel9;
            case 10: return jLabel10;
            default: return null;
        }
    }
    
    public javax.swing.JTextField getTextField(int index){
        switch (index){
            case 1: return jTextField1;
            case 2: return jTextField2;
            case 3: return jTextField41;
            case 4: return jTextField4;
            default: return null;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Empty;
    private javax.swing.JLabel Empty1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField41;
    // End of variables declaration//GEN-END:variables
}
