import android.graphics.Matrix;
import android.graphics.Rect;
import j..util.Objects;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

public final class bdf extends ben {
    public bss a;
    bel b;
    blt c;
    public static final int d;
    private static final Executor e;
    private bde f;
    private Executor o;
    private bka p;
    private blu q;

    static {
        bdf.e = bow.a();
    }

    public bdf(bli bli0) {
        super(bli0);
        this.o = bdf.e;
    }

    @Override  // ben
    public final Set Z() {
        Set set0 = new HashSet();
        set0.add(Integer.valueOf(1));
        return set0;
    }

    public final void a(bde bde0) {
        Executor executor0 = bdf.e;
        boj.b();
        if(bde0 == null) {
            this.f = null;
            this.J();
            return;
        }
        this.f = bde0;
        this.o = executor0;
        if(this.A() != null) {
            this.f(((bli)this.i), this.j);
            this.K();
        }
        this.I();
    }

    @Override  // ben
    public final bmi b(bjt bjt0) {
        this.c.h(bjt0);
        this.P(bcy.a(this.c.a()));
        bmh bmh0 = new bmh(this.j);
        bmh0.b = bjt0;
        return bmh0.a();
    }

    @Override  // ben
    public final bnb c(bjt bjt0) {
        return bdc.a(bjt0);
    }

    @Override  // ben
    public final bnc d(boolean z, bng bng0) {
        bli bli0 = bdd.a;
        bjt bjt0 = bng0.a(bmz.g(bli0), 1);
        if(z) {
            bjt0 = bjq.a(bjt0, bli0);
        }
        return bjt0 == null ? null : bdc.a(bjt0).c();
    }

    @Override  // ben
    protected final bnc e(bik bik0, bnb bnb0) {
        bnb0.f().c(bkm.l, Integer.valueOf(34));
        return bnb0.d();
    }

    public final void f(bli bli0, bmi bmi0) {
        boj.b();
        bin bin0 = (bin)Objects.requireNonNull(this.C());
        this.i();
        kay.c(this.a == null);
        Matrix matrix0 = this.l;
        boolean z = bin0.F();
        Rect rect0 = this.k;
        if(rect0 == null) {
            rect0 = bmi0.b == null ? null : new Rect(0, 0, bmi0.b.getWidth(), bmi0.b.getHeight());
        }
        bss bss0 = new bss(1, 34, bmi0, matrix0, z, ((Rect)Objects.requireNonNull(rect0)), this.y(bin0, this.S(bin0)), this.u(), bin0.F() && this.S(bin0));
        this.a = bss0;
        bss0.d(new bda(this));
        bel bel0 = this.a.a(bin0);
        this.b = bel0;
        this.p = bel0.g;
        if(this.f != null) {
            this.p();
            bde bde0 = this.f;
            kay.i(bde0);
            bel bel1 = this.b;
            kay.i(bel1);
            this.o.execute(new bcz(bde0, bel1));
        }
        blt blt0 = blt.b(bli0, bmi0.b);
        blt0.h = bmi0.e;
        this.T(blt0, bmi0);
        blt0.p(bmz.a(bli0));
        bjt bjt0 = bmi0.g;
        if(bjt0 != null) {
            blt0.h(bjt0);
        }
        if(this.f != null) {
            bka bka0 = this.p;
            int v = this.w();
            blt0.m(bka0, bmi0.d, v);
        }
        blu blu0 = this.q;
        if(blu0 != null) {
            blu0.b();
        }
        blu blu1 = new blu(new bdb(this));
        this.q = blu1;
        blt0.f = blu1;
        this.c = blt0;
        this.P(bcy.a(blt0.a()));
    }

    @Override  // ben
    public final void h() {
        this.i();
    }

    private final void i() {
        blu blu0 = this.q;
        if(blu0 != null) {
            blu0.b();
            this.q = null;
        }
        bka bka0 = this.p;
        if(bka0 != null) {
            bka0.d();
            this.p = null;
        }
        bss bss0 = this.a;
        if(bss0 != null) {
            bss0.g();
            this.a = null;
        }
        bel bel0 = this.b;
        if(bel0 != null) {
            bel0.b();
        }
        this.b = null;
    }

    @Override  // ben
    public final void k(Rect rect0) {
        this.k = rect0;
        this.p();
    }

    @Override  // ben
    protected final void n(bmi bmi0, bmi bmi1) {
        java.util.Objects.toString(bmi0);
        bcs.h("Preview");
        this.f(((bli)this.i), bmi0);
    }

    private final void p() {
        bin bin0 = this.C();
        bss bss0 = this.a;
        if(bin0 != null && bss0 != null) {
            bss0.k(this.y(bin0, this.S(bin0)), this.u());
        }
    }

    @Override
    public final String toString() {
        return "Preview:" + this.G();
    }
}

