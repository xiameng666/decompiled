import java.io.PrintWriter;
import java.util.ArrayList;

public final class fvqx extends fvqd {
    fvqd k;
    private final fvqd[] l;
    private final fvkc m;
    private final fvtk n;

    public fvqx(fwze fwze0, fwyd fwyd0, fwyy fwyy0, fwzp fwzp0, fvkc fvkc0, fvqn fvqn0, fxzs fxzs0, fvrf fvrf0, fvrj fvrj0, fvtk fvtk0, fwxs fwxs0) {
        super("NetworkCollector", fwze0, fwyd0, fwzp0, fvrj0, fxzs0, new fvqa(fvkc0), 1);
        this.m = fvkc0;
        this.n = fvtk0;
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(new fvqr(fwze0, fwyd0, fwzp0, fvrj0, fxzs0, this.h, fvqn0, fvrf0));
        arrayList0.add(new fvqh(fwze0, fwyd0, fwyy0, fwzp0, fvrj0, fxzs0, this.h, fwxs0));
        arrayList0.add(new fvri(fwze0, fwyd0, fwzp0, fvrj0, fxzs0, this.h, fvqn0, fvrf0, fwxs0, new fvre(fvrf.a, fwyd0, fvqn0)));
        arrayList0.add(new fvra(fwze0, fwyd0, fwzp0, fvrj0, fwxs0, fxzs0, this.h));
        fvqd[] arr_fvqd = (fvqd[])arrayList0.toArray(new fvqd[0]);
        this.l = arr_fvqd;
        this.k = arr_fvqd[0];
    }

    @Override  // fvqd
    public final void D(Object object0) {
        fvqd[] arr_fvqd = this.l;
        for(int v = 0; v < arr_fvqd.length; ++v) {
            arr_fvqd[v].D(object0);
        }
        this.o();
    }

    private final void E(fvqd fvqd0) {
        fvqd fvqd1 = this.k;
        if(fvqd1 != fvqd0) {
            fvqd1.getClass();
            fvqd0.getClass();
        }
    }

    @Override  // fvqd
    public final int a() {
        return 2;
    }

    @Override  // fvqd
    public final void b(fwzf fwzf0) {
        fvqd[] arr_fvqd = this.l;
        for(int v = 0; v < arr_fvqd.length; ++v) {
            arr_fvqd[v].b(fwzf0);
        }
        this.o();
    }

    @Override  // fvqd
    public final void c(int v, int v1, boolean z) {
        fvqd[] arr_fvqd = this.l;
        for(int v2 = 0; v2 < arr_fvqd.length; ++v2) {
            arr_fvqd[v2].c(v, v1, z);
        }
        this.o();
    }

    @Override  // fvqd
    public final void d(fvtm fvtm0) {
        if(this.n.e()) {
            fvqd[] arr_fvqd = this.l;
            for(int v = 0; v < arr_fvqd.length; ++v) {
                arr_fvqd[v].d(fvtm0);
            }
            this.o();
        }
    }

    @Override  // fvqd
    public final void e(PrintWriter printWriter0) {
        fvqd[] arr_fvqd = this.l;
        for(int v = 0; v < arr_fvqd.length; ++v) {
            arr_fvqd[v].e(printWriter0);
        }
    }

    @Override  // fvqd
    public final void f(boolean z) {
        fvqd[] arr_fvqd = this.l;
        for(int v = 0; v < arr_fvqd.length; ++v) {
            arr_fvqd[v].f(z);
        }
        this.o();
    }

    @Override  // fvqd
    public final void g(fuxg fuxg0) {
        fvqd[] arr_fvqd = this.l;
        for(int v = 0; v < arr_fvqd.length; ++v) {
            arr_fvqd[v].g(fuxg0);
        }
        this.o();
    }

    @Override  // fvqd
    public final void h(boolean z) {
        fvqd[] arr_fvqd = this.l;
        for(int v = 0; v < arr_fvqd.length; ++v) {
            arr_fvqd[v].h(z);
        }
        this.o();
    }

    @Override  // fvqd
    public final void i(long v) {
        fvqd[] arr_fvqd = this.l;
        for(int v1 = 0; v1 < arr_fvqd.length; ++v1) {
            arr_fvqd[v1].i(v);
        }
        this.o();
    }

    @Override  // fvqd
    public final void j(boolean z) {
        fvqi.a = z;
        fvqd[] arr_fvqd = this.l;
        for(int v = 0; v < arr_fvqd.length; ++v) {
            arr_fvqd[v].j(z);
        }
        this.o();
    }

    @Override  // fvqd
    public final void k() {
        fvqd[] arr_fvqd = this.l;
        for(int v = 0; v < arr_fvqd.length; ++v) {
            arr_fvqd[v].k();
        }
        this.o();
    }

    @Override  // fvqd
    public final void l() {
        fvqd[] arr_fvqd = this.l;
        for(int v = 0; v < arr_fvqd.length; ++v) {
            arr_fvqd[v].l();
        }
        this.o();
    }

    @Override  // fvqd
    public final void m(boolean z) {
        fvqd[] arr_fvqd = this.l;
        for(int v = 0; v < arr_fvqd.length; ++v) {
            arr_fvqd[v].m(z);
        }
        this.o();
    }

    @Override  // fvqd
    public final void n(fvpz fvpz0) {
        this.i = fvpz0;
        fvqd[] arr_fvqd = this.l;
        for(int v = 0; v < arr_fvqd.length; ++v) {
            arr_fvqd[v].n(new fvqw(this, fvpz0));
        }
    }

    @Override  // fvqd
    public final void o() {
        this.k.o();
        if(this.k.v()) {
            fvqd[] arr_fvqd = this.l;
            int v = 0;
            while(v < arr_fvqd.length) {
                fvqd fvqd0 = arr_fvqd[v];
                if(fvqd0 == this.k) {
                    ++v;
                    continue;
                }
                else {
                    fvqd0.o();
                    if(fvqd0.v()) {
                        ++v;
                        continue;
                    }
                    else {
                        this.E(fvqd0);
                        this.k = fvqd0;
                    }
                }
                break;
            }
            if(this.k != arr_fvqd[0] && this.k.v()) {
                this.E(arr_fvqd[0]);
                this.k = arr_fvqd[0];
            }
        }
    }

    @Override  // fvqd
    public final void p(fvvj fvvj0) {
        if(fvvj0 != null) {
            fvkc fvkc0 = this.m;
            long v1 = fvkc0.b.b();
            for(int v2 = 0; v2 < fvvj0.d(); ++v2) {
                fvkc0.a(fvvj0.l(v2), v1);
            }
        }
        fvqd[] arr_fvqd = this.l;
        for(int v = 0; v < arr_fvqd.length; ++v) {
            arr_fvqd[v].p(fvvj0);
        }
        this.o();
    }

    @Override  // fvqd
    public final void q(boolean z) {
        fvqd[] arr_fvqd = this.l;
        for(int v = 0; v < arr_fvqd.length; ++v) {
            arr_fvqd[v].q(z);
        }
        this.o();
    }

    @Override  // fvqd
    public final boolean v() {
        return this.k.v();
    }

    @Override  // fvqd
    public final void w(cjds cjds0) {
        fvqd[] arr_fvqd = this.l;
        for(int v = 0; v < arr_fvqd.length; ++v) {
            arr_fvqd[v].w(cjds0);
        }
        this.o();
    }
}

