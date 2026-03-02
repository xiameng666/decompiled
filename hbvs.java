import android.os.SystemClock;
import com.google.android.gms.common.Feature;

public final class hbvs implements azty {
    public static boolean a;
    public static int b;
    public final hbvr c;
    public final Feature[] d;
    public final hbjm e;
    public final hbqy f;
    private final hbra g;

    static {
    }

    public hbvs(hbvr hbvr0) {
        hbqy hbqy0 = hbri.b("play-services-mlkit-document-scanner");
        hbra hbra0 = new hbra(hawd.b().a());
        super();
        this.c = hbvr0;
        hbjj hbjj0 = new hbjj();
        hbjj0.b = hbvw.a(1);
        Boolean boolean0 = Boolean.valueOf(true);
        hbjj0.c = boolean0;
        hbjj0.d = boolean0;
        hbjj0.l = (int)hbvr0.e;
        hbjj0.k = Boolean.valueOf(hbvr0.h);
        hbjj0.m = Boolean.valueOf(hbvr0.d);
        hbjj0.f = Boolean.valueOf(hbvr0.i);
        hbjj0.i = Boolean.valueOf(hbvr0.j);
        hbjj0.j = Boolean.valueOf(hbvr0.k);
        hbjj0.n = Boolean.valueOf(hbvr0.l);
        hbjj0.o = Boolean.valueOf(hbvr0.m);
        ggdy ggdy0 = new ggdy();
        int[] arr_v = hbvr0.f;
        for(int v = 0; v < arr_v.length; ++v) {
            ggdy0.i(hbvw.b(arr_v[v]));
        }
        hbjj0.g = ggdy0.h();
        hbjj0.h = Boolean.valueOf(false);
        this.e = new hbjm(hbjj0);
        this.g = hbra0;
        this.f = hbqy0;
        ggdy ggdy1 = new ggdy();
        ggdy1.i(hawq.t);
        if(hbvr0.j) {
            ggdy1.i(hawq.v);
        }
        if(hbvr0.k) {
            ggdy1.i(hawq.u);
        }
        this.d = (Feature[])ggdy1.h().toArray(new Feature[0]);
    }

    public final void a(hbkn hbkn0, long v, long v1) {
        long v2 = SystemClock.elapsedRealtime();
        hbkp hbkp0 = new hbkp();
        hbme hbme0 = new hbme();
        hbme0.a(Long.valueOf(v2 - v));
        hbme0.b = hbkn0;
        hbme0.c = this.e;
        hbkp0.r = new hbmf(hbme0);
        hbrb hbrb0 = new hbrb(hbkp0, 0);
        this.f.e(hbrb0, hbko.ep);
        this.g.a(0x5F0F, hbkn0.aH, v1, System.currentTimeMillis());
    }

    @Override  // azty
    public final Feature[] gm() {
        return this.d;
    }
}

