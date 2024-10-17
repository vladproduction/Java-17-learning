package com.vladproduction.control_flow;

import java.util.Scanner;

public class MainMusicPlayer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isPlaying = true;
        int currentSongIndex = 0;

        // Array of songs
        String[] songs = {"Song 1", "Song 2", "Song 3", "Song 4"};

        while (isPlaying) {
            // Play the current song
            System.out.println("Now playing: " + songs[currentSongIndex]);
            System.out.println("Options: [s]kip to next song, [p]ause, or type 'stop' to exit.");

            String userInput = input.next().toLowerCase();

            switch (userInput) {
                case "s":
                    // Skip to next song
                    currentSongIndex++;
                    if (currentSongIndex >= songs.length) {
                        currentSongIndex = 0; // Loop back to the first song
                    }
                    break;
                case "p":
                    // Pause the song
                    System.out.println("Paused. Type 'resume' to continue or 'stop' to exit.");
                    boolean isPaused = true;

                    while (isPaused) {
                        String pauseInput = input.next().toLowerCase();
                        if ("resume".equals(pauseInput)) {
                            // Resume playing the song
                            isPaused = false;
                        } else if ("stop".equals(pauseInput)) {
                            isPlaying = false; // Exit the main loop
                            isPaused = false;  // Also exit the pause loop
                        } else {
                            System.out.println("Invalid input. Type 'resume' or 'stop'.");
                        }
                    }
                    break;
                case "stop":
                    // Stop playing songs
                    isPlaying = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose 's', 'p', or 'stop'.");
            }
        }

        System.out.println("Exiting music player. Goodbye!");

    }
}
