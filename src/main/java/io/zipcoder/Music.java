package io.zipcoder;
public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }
    public Integer selection(Integer startIndex, String selection){

        int toRight = findNextSong(startIndex, selection);
        int toLeft = findPrevSong(startIndex, selection);

        //return (toRight > toLeft)? toLeft: toRight;
        return Math.min(toRight, toLeft);
    }

    public int findNextSong(int index, String songName){
        int i = index;
        int steps = 0;
        do{
            if(playList[i].equals(songName)){
                return steps;
            }
            i++;
            steps++;

            if(i==playList.length){
                i=0;
            }
        }while(i != index);
        return -1;
    }

    public int findPrevSong(int index, String songName){
        int i = index;
        int steps = 0;
        do{
            if(playList[i].equals(songName)){
                return steps;
            }
            i--;
            steps++;

            if(i==-1){
                i=playList.length-1;
            }
        }while(i != index);
        return -1;
    }



}
