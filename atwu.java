import com.google.android.gms.cast.CastDevice;

public final class atwu implements Runnable {
    public final atxp a;
    public final CastDevice b;
    public final long c;
    public final atyb d;
    public final String e;
    public final gkfq f;

    public atwu(atxp atxp0, CastDevice castDevice0, long v, atyb atyb0, String s, gkfq gkfq0) {
        this.a = atxp0;
        this.b = castDevice0;
        this.c = v;
        this.d = atyb0;
        this.e = s;
        this.f = gkfq0;
    }

    @Override
    public final void run() {
        this.a.g.d(this.b, this.c, this.d, this.e, this.f);
    }
}

