import com.google.android.gms.cast.CastDevice;

public final class atxj implements Runnable {
    public final atxp a;
    public final CastDevice b;
    public final long c;
    public final String d;
    public final String e;
    public final atyb f;
    public final long g;
    public final String h;

    public atxj(atxp atxp0, CastDevice castDevice0, long v, String s, String s1, atyb atyb0, long v1, String s2) {
        this.a = atxp0;
        this.b = castDevice0;
        this.c = v;
        this.d = s;
        this.e = s1;
        this.f = atyb0;
        this.g = v1;
        this.h = s2;
    }

    @Override
    public final void run() {
        this.a.h.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}

