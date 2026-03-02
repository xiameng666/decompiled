import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;

@Deprecated
public final class hf {
    public final Bundle a;

    public hf() {
        this.a = new Bundle();
    }

    public final MediaMetadataCompat a() {
        return new MediaMetadataCompat(this.a);
    }

    public final void b(String s, String s1) {
        if(MediaMetadataCompat.a.containsKey(s) && ((int)(((Integer)MediaMetadataCompat.a.get(s)))) != 1) {
            throw new IllegalArgumentException(a.a(s, "The ", " key cannot be used to put a String"));
        }
        this.a.putCharSequence(s, s1);
    }
}

