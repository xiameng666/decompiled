import android.util.Range;
import java.util.Set;
import java.util.UUID;

final class aup implements bnc {
    private final bjt a;

    public aup() {
        blb blb0 = blb.a();
        asp asp0 = new asp();
        blb0.c(bnc.q, asp0);
        blb0.c(aup.l, Integer.valueOf(34));
        blb0.c(aup.D, auq.class);
        blb0.c(aup.n, auq.class.getCanonicalName() + "-" + UUID.randomUUID());
        this.a = blb0;
    }

    @Override  // bnc
    public final boolean A() {
        return bmz.n(this);
    }

    @Override  // bnc
    public final boolean B() {
        return bmz.o(this);
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
        return this.a;
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
        return bne.f;
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

