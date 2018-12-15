/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiforfirebase;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.*;

/**
 *
 * @author phureekanusont
 */
public class SoundPlayer {
    
    private static String fileLocation = "alarm.wav";
    private static FileInputStream inputStream = null;
    private static AudioStream audioStream;
    private static AudioData md;
    private static ContinuousAudioDataStream con;
    
    public static void setFileLocation(String fileLocation){
        SoundPlayer.fileLocation = fileLocation;
    }
    
    public static void setSound(String path){
        try {
            setFileLocation(path);
            inputStream = new FileInputStream(SoundPlayer.fileLocation);
            audioStream = new AudioStream(SoundPlayer.inputStream);
            md = audioStream.getData();
            con = new ContinuousAudioDataStream(md);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SoundPlayer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SoundPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void play(){
        AudioPlayer.player.start(con);
    }
    
    public static void stop(){
        AudioPlayer.player.stop(con);
    }
    
    public static void main(String[] args){
        SoundPlayer.setSound("alarm.wav");
        SoundPlayer.play();
    }
}
