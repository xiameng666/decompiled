import com.google.android.gms.cast.CastDevice;

public final class atvu implements Runnable {
    public final atxp a;
    public final CastDevice b;
    public final String c;

    public atvu(atxp atxp0, CastDevice castDevice0, String s) {
        this.a = atxp0;
        this.b = castDevice0;
        this.c = s;
    }

    @Override
    public final void run() {
        this.a.j.d(this.b, this.c);
    }
}

