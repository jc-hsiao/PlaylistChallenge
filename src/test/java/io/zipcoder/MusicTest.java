package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class MusicTest {


    @Test
    public void selectionTest1(){
        String[] playlist = {"wheniseeyouagain","borntorun","nothingelsematters","cecelia"};
        Music music = new Music(playlist);
        Integer startingIndex = 1;
        String selection = "cecelia";
        Integer expected = 2;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectionTest2(){

        String[] playlist = {"dancinginthedark","rio","liveoak","liveoak"};
        Music music = new Music(playlist);
        Integer startingIndex = 0;
        String selection = "liveoak";
        Integer expected = 1;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectionTest3(){

        String[] playlist = {"a","b","c","d","e"};
        Music music = new Music(playlist);
        Integer startingIndex = 3;
        String selection = "a";
        Integer expected = 2;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }


    String[] playlist1 = {"A","c","c","c","c","A","A","c","c","c"};
    @Test
    public void selectionTest4(){
        Music music = new Music(playlist1);
        Integer startingIndex = 1;
        String selection = "A";
        Integer expected = 1;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void selectionTest5(){
        Music music = new Music(playlist1);
        Integer startingIndex = 8;
        String selection = "A";
        Integer expected = 2;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectionTest6(){
        Music music = new Music(playlist1);
        Integer startingIndex = 3;
        String selection = "A";
        Integer expected = 2;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findNextSongTest1(){
        String[] playlist = {"a","b","c","d","e"};
        Music music = new Music(playlist);
        Integer startingIndex = 4;
        String selection = "d";
        Integer expected = 4;
        Integer actual = music.findNextSong(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findNextSongTest2(){
        String[] playlist = {"a","b","c","d","e"};
        Music music = new Music(playlist);
        Integer startingIndex = 1;
        String selection = "d";
        Integer expected = 2;
        Integer actual = music.findNextSong(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPrevSongTest1(){
        String[] playlist = {"a","b","c","d","e"};
        Music music = new Music(playlist);
        Integer startingIndex = 0;
        String selection = "d";
        Integer expected = 2;
        Integer actual = music.findPrevSong(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPrevSongTest2(){
        String[] playlist = {"a","b","c","d","e"};
        Music music = new Music(playlist);
        Integer startingIndex = 4;
        String selection = "b";
        Integer expected = 3;
        Integer actual = music.findPrevSong(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

}
