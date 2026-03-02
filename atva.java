import com.google.android.gms.cast.CastDevice;

public final class atva implements Runnable {
    public final atxp a;
    public final CastDevice b;
    public final long c;

    public atva(atxp atxp0, CastDevice castDevice0, long v) {
        this.a = atxp0;
        this.b = castDevice0;
        this.c = v;
    }

    @Override
    public final void run() {
        this.a.q.a(this.b, this.c);
    }
}

