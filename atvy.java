import com.google.android.gms.cast.CastDevice;

public final class atvy implements Runnable {
    public final atxp a;
    public final CastDevice b;
    public final long c;
    public final atyb d;
    public final String e;
    public final gkfm f;

    public atvy(atxp atxp0, CastDevice castDevice0, long v, atyb atyb0, String s, gkfm gkfm0) {
        this.a = atxp0;
        this.b = castDevice0;
        this.c = v;
        this.d = atyb0;
        this.e = s;
        this.f = gkfm0;
    }

    @Override
    public final void run() {
        this.a.g.a(this.b, this.c, this.d, this.e, this.f);
    }
}

