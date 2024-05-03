package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class SongsDatabaseTest {

    @Test
    public void testAddSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        assertTrue(db.getSongs("Rap").contains("Savage"));
    }

    @Test
    public void testAddMultipleSongs() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Country", "Sweet Home Alabama");
        assertTrue(db.getSongs("Rap").contains("Savage"));
        assertTrue(db.getSongs("Rap").contains("Gin and Juice"));
        assertTrue(db.getSongs("Country").contains("Sweet Home Alabama"));
    }

    @Test
    public void testGetGenreOfSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        assertEquals("Rap", db.getGenreOfSong("Savage"));
    }

    @Test
    public void testGetSongsForNonExistingGenre() {
        SongsDatabase db = new SongsDatabase();
        Set<String> emptySet = new HashSet<>();
        assertEquals(emptySet, db.getSongs("Pop"));
    }

    @Test
    public void testGetGenreOfNonExistingSong() {
        SongsDatabase db = new SongsDatabase();
        assertNull(db.getGenreOfSong("Bohemian Rhapsody"));
    }
}
