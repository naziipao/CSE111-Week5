public class Song {
    public String title;
    public String artist;
    public int length;
    public Song next;

    public Song(String s1, String s2, int n){
        title = s1;
        artist = s2;
        length = n;
        next = null;
    }

    public void songInfo(){
        System.out.println("Title: " + title + "\nArtist: " + artist+ "\nLength: " + length);
    }
}
