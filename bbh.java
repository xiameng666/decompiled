import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class bbh extends ben {
    public final Object a;
    public bbk b;
    public Executor c;
    public bbc d;
    blt e;
    public static final int f;
    private Rect o;
    private Matrix p;
    private bka q;
    private blu r;

    static {
    }

    public bbh(bkj bkj0) {
        super(bkj0);
        this.a = new Object();
    }

    public final int a() {
        return (int)(((Integer)blq.c(((bkj)this.i), bkj.d, Integer.valueOf(1))));
    }

    @Override  // ben
    public final bmi b(bjt bjt0) {
        this.e.h(bjt0);
        this.P(bax.a(this.e.a()));
        bmh bmh0 = new bmh(this.j);
        bmh0.b = bjt0;
        return bmh0.a();
    }

    @Override  // ben
    public final bnb c(bjt bjt0) {
        return bbe.a(bjt0);
    }

    @Override  // ben
    public final bnc d(boolean z, bng bng0) {
        bkj bkj0 = bbf.a;
        bjt bjt0 = bng0.a(bmz.g(bkj0), 1);
        if(z) {
            bjt0 = bjq.a(bjt0, bkj0);
        }
        return bjt0 == null ? null : bbe.a(bjt0).c();
    }

    @Override  // ben
    protected final bnc e(bik bik0, bnb bnb0) {
        synchronized(this.a) {
        }
        return bnb0.d();
    }

    public final Boolean f() {
        return (Boolean)blq.c(((bkj)this.i), bkj.e, null);
    }

    final void g() {
        boj.b();
        blu blu0 = this.r;
        if(blu0 != null) {
            blu0.b();
            this.r = null;
        }
        bka bka0 = this.q;
        if(bka0 != null) {
            bka0.d();
            this.q = null;
        }
    }

    @Override  // ben
    public final void h() {
        this.g();
        synchronized(this.a) {
            this.b.m = false;
            this.b.d();
            this.b = null;
        }
    }

    public final void i(Executor executor0, bbc bbc0) {
        synchronized(this.a) {
            bbk bbk0 = this.b;
            if(bbk0 != null) {
                bbk0.f(executor0, new bba(bbc0));
            }
            if(this.d == null) {
                this.I();
            }
            this.c = executor0;
            this.d = bbc0;
        }
    }

    @Override  // ben
    public final void j(Matrix matrix0) {
        super.j(matrix0);
        synchronized(this.a) {
            bbk bbk0 = this.b;
            if(bbk0 != null) {
                bbk0.g(matrix0);
            }
            this.p = matrix0;
        }
    }

    @Override  // ben
    public final void k(Rect rect0) {
        this.k = rect0;
        synchronized(this.a) {
            bbk bbk0 = this.b;
            if(bbk0 != null) {
                bbk0.h(rect0);
            }
            this.o = rect0;
        }
    }

    public final boolean l() {
        return ((Boolean)blq.c(((bkj)this.i), bkj.f, Boolean.valueOf(false))).booleanValue();
    }

    final blt m(bkj bkj0, bmi bmi0) {
        boolean z2;
        bbk bbk4;
        bdm bdm0;
        boj.b();
        Executor executor0 = bqu.a(bkj0, bot.a());
        kay.i(executor0);
        boolean z = true;
        int v = ((bkj)this.i).H() == 1 ? ((int)(((Integer)blq.c(((bkj)this.i), bkj.b, Integer.valueOf(6))))) : 4;
        Size size0 = bmi0.b;
        if(bkj0.D() == null) {
            bdm0 = new bdm(bcp.a(size0.getWidth(), size0.getHeight(), this.v(), v));
        }
        else {
            bco bco0 = bkj0.D();
            size0.getWidth();
            size0.getHeight();
            this.v();
            bdm0 = new bdm(bco0.a());
        }
        Object object0 = this.a;
        synchronized(object0) {
            __monitor_enter(object0);
        }
        try {
            bkj bkj1 = (bkj)this.i;
            this.b = bkj1.H() == 1 ? new bbm() : new bbr(bqu.a(bkj1, bot.a()));
            bbk bbk0 = this.b;
            bbk0.b = this.a();
            bbk bbk1 = this.b;
            bbk1.c = this.l();
            bin bin0 = this.C();
            Boolean boolean0 = this.f();
            boolean z1 = bin0 == null ? false : bin0.e().g().c(OnePixelShiftQuirk.class);
            bbk bbk2 = this.b;
            if(boolean0 != null) {
                z1 = boolean0.booleanValue();
            }
            bbk2.d = z1;
            if(bin0 != null) {
                bbk bbk3 = this.b;
                bbk3.a = this.x(bin0);
            }
            Rect rect0 = this.o;
            if(rect0 != null) {
                this.b.h(rect0);
            }
            Matrix matrix0 = this.p;
            if(matrix0 != null) {
                this.b.g(matrix0);
            }
            Executor executor1 = this.c;
            if(executor1 != null) {
                bbc bbc0 = this.d;
                if(bbc0 != null) {
                    this.b.f(executor1, bbc0);
                }
            }
        }
        catch(Throwable throwable1) {
            try {
                __monitor_exit(object0);
                throw throwable1;
            }
            catch(Throwable throwable0) {
                __monitor_exit(object0);
                throw throwable0;
            }
        }
        __monitor_exit(object0);
        try {
            bbk4 = this.b;
        }
        catch(Throwable throwable0) {
            __monitor_exit(object0);
            throw throwable0;
        }
        __monitor_exit(object0);
        if(this.C() == null) {
            z2 = false;
        }
        else {
            bin bin1 = this.C();
            z2 = this.l() && this.x(bin1) % 180 != 0;
        }
        int v1 = z2 ? size0.getHeight() : size0.getWidth();
        int v2 = z2 ? size0.getWidth() : size0.getHeight();
        int v3 = this.a() == 2 ? 1 : 35;
        boolean z3 = this.v() == 35 && this.a() == 2;
        boolean z4 = this.v() == 35 && this.a() == 3;
        if(this.v() != 35 || (this.C() == null || this.x(this.C()) == 0) && !Boolean.TRUE.equals(this.f())) {
            z = false;
        }
        bdm bdm1 = !z3 && (!z || z4) ? null : new bdm(bcp.a(v1, v2, v3, bdm0.c()));
        if(bdm1 != null) {
            synchronized(bbk4.l) {
                bbk4.e = bdm1;
            }
        }
        synchronized(this.a) {
            bin bin2 = this.C();
            if(bin2 != null) {
                bbk bbk5 = this.b;
                bbk5.a = this.x(bin2);
            }
        }
        bdm0.j(bbk4, executor0);
        blt blt0 = blt.b(bkj0, bmi0.b);
        bjt bjt0 = bmi0.g;
        if(bjt0 != null) {
            blt0.h(bjt0);
        }
        bka bka0 = this.q;
        if(bka0 != null) {
            bka0.d();
        }
        bkr bkr0 = new bkr(bdm0.e(), size0, this.v());
        this.q = bkr0;
        bkr0.c().hB(new bay(bdm0, bdm1), bow.a());
        blt0.h = bmi0.e;
        this.T(blt0, bmi0);
        blt0.m(this.q, bmi0.d, -1);
        blu blu0 = this.r;
        if(blu0 != null) {
            blu0.b();
        }
        blu blu1 = new blu(new baz(this, bbk4));
        this.r = blu1;
        blt0.f = blu1;
        return blt0;
    }

    @Override  // ben
    protected final void n(bmi bmi0, bmi bmi1) {
        Objects.toString(bmi0);
        bcs.h("ImageAnalysis");
        bkj bkj0 = (bkj)this.i;
        this.F();
        blt blt0 = this.m(bkj0, bmi0);
        this.e = blt0;
        this.P(bax.a(blt0.a()));
    }

    @Override
    public final String toString() {
        return "ImageAnalysis:" + this.G();
    }
}

