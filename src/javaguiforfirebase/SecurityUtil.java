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
public class SecurityUtil {
    
    public static String DATABASE_URL = "https://java-iot-bed31.firebaseio.com/";
    
    public static void setUp(){
        FileInputStream serviceAccount;
        try {
            serviceAccount = new FileInputStream("service-account.json");
            FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl(DATABASE_URL)
                .build();
            FirebaseApp.initializeApp(options);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SecurityUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SecurityUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static DatabaseReference getRef(String path){
        return FirebaseDatabase.getInstance().getReference(path);
    }
    
    public static void getValue(String path, String output){
        SecurityUtil.getRef(path).addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {
           String val = dataSnapshot.getValue(String.class);
           switch (output){
               case "temp": SecurityData.setCurrent_temp(val);
                            break;
               case "control_temp": SecurityData.setControl_temp(val);
                                    break;
           }
           
        }

        @Override
        public void onCancelled(DatabaseError databaseError) {
        }
        });
    }

    
    public static void setValue(String path, String val){
        DatabaseReference myRef = SecurityUtil.getRef(path);
        myRef.setValue(val, null);
    }
    

    
}
