/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiforfirebase;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author phureekanusont
 */
public class Main {
    static SecurityGUI gui = new SecurityGUI();
    
    public static void addTempListener(String path, JTextField output){
        SecurityUtil.getRef(path).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
              String post = dataSnapshot.getValue(String.class);
              output.setText(post);
              SecurityData.setCurrent_temp(post);
              warn();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
              System.out.println("The read failed: " + databaseError.getCode());
            }
        });
    }
    
    public static void addTempControlListener(String path, JTextField output){
        SecurityUtil.getRef(path).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
              String post = dataSnapshot.getValue(String.class);
              output.setText(post);
              SecurityData.setControl_temp(post);
              warn();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
              System.out.println("The read failed: " + databaseError.getCode());
            }
        });
    }
    
    public static void warn(){
        if (SecurityData.is_danger()){
            gui.getLabel(7).setForeground(new java.awt.Color(255, 51, 51));
            gui.getLabel(7).setText("อันตราย!!");
        }
        else {
            gui.getLabel(7).setForeground(new java.awt.Color(51, 255, 51));
            gui.getLabel(7).setText("สถานะปกติ");
        }
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
            java.util.logging.Logger.getLogger(SecurityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecurityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecurityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecurityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gui.setVisible(true);
            }
        });
        
        SecurityUtil.setUp();
        
        SecurityUtil.getValue("Controller/max_temp", "control_temp");
        SecurityUtil.getValue("Sensor/Data/Temperature", "temp");
        
        while(SecurityData.getControl_temp().equals("")){
            gui.getTextField(2).setText("loading");
        }
        gui.getTextField(2).setText(SecurityData.getControl_temp());
        gui.getTextField(2).setEnabled(true);
        gui.getTextField(1).setText(SecurityData.getCurrent_temp());
        addTempListener("Sensor/Data/Temperature", gui.getTextField(1));
        addTempControlListener("Controller/max_temp", gui.getTextField(2));
    }
}
