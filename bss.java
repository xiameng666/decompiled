import android.graphics.Matrix;
import android.graphics.Rect;
import j..util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public final class bss {
    public final int a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final bmi g;
    public int h;
    public int i;
    public bsr j;
    public boolean k;
    public final List l;
    private boolean m;
    private bel n;
    private final Set o;

    public bss(int v, int v1, bmi bmi0, Matrix matrix0, boolean z, Rect rect0, int v2, int v3, boolean z1) {
        this.m = false;
        this.o = new HashSet();
        this.k = false;
        this.l = new ArrayList();
        this.f = v;
        this.a = v1;
        this.g = bmi0;
        this.b = matrix0;
        this.c = z;
        this.d = rect0;
        this.i = v2;
        this.h = v3;
        this.e = z1;
        this.j = new bsr(bmi0.b, v1);
    }

    public final bel a(bin bin0) {
        return this.b(bin0, true);
    }

    public final bel b(bin bin0, boolean z) {
        boj.b();
        this.f();
        bsi bsi0 = new bsi(this);
        bel bel0 = new bel(this.g.b, bin0, z, this.g.d, bsi0);
        try {
            bka bka0 = bel0.g;
            bsr bsr0 = this.j;
            Objects.requireNonNull(bsr0);
            if(bsr0.i(bka0, new bsj(bsr0))) {
                gmcd gmcd0 = bsr0.c();
                Objects.requireNonNull(bka0);
                gmcd0.hB(new bsk(bka0), bol.a());
            }
        }
        catch(bjy bjy0) {
            throw new AssertionError("Surface is somehow already closed", bjy0);
        }
        catch(RuntimeException runtimeException0) {
            bel0.f();
            throw runtimeException0;
        }
        this.n = bel0;
        this.j();
        return bel0;
    }

    public final gmcd c(int v, bdq bdq0, bdq bdq1) {
        boj.b();
        this.f();
        this.e();
        bsr bsr0 = this.j;
        return bpt.g(bsr0.b(), new bsh(this, bsr0, v, bdq0, bdq1), bow.a());
    }

    public final void d(Runnable runnable0) {
        boj.b();
        this.f();
        this.o.add(runnable0);
    }

    public final void e() {
        kay.d(((boolean)(this.m ^ 1)), "Consumer can only be linked once.");
        this.m = true;
    }

    public final void f() {
        kay.d(((boolean)(this.k ^ 1)), "Edge is already closed.");
    }

    public final void g() {
        boj.b();
        this.j.d();
        this.k = true;
        this.l.clear();
        this.o.clear();
    }

    public final void h() {
        boj.b();
        this.f();
        this.j.d();
    }

    public final void i() {
        boj.b();
        this.f();
        bsr bsr0 = this.j;
        boj.b();
        if(bsr0.p != null || bsr0.h()) {
            this.m = false;
            this.j.d();
            this.j = new bsr(this.g.b, this.a);
            for(Object object0: this.o) {
                ((Runnable)object0).run();
            }
        }
    }

    public final void j() {
        Executor executor0;
        bek bek0;
        boj.b();
        bej bej0 = new bej(this.d, this.i, this.h, this.c, this.b, this.e);
        bel bel0 = this.n;
        if(bel0 != null) {
            synchronized(bel0.a) {
                bel0.h = bej0;
                bek0 = bel0.i;
                executor0 = bel0.j;
            }
            if(bek0 != null && executor0 != null) {
                executor0.execute(new bds(bek0, bej0));
            }
        }
        for(Object object0: this.l) {
            ((kar)object0).accept(bej0);
        }
    }

    public final void k(int v, int v1) {
        boj.c(new bsl(this, v, v1));
    }
}

