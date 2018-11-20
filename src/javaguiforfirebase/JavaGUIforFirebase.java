/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiforfirebase;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.*;
import com.google.firebase.database.*;
import java.awt.BorderLayout;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author phureekanusont
 */
public class JavaGUIforFirebase {
    
    public static String DATABASE_URL = "https://java-iot-bed31.firebaseio.com/";
    
    public static void main(String[] args) {
        FileInputStream serviceAccount;
        try {
            serviceAccount = new FileInputStream("service-account.json");
            FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl(DATABASE_URL)
                .build();
            FirebaseApp.initializeApp(options);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaGUIforFirebase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JavaGUIforFirebase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("name");
        GUI gui = new GUI();
        
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
              String post = dataSnapshot.getValue(String.class);
              gui.setLabel(post);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
              System.out.println("The read failed: " + databaseError.getCode());
            }
        });
        
        gui.init();
        
    }
    
}
