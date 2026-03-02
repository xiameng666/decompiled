import com.google.android.gms.cast.CastDevice;

public final class atvg implements Runnable {
    public final atxp a;
    public final CastDevice b;
    public final long c;
    public final atyb d;
    public final gkey e;
    public final String f;

    public atvg(atxp atxp0, CastDevice castDevice0, long v, atyb atyb0, gkey gkey0, String s) {
        this.a = atxp0;
        this.b = castDevice0;
        this.c = v;
        this.d = atyb0;
        this.e = gkey0;
        this.f = s;
    }

    @Override
    public final void run() {
        this.a.g.b(this.b, this.c, this.d, this.e, this.f);
    }
}

