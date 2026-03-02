import com.google.android.gms.cast.CastDevice;

public final class atwv implements Runnable {
    public final atxp a;
    public final CastDevice b;
    public final long c;
    public final boolean d;
    public final gket e;
    public final String f;
    public final atyb g;
    public final String h;

    public atwv(atxp atxp0, CastDevice castDevice0, long v, boolean z, gket gket0, String s, atyb atyb0, String s1) {
        this.a = atxp0;
        this.b = castDevice0;
        this.c = v;
        this.d = z;
        this.e = gket0;
        this.f = s;
        this.g = atyb0;
        this.h = s1;
    }

    @Override
    public final void run() {
        this.a.m.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}

