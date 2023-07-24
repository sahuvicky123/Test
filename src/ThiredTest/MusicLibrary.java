package ThiredTest;

import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
	private ArrayList<Song>songs;
	
    public MusicLibrary(){
    	this.songs=new ArrayList<Song>();
    }
    
    public void addSong(Song s)
    {
    	songs.add(s);
    }
    public void removeSong(Song s)
    {
    	songs.remove(s);
    }
    public ArrayList<Song> getcollection()
    {
    	return songs;
    }
    public void playsong()
    {
    	int size=songs.size();
    	Random random=new Random();
    	if(songs.size()==0)
    	{
    		System.out.println("No song");
    	}
    	int index=random.nextInt(size);
    	System.out.println(songs.get(index).getTitle()+" "+songs.get(index).getArtist());
    }

}
