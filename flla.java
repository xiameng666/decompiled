import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import jeb.synthetic.TWR;

public final class flla {
    final long a;
    private final Context b;
    private final flnc c;

    public flla(Context context0, flnc flnc0, long v) {
        this.b = context0.getApplicationContext();
        this.c = flnc0;
        this.a = v;
    }

    public final gfsx a(String s) {
        gfsx gfsx0;
        Uri uri0 = this.d();
        Cursor cursor0 = this.c.h(uri0, flql.a, "key = ?", new String[]{s}, null, "1");
        try {
            if(cursor0 == null) {
                gfsx0 = gfqx.a;
            }
            else if(cursor0.moveToFirst()) {
                gfsx0 = gfsx.m(cursor0.getBlob(1));
            }
            else {
                gfsx0 = gfqx.a;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        if(cursor0 != null) {
            cursor0.close();
        }
        return gfsx0;
    }

    public final void b() {
        Uri uri0 = this.d();
        this.c.a(uri0, "key = ?", new String[]{"CURRENT_BOOTSTRAP_LATEST_MESSAGE_TIMESTAMP"});
    }

    public final void c(String s, byte[] arr_b) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("key", s);
        contentValues0.put("value", arr_b);
        Uri uri0 = this.d();
        this.c.c(uri0, contentValues0, 5);
    }

    private final Uri d() {
        return flnh.a("com.google.android.gms.lighter.data", "MESSAGING", "kvstore", new String[]{Long.toString(this.a)});
    }
}

