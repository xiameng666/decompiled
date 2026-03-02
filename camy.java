import android.database.Cursor;
import android.provider.MediaStore.Audio.Albums;
import android.provider.MediaStore.Audio.Artists;
import dagger.producers.ProducerModule;
import jeb.synthetic.TWR;

@ProducerModule
public final class camy {
    public static final bboh a;

    static {
        camy.a = bboh.b("GmscoreIpa", bbcu.ee);
    }

    public static gmcd a(caoj caoj0, long v, canx canx0, canm canm0, caok caok0) {
        gmcd gmcd0;
        caor caor0 = null;
        switch(caok0.ordinal()) {
            case 0: {
                caon caon0 = new caon();
                caon0.f = 3;
                caon0.a = (long)(-1L + v);
                caon0.b = v;
                caon0.c = MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI;
                caon0.d = caoj.a;
                caoo caoo0 = new caoo(caon0);
                Cursor cursor0 = caoj0.d.a(caoo0);
                if(cursor0 != null) {
                    caor0 = new caor(cursor0);
                }
                break;
            }
            case 1: {
                caon caon1 = new caon();
                caon1.f = 3;
                caon1.a = (long)(-1L + v);
                caon1.b = v;
                caon1.c = MediaStore.Audio.Artists.EXTERNAL_CONTENT_URI;
                caon1.d = caoj.c;
                caoo caoo1 = new caoo(caon1);
                Cursor cursor1 = caoj0.d.a(caoo1);
                if(cursor1 != null) {
                    caor0 = new caos(cursor1);
                }
                break;
            }
            default: {
                throw new IllegalArgumentException("Not supported audio property type");
            }
        }
        try {
            if(caor0 == null) {
                return gmbu.i(Boolean.valueOf(false));
            }
            ((ggtj)camy.a.h()).H("Sending update to icing for %d files to %s corpus.", caor0.a(), caok0);
            gmcd0 = canx0.f(caor0, canm0);
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(caor0, throwable0);
            throw throwable0;
        }
        caor0.close();
        return gmcd0;
    }
}

