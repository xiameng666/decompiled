import android.util.Range;
import android.util.Size;
import java.util.List;
import java.util.Set;

public final class buf implements bko, bnc, bqv {
    public static final bjr a;
    public final blf b;

    static {
        buf.a = new bjr("camerax.core.streamSharing.captureTypes", List.class, null);
    }

    public buf(blf blf0) {
        this.b = blf0;
    }

    @Override  // bnc
    public final boolean A() {
        return bmz.n(this);
    }

    @Override  // bnc
    public final boolean B() {
        return bmz.o(this);
    }

    @Override  // bko
    public final int C() {
        return bkn.a(this);
    }

    @Override  // bko
    public final btu E() {
        return bkn.b(this);
    }

    @Override  // bko
    public final boolean F() {
        return bkn.d(this);
    }

    @Override  // bko
    public final int G() {
        return bkn.e(this);
    }

    @Override  // bko
    public final List I() {
        return bkn.f(this);
    }

    @Override  // bko
    public final Size J() {
        return bkn.g(this);
    }

    @Override  // bko
    public final Size K() {
        return bkn.h(this);
    }

    @Override  // bko
    public final int L() {
        return bkn.i(this);
    }

    @Override  // bko
    public final btu M() {
        return bkn.j(this);
    }

    @Override  // bko
    public final List N() {
        return bkn.k(this);
    }

    @Override  // bko
    public final Size O() {
        return bkn.l(this);
    }

    @Override  // bko
    public final int P() {
        return bkn.m(this);
    }

    @Override  // bkm
    public final int a() {
        return bkl.a(this);
    }

    @Override  // bnc
    public final int b() {
        return bmz.a(this);
    }

    @Override  // bnc
    public final int c() {
        return bmz.b(this);
    }

    @Override  // bnc
    public final Range d(Range range0) {
        return bmz.c(this, range0);
    }

    @Override  // bkm
    public final bat e() {
        return bkl.b(this);
    }

    @Override  // bnc
    public final bgy f() {
        return bmz.d(this);
    }

    @Override  // bjt
    public final bjs g(bjr bjr0) {
        return blq.a(this, bjr0);
    }

    @Override  // blr
    public final bjt h() {
        return this.b;
    }

    @Override  // bnc
    public final bmb i() {
        return bmz.e(this);
    }

    @Override  // bnc
    public final bmj j() {
        return bmz.f(this);
    }

    @Override  // bnc
    public final bne k() {
        return bmz.g(this);
    }

    @Override  // blr
    public final Object l(bjr bjr0) {
        return blq.b(this, bjr0);
    }

    @Override  // blr
    public final Object m(bjr bjr0, Object object0) {
        return blq.c(this, bjr0, object0);
    }

    @Override  // bjt
    public final Object n(bjr bjr0, bjs bjs0) {
        return blq.d(this, bjr0, bjs0);
    }

    @Override  // bqt
    public final String o() {
        return bqs.a(this);
    }

    @Override  // bqt
    public final String p(String s) {
        return bqs.b(this, s);
    }

    @Override  // bjt
    public final Set q(bjr bjr0) {
        return blq.e(this, bjr0);
    }

    @Override  // blr
    public final Set r() {
        return blq.f(this);
    }

    @Override  // blr
    public final boolean s(bjr bjr0) {
        return blq.g(this, bjr0);
    }

    @Override  // bnc
    public final boolean t() {
        return bmz.h(this);
    }

    @Override  // bnc
    public final boolean u() {
        return bmz.i(this);
    }

    @Override  // bjt
    public final void v(azg azg0) {
        blq.h(this, azg0);
    }

    @Override  // bnc
    public final bmb w() {
        return bmz.j(this);
    }

    @Override  // bnc
    public final blw x() {
        return bmz.k(this);
    }

    @Override  // bnc
    public final int y() {
        return bmz.l(this);
    }

    @Override  // bnc
    public final int z() {
        return bmz.m(this);
    }
}

