package org.howard.edu.lsp.oopfinal.question1;

import java.util.*;

/**
 * Represents a database of songs categorized by genre.
 */
public class SongsDatabase {
    // Map to store genres as keys and corresponding sets of songs as values
    private Map<String, Set<String>> map = new HashMap<>();

    /**
     * Add a song title to a genre.
     *
     * @param genre     The genre of the song.
     * @param songTitle The title of the song.
     */
    public void addSong(String genre, String songTitle) {
        // If the genre does not exist in the map, create a new entry
        if (!map.containsKey(genre)) {
            map.put(genre, new HashSet<>());
        }
        // Add the song title to the set of songs for the specified genre
        map.get(genre).add(songTitle);
    }

    /**
     * Return the genre of a given song title.
     *
     * @param songTitle The title of the song.
     * @return The genre of the song, or null if the song is not found.
     */
    public String getGenreOfSong(String songTitle) {
        // Iterate through each entry in the map
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            // Check if the set of songs for the current genre contains the given song title
            if (entry.getValue().contains(songTitle)) {
                // If found, return the genre
                return entry.getKey();
            }
        }
        // If song not found, return null
        return null;
    }

    /**
     * Return the set of songs for a given genre.
     *
     * @param genre The genre for which to retrieve the songs.
     * @return The set of songs for the specified genre, or an empty set if the genre is not found.
     */
    public Set<String> getSongs(String genre) {
        // Return the set of songs for the specified genre, or an empty set if the genre is not found
        return map.getOrDefault(genre, new HashSet<>());
    }
}
