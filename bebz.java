import android.app.PendingIntent;

public final class bebz extends Exception {
    public final int a;
    public final PendingIntent b;

    public bebz(int v, String s) {
        this(v, s, null, null);
    }

    public bebz(int v, String s, PendingIntent pendingIntent0, Throwable throwable0) {
        super(s, throwable0);
        this.a = v;
        this.b = pendingIntent0;
    }
}

