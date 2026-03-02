import com.google.android.gms.cast.CastDevice;

public final class atxa implements Runnable {
    public final atxp a;
    public final CastDevice b;
    public final long c;
    public final boolean d;
    public final String e;
    public final atyb f;
    public final String g;
    public final int h;

    public atxa(atxp atxp0, CastDevice castDevice0, long v, boolean z, String s, atyb atyb0, int v1, String s1) {
        this.a = atxp0;
        this.b = castDevice0;
        this.c = v;
        this.d = z;
        this.e = s;
        this.f = atyb0;
        this.h = v1;
        this.g = s1;
    }

    @Override
    public final void run() {
        atxp atxp0 = this.a;
        if(((Boolean)atxp0.b.mr()).booleanValue()) {
            atxp0.d.b();
        }
        atxp0.m.f(this.b, this.c, this.d, this.e, this.f, this.h, this.g);
    }
}

