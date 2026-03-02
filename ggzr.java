import java.util.ArrayList;
import java.util.List;

public final class ggzr {
    public ghde a;
    public ghcc b;
    public ggym c;
    public int d;
    public volatile boolean e;
    public volatile boolean f;
    public final boolean[] g;
    public final ghea h;
    public final ghea i;
    public final ghea j;
    public final ArrayList k;
    public final ArrayList l;
    public final List m;
    public final ggzp[] n;

    public ggzr() {
        this.a = null;
        this.b = null;
        this.e = false;
        this.f = false;
        this.g = new boolean[]{true, true, true};
        this.h = new ghea();
        this.i = new ghea();
        this.j = new ghea();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        ggzp[] arr_ggzp = new ggzp[3];
        this.n = arr_ggzp;
        arr_ggzp[0] = new ggzp();
        arr_ggzp[1] = new ggzp();
        arr_ggzp[2] = new ggzp();
    }

    public final ghbx a(ghdb ghdb0) {
        return (ghbx)this.a.c().get(ghdb0.e());
    }

    public final List b() {
        return new ghbz(this.b);
    }

    public final List c(int v) {
        for(Object object0: this.m) {
            ggzq ggzq0 = (ggzq)object0;
            if(ggzq0.a == v) {
                ggzp ggzp0 = ggzq0.b;
                int v1 = ggzp0.a;
                return v1 >= this.h.b ? ggna.a : new ggzo(this, v1, ggzp0.b);
            }
        }
        return ggna.a;
    }

    public final boolean d(int v) {
        gftb.checkTrue(v >= 0 && v <= 2);
        return this.g[v];
    }

    public final List e(int v) {
        ggzp[] arr_ggzp = this.n;
        int v1 = arr_ggzp[v].a;
        int v2 = 0;
        while(v <= 2) {
            v1 = Math.min(v1, arr_ggzp[v].a);
            v2 += arr_ggzp[v].b;
            ++v;
        }
        return v1 < this.h.b ? new ggzo(this, v1, v2) : ggna.a;
    }
}

