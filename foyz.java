import android.os.SystemClock;

public final class foyz {
    final long a;
    long b;
    long c;
    int d;
    int e;
    final String f;
    final String g;
    final boolean h;
    String i;
    int j;
    String k;
    idbq l;
    int m;
    public iczv n;
    int o;
    int p;
    public int q;
    public int r;
    public gfsx s;
    int t;
    public int u;
    public int v;

    public foyz(String s) {
        this(null, s, false, SystemClock.elapsedRealtime());
    }

    public foyz(String s, String s1, boolean z, long v) {
        this.v = 1;
        this.r = -1;
        this.g = gfta.a(s);
        this.f = gfta.a(s1);
        this.h = z;
        this.a = v;
        this.s = gfqx.a;
    }

    public final void a(int v, int v1) {
        this.c = SystemClock.elapsedRealtime() - this.a;
        this.d = v;
        this.e = v1;
    }

    public final void b() {
        this.b = SystemClock.elapsedRealtime() - this.a;
    }

    public final void c(String s) {
        if(!gfta.c(s)) {
            this.k = s;
        }
    }

    public final void d(int v) {
        if(v >= 0) {
            this.j = v;
        }
    }
}

