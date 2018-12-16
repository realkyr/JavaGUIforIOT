/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiforfirebase;

import com.google.firebase.*;
import com.google.firebase.database.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author phureekanusont
 */
public class DataServices {
    private static LinkedList<HistoryData> temperatureData = new LinkedList<HistoryData>();
    private static LinkedList<HistoryData> smokeData = new LinkedList<HistoryData>();

    public static void setTemperatureData(LinkedList<HistoryData> temperatureData) {
        DataServices.temperatureData = temperatureData;
    }

    public static void setSmokeData(LinkedList<HistoryData> smokeData) {
        DataServices.smokeData = smokeData;
    }
    
    public static LinkedList<HistoryData> getTemperatureData(){
        return temperatureData;
    }
    
    public static LinkedList<HistoryData> getSmokeData(){
        return smokeData;
    }
    
    public static void initialTempData(){
    SecurityUtil.getRef("Sensor/tempHistory").addValueEventListener(new ValueEventListener() {
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
           float allSmoke = 0;
           for (DataSnapshot date: dataSnapshot.getChildren()){
               for (DataSnapshot time: date.getChildren()){
                   for (DataSnapshot sec: time.getChildren()){
                       allSmoke += Float.parseFloat(sec.getValue(String.class));
                       counter+=1;
                   }
               }
               if (counter != 0){
                    smokeData.add(new HistoryData(date.getKey(), allSmoke/counter));
               }
               counter = 0;
               allSmoke = 0;
           }
           try {
                TimeUnit.SECONDS.sleep(1);
           } catch (InterruptedException ex) {
                ex.printStackTrace();
           }
        }

        @Override
        public void onCancelled(DatabaseError databaseError) {
        }
        });
    }
}
