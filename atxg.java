import com.google.android.gms.cast.CastDevice;

public final class atxg implements Runnable {
    public final atxp a;
    public final CastDevice b;
    public final long c;
    public final atyb d;
    public final String e;
    public final int f;

    public atxg(atxp atxp0, CastDevice castDevice0, long v, atyb atyb0, String s, int v1) {
        this.a = atxp0;
        this.b = castDevice0;
        this.c = v;
        this.d = atyb0;
        this.e = s;
        this.f = v1;
    }

    @Override
    public final void run() {
        this.a.g.g(this.b, this.c, this.d, this.e, this.f);
    }
}

