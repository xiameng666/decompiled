import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.util.Set;

public final class flmm implements Runnable {
    public final flmu a;
    public final String b;
    public final String[] c;
    public final ContentValues d;
    public final fmft e;
    public final Set f;

    public flmm(flmu flmu0, String s, String[] arr_s, ContentValues contentValues0, fmft fmft0, Set set0) {
        this.a = flmu0;
        this.b = s;
        this.c = arr_s;
        this.d = contentValues0;
        this.e = fmft0;
        this.f = set0;
    }

    @Override
    public final void run() {
        flmu flmu0 = this.a;
        Uri uri0 = flmu0.l("messages");
        String s = this.b;
        String[] arr_s = this.c;
        flnc flnc0 = flmu0.e;
        try(Cursor cursor0 = flnc0.h(uri0, new String[]{"message_id", "message_status"}, s, arr_s, null, null)) {
            ContentValues contentValues0 = this.d;
            fmft fmft0 = this.e;
            Set set0 = this.f;
            if(cursor0.moveToFirst()) {
                flnc0.b(flmu0.l("messages"), contentValues0, s, arr_s);
                do {
                    String s1 = cursor0.getString(0);
                    fmft fmft1 = fmft.a(cursor0.getInt(1));
                    if(!fmft1.equals(fmft0)) {
                        set0.add(fmft1);
                        flmu0.P(s1);
                        flmu.ap();
                    }
                }
                while(cursor0.moveToNext());
            }
        }
    }
}

