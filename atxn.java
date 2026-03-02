import com.google.android.gms.cast.CastDevice;

public final class atxn implements Runnable {
    public final atxp a;
    public final CastDevice b;
    public final long c;
    public final String d;
    public final boolean e;
    public final String f;
    public final atyb g;
    public final int h;
    public final String i;

    public atxn(atxp atxp0, CastDevice castDevice0, long v, String s, boolean z, String s1, atyb atyb0, int v1, String s2) {
        this.a = atxp0;
        this.b = castDevice0;
        this.c = v;
        this.d = s;
        this.e = z;
        this.f = s1;
        this.g = atyb0;
        this.h = v1;
        this.i = s2;
    }

    @Override
    public final void run() {
        this.a.h.d(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}

