import java.util.ArrayList;
import java.util.List;

public class PlaylistImpl implements Playlist {
    private List<Song> songs = new ArrayList<>();

    @Override
    public Iterator<Song> createIterator() {
        return new SongIterator();
    }

    @Override
    public void addSong(Song song) {
        songs.add(song);
    }

    private class SongIterator implements Iterator<Song> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < songs.size();
        }

        @Override
        public Song next() {
            if (hasNext()) {
                return songs.get(index++);
            }
            return null;
        }
    }
}
