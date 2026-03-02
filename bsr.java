import android.util.Size;
import j..util.Objects;

public final class bsr extends bka {
    final gmcd a;
    jqt o;
    public bka p;
    public bsv q;

    public bsr(Size size0, int v) {
        super(size0, v);
        this.a = jqy.a(new bsq(this));
    }

    @Override  // bka
    protected final gmcd a() {
        return this.a;
    }

    @Override  // bka
    public final void d() {
        super.d();
        boj.c(new bso(this));
    }

    public final boolean i(bka bka0, Runnable runnable0) {
        boj.b();
        kay.i(bka0);
        bka bka1 = this.p;
        boolean z = false;
        if(bka1 == bka0) {
            return false;
        }
        kay.d(bka1 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
        kay.b(this.l.equals(bka0.l), String.format("The provider\'s size(%s) must match the parent(%s)", this.l, bka0.l));
        int v = this.m;
        int v1 = bka0.m;
        if(v == v1) {
            z = true;
        }
        kay.b(z, String.format("The provider\'s format(%s) must match the parent(%s)", v, v1));
        kay.d(((boolean)(this.h() ^ 1)), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
        this.p = bka0;
        bpt.k(bka0.b(), this.o);
        bka0.f();
        gmcd gmcd0 = this.c();
        Objects.requireNonNull(bka0);
        gmcd0.hB(new bsp(bka0), bol.a());
        bpt.d(bka0.k).hB(runnable0, bow.a());
        return true;
    }
}

