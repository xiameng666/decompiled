import android.content.ContentValues;
import android.net.Uri;

public final class fllv implements Runnable {
    public final flmu a;
    public final ContentValues b;
    public final String c;
    public final String[] d;

    public fllv(flmu flmu0, ContentValues contentValues0, String s, String[] arr_s) {
        this.a = flmu0;
        this.b = contentValues0;
        this.c = s;
        this.d = arr_s;
    }

    @Override
    public final void run() {
        Uri uri0 = this.a.l("messages");
        this.a.e.b(uri0, this.b, this.c, this.d);
    }
}

