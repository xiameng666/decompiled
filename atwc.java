import com.google.android.gms.cast.CastDevice;

public final class atwc implements Runnable {
    public final atxp a;
    public final CastDevice b;
    public final long c;
    public final boolean d;
    public final String e;
    public final atyb f;
    public final boolean g;
    public final String h;

    public atwc(atxp atxp0, CastDevice castDevice0, long v, boolean z, String s, atyb atyb0, boolean z1, String s1) {
        this.a = atxp0;
        this.b = castDevice0;
        this.c = v;
        this.d = z;
        this.e = s;
        this.f = atyb0;
        this.g = z1;
        this.h = s1;
    }

    @Override
    public final void run() {
        this.a.m.c(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}

