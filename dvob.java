import java.util.Set;

public final class dvob {
    static final ggfp a;
    final haoz b;
    final byte[] c;
    final byte[] d;
    final Set e;
    final fgzk f;
    final gfsx g;
    final gfsx h;
    final gfsx i;
    final gfsx j;
    final gfsx k;
    final boolean l;
    final boolean m;
    public static final int n;

    static {
        dvob.a = ggnj.a;
    }

    public dvob(haoz haoz0, fgzk fgzk0) {
        this(haoz0, null, null, dvob.a, fgzk0, gfqx.a, gfqx.a, gfqx.a, false, false);
    }

    public dvob(haoz haoz0, byte[] arr_b, byte[] arr_b1, Set set0, fgzk fgzk0, gfsx gfsx0, gfsx gfsx1, gfsx gfsx2, boolean z, boolean z1) {
        gfsx gfsx3;
        if(haoz0 == null) {
            haoz0 = haoz.a;
        }
        this.b = haoz0;
        this.c = arr_b;
        this.d = arr_b1;
        this.e = set0;
        this.f = fgzk0;
        this.j = gfsx1;
        this.k = gfsx2;
        this.l = z;
        this.m = z1;
        if(gfsx0.i()) {
            fgwt fgwt0 = (fgwt)gfsx0.d();
            this.g = gfsx.m(Long.valueOf(fgwt0.a));
            dvoa dvoa0 = new dvoa();
            this.h = fgwt0.b.b(dvoa0);
            dvoa dvoa1 = new dvoa();
            gfsx3 = fgwt0.c.b(dvoa1);
        }
        else {
            gfsx3 = gfqx.a;
            this.g = gfsx3;
            this.h = gfsx3;
        }
        this.i = gfsx3;
    }
}

