import com.google.android.gms.cast.CastDevice;

public final class atxi implements Runnable {
    public final atxp a;
    public final CastDevice b;
    public final long c;
    public final int d;
    public final String e;
    public final atyb f;
    public final String g;
    public final String h;
    public final String i;

    public atxi(atxp atxp0, CastDevice castDevice0, long v, int v1, String s, atyb atyb0, String s1, String s2, String s3) {
        this.a = atxp0;
        this.b = castDevice0;
        this.c = v;
        this.d = v1;
        this.e = s;
        this.f = atyb0;
        this.g = s1;
        this.h = s2;
        this.i = s3;
    }

    @Override
    public final void run() {
        this.a.h.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}

