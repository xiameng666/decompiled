import android.database.Cursor;
import android.provider.MediaStore.Audio.Media;

public final class caoi extends caom {
    static final String a;
    static final String[] b;

    static {
        caoi.a = String.format("(%s=1 OR %s=1) AND %s IS NOT NULL", "is_music", "is_podcast", "title");
        caoi.b = new String[]{"_id", "date_modified", "title", "album", "album_id", "artist", "artist_id"};
    }

    public caoi(caop caop0) {
        this.c = caop0;
    }

    public final caot a(Long long0, Long long1) {
        String s = huhz.a.h().P() ? caoi.a : null;
        boolean z = huhz.m();
        int v = z ? 1 : 2;
        if(long1 == null) {
            long1 = null;
        }
        else if(!z) {
            v = 4;
        }
        else {
            v = 3;
        }
        caon caon0 = new caon();
        caon0.f = v;
        caon0.c = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        caon0.d = caoi.b;
        caon0.a = long0;
        if(long1 != null) {
            caon0.b = long1;
        }
        if(s != null) {
            caon0.e = s;
        }
        caoo caoo0 = new caoo(caon0);
        Cursor cursor0 = this.c.a(caoo0);
        return cursor0 == null ? null : new caot(cursor0);
    }
}

