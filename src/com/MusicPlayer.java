package com;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class MusicPlayer {

    public static void main(String[] args) {

        String filepath = "C:\\Users\\abbur\\OneDrive\\Desktop\\the_mountain-storytelling-audio-136105.wav";

        File file = new File(filepath);

        try {
            AudioInputStream audioStream =
                    AudioSystem.getAudioInputStream(file);

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            Scanner sc = new Scanner(System.in);
            String response = "";

            System.out.println("🎵 Music Player");
            System.out.println("----------------");
            System.out.println("P = Play");
            System.out.println("S = Stop");
            System.out.println("R = Restart");
            System.out.println("Q = Quit");

            while (!response.equals("Q")) {

                System.out.print("Enter your choice: ");
                response = sc.nextLine().toUpperCase();

                switch (response) {

                    case "P":
                        clip.start();
                        System.out.println("▶ Music playing...");
                        break;

                    case "S":
                        clip.stop();
                        System.out.println("⏹ Music stopped.");
                        break;

                    case "R":
                        clip.setMicrosecondPosition(0);
                        clip.start();
                        System.out.println("🔄 Music restarted.");
                        break;

                    case "Q":
                        clip.stop();
                        clip.close();
                        System.out.println("👋 Exiting music player.");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }
            }

            sc.close();
            audioStream.close();

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported!");

        } catch (IOException e) {
            System.out.println("Something went wrong!");

        } catch (LineUnavailableException e) {
            System.out.println("Unable to play audio!");
        }
    }
}