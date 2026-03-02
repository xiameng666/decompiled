import android.os.SystemClock;

public final class bwry {
    public final String a;
    public final int b;
    public final glrq c;
    public final int d;
    final gltq e;
    public final ggfp f;
    public final int g;
    private final long h;

    public bwry(String s, int v, gltq gltq0, glrq glrq0, int v1, ggfp ggfp0, int v2) {
        this.a = s;
        this.b = v;
        this.e = gltq0;
        this.c = glrq0;
        this.d = v1;
        this.f = ggfp0;
        this.g = v2;
        this.h = SystemClock.elapsedRealtime();
    }

    public final String a() {
        return this.e.name();
    }

    public final void b(bwts bwts0, glrs glrs0, boolean z) {
        int v = z ? ((int)(SystemClock.elapsedRealtime() - this.h)) : 0;
        bwts0.e(this.a, this.b, this.c, glrs0, this.d, this.f, v);
    }
}

