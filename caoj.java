import android.database.Cursor;
import android.provider.MediaStore.Audio.Albums;
import android.provider.MediaStore.Audio.Artists;
import android.provider.MediaStore.Audio.Playlists;

public final class caoj {
    public static final String[] a;
    static final String[] b;
    public static final String[] c;
    public final caop d;

    static {
        caoj.a = new String[]{"_id", "album", "album_art", "artist", "numsongs"};
        caoj.b = new String[]{"_id", "name"};
        caoj.c = new String[]{"_id", "artist"};
    }

    public caoj(caop caop0) {
        this.d = caop0;
    }

    public final caoq a(caok caok0) {
        int v = caok0.ordinal();
        Long long0 = (long)0L;
        switch(v) {
            case 0: {
                caon caon1 = new caon();
                caon1.f = 1;
                caon1.a = long0;
                caon1.c = MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI;
                caon1.d = caoj.a;
                caoo caoo1 = new caoo(caon1);
                Cursor cursor1 = this.d.a(caoo1);
                if(cursor1 != null) {
                    return new caor(cursor1);
                }
                break;
            }
            case 1: {
                caon caon2 = new caon();
                caon2.f = 1;
                caon2.a = long0;
                caon2.c = MediaStore.Audio.Artists.EXTERNAL_CONTENT_URI;
                caon2.d = caoj.c;
                caoo caoo2 = new caoo(caon2);
                Cursor cursor2 = this.d.a(caoo2);
                if(cursor2 != null) {
                    return new caos(cursor2);
                }
                break;
            }
            default: {
                if(v != 2) {
                    throw new IllegalArgumentException("Not supported audio property type");
                }
                caon caon0 = new caon();
                caon0.f = 1;
                caon0.a = long0;
                caon0.c = MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI;
                caon0.d = caoj.b;
                caoo caoo0 = new caoo(caon0);
                Cursor cursor0 = this.d.a(caoo0);
                if(cursor0 != null) {
                    return new caou(cursor0);
                }
            }
        }
        return null;
    }
}

