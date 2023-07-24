package ThiredTest;

public class SongTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song s1=new Song("vincent","don mclean");
		Song s2=new Song("luck in the sky","the beatles");
		Song s3=new Song("dancing queen","ABBA");
		MusicLibrary musicLibrary=new MusicLibrary();
		musicLibrary.addSong(s3);
		musicLibrary.addSong(s2);
		musicLibrary.addSong(s1);
		
		musicLibrary.playsong();

	}

}
