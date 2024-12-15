public class Playlist {
    public String playlistName;
    public Song s;
    public String

    public Playlist(String s){
        playlistName = s;
        System.out.println(playlistName + " created.");
        s = null;
    }

    public void addSong(Song obj){
        if(s == null){
            s = obj;
        }
        else{
            Song
        }
    }
}
