import android.content.ContentValues;
import android.net.Uri;

public final class flmc implements Runnable {
    public final flmu a;
    public final ContentValues b;
    public final fmga c;
    public final long d;

    public flmc(flmu flmu0, ContentValues contentValues0, fmga fmga0, long v) {
        this.a = flmu0;
        this.b = contentValues0;
        this.c = fmga0;
        this.d = v;
    }

    @Override
    public final void run() {
        flmu flmu0 = this.a;
        Uri uri0 = flmu0.l("messages");
        flmu0.e.b(uri0, this.b, "message_id = ?", new String[]{this.c.a});
        long v = flmu0.d(this.c.c);
        if(v != -1L) {
            flmu0.X(v, Long.valueOf(this.d));
            flmu0.Y(v);
            return;
        }
        flbj.c("SQLiteMessagingStore", "Message time updated for non existent conversation");
    }
}

