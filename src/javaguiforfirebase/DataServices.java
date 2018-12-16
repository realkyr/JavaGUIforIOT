/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiforfirebase;

import com.google.firebase.*;
import com.google.firebase.database.*;
import java.util.*;

/**
 *
 * @author phureekanusont
 */
public class DataServices {
    private static LinkedList<HistoryData> temperatureData = new LinkedList<HistoryData>();
    private static LinkedList<HistoryData> smokeData = new LinkedList<HistoryData>();
    
    public static LinkedList<HistoryData> getTemperatureData(){
        return temperatureData;
    }
    
    public static LinkedList<HistoryData> getSmokeData(){
        return smokeData;
    }
    
    public static void initialTempData(){
    SecurityUtil.getRef("Sensor/tempHistory").addListenerForSingleValueEvent(new ValueEventListener() {
    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {
           int counter = 0;
           float allTemp = 0;
           for (DataSnapshot date: dataSnapshot.getChildren()){
               for (DataSnapshot time: date.getChildren()){
                   for (DataSnapshot sec: time.getChildren()){
                       allTemp += Float.parseFloat(sec.getValue(String.class));
                       counter+=1;
                   }
               }
               if (counter != 0){
                    temperatureData.add(new HistoryData(date.getKey(), allTemp/counter));
                    System.out.println("add data successful");
               }
               counter = 0;
               allTemp = 0;
           }
           
        }

        @Override
        public void onCancelled(DatabaseError databaseError) {
        }
        });
    }
    
    public static void initialSmokeData(){
    SecurityUtil.getRef("Sensor/smokeHistory").addListenerForSingleValueEvent(new ValueEventListener() {
    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {
           int counter = 0;
           float allTemp = 0;
           for (DataSnapshot date: dataSnapshot.getChildren()){
               for (DataSnapshot time: date.getChildren()){
                   for (DataSnapshot sec: time.getChildren()){
                       allTemp += Float.parseFloat(sec.getValue(String.class));
                       counter+=1;
                   }
               }
               if (counter != 0){
                    smokeData.add(new HistoryData(date.getKey(), allTemp/counter));
               }
               counter = 0;
               allTemp = 0;
           }
           
        }

        @Override
        public void onCancelled(DatabaseError databaseError) {
        }
        });
    }
}
