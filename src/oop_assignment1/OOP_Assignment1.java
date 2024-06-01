/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_assignment1;

import java.io.BufferedInputStream;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;




/**
 *
 * @author themi
 */
public class OOP_Assignment1 {
            public static Clip clip;

    /**
     * @param args the command line arguments
     */
   public static void PlayMusic(String path) {
           try {
        InputStream inputStream = OOP_Assignment1.class.getClassLoader().getResourceAsStream(path);
        
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new BufferedInputStream(inputStream));
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        
    } catch (Exception e) {
        e.printStackTrace();
    }

    }

    public static void StopMusic() {
       if (clip != null) {
        if (clip.isRunning()) {
            clip.stop();
            System.out.println("Music stopped");
        } else {
            System.out.println("Clip is not running");
        }
    } else {
        System.out.println("Clip is null");
    }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        GameName gm =new GameName();
        gm.show();
        
        PlayMusic("wav/Cute_Background_Music_No_Copyright_Cute_Copyright_Free_Music128k.wav");

    }
    
}
