public interface Playlist {
    Iterator<Song> createIterator();
    void addSong(Song song);
}
