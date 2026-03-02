import j..util.Objects;
import java.io.File;
import java.util.Map;

final class fvrh implements fvlt {
    final fvri a;
    public int b;
    private File c;

    public fvrh(fvri fvri0) {
        Objects.requireNonNull(fvri0);
        this.a = fvri0;
        super();
    }

    @Override  // fvlt
    public final void b() {
        fvri fvri0 = this.a;
        if(fvri0.u()) {
            fvnb fvnb0 = fvri0.o;
            if(fvnb0 != null) {
                fvnb0.a();
            }
        }
    }

    @Override  // fvlt
    public final void c() {
        fvri fvri0 = this.a;
        if(fvri0.u()) {
            fvnb fvnb0 = fvri0.o;
            if(fvnb0 != null) {
                fvnb0.c();
            }
        }
    }

    @Override  // fvlt
    public final void d(String s) {
        fvri fvri0 = this.a;
        if(!fvri0.u()) {
            return;
        }
        gftb.q(fvri0.o != null && fvri0.n != -1L);
        fvqk.a(fvri0.b.mH(), false);
        fvri.G(fvri0, fvri0.n, -1L, fvri0.c.b(), 29, this.b);
    }

    @Override  // fvlt
    public final void e(int v, String s) {
        if(this.c == null) {
            this.c = (huqs.c() ? new File(ccsb.a.a(s)) : new File(s)).getParentFile();
        }
    }

    @Override  // fvlt
    public final void f(int v, String s, String s1) {
        fvri fvri0 = this.a;
        if(fvri0.u()) {
            fvnb fvnb0 = fvri0.o;
            if(fvnb0 != null) {
                fvnb0.c();
            }
        }
    }

    @Override  // fvlt
    public final void g(gwvi gwvi0) {
    }

    @Override  // fvlt
    public final void h(int v, gwvi gwvi0) {
    }

    @Override  // fvlt
    public final void i() {
    }

    @Override  // fvlt
    public final void j(fvob fvob0) {
        int v = 1;
        fvri fvri0 = this.a;
        if(fvri0.o != null && fvri0.u()) {
            gftb.q(Long.compare(fvri0.n, -1L) != 0);
            long v1 = fvri0.c.b();
            if(fvob0 != null && fvob0.a() == 0) {
                v = 3;
            }
            else if(fvri0.p) {
                v = fvri0.q;
            }
            fvqk.a(fvri0.b.mH(), false);
            fvri.G(fvri0, fvri0.n, fvri0.n, v1, v, this.b);
            return;
        }
        File file0 = this.c;
        if(file0 != null) {
            fyba.c(file0);
        }
    }

    @Override  // fvlt
    public final void k(Map map0) {
    }
}

