import android.util.Range;
import android.util.Size;
import java.util.List;
import java.util.Set;

public final class bkk implements bko, bnc, bql {
    private final blf E;
    public static final bjr a;
    public static final bjr b;
    public static final bjr c;
    public static final bjr d;
    public static final bjr e;
    public static final bjr f;
    public static final bjr g;
    public static final bjr h;
    public static final bjr i;
    public static final bjr j;
    public static final bjr k;

    static {
        bkk.a = new bjr("camerax.core.imageCapture.captureMode", Integer.TYPE, null);
        bkk.b = new bjr("camerax.core.imageCapture.flashMode", Integer.TYPE, null);
        bkk.c = new bjr("camerax.core.imageCapture.captureBundle", bjl.class, null);
        bkk.d = new bjr("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        bkk.e = new bjr("camerax.core.imageCapture.outputFormat", Integer.class, null);
        new bjr("camerax.core.imageCapture.maxCaptureStages", Integer.class, null);
        bkk.f = new bjr("camerax.core.imageCapture.imageReaderProxyProvider", bco.class, null);
        bkk.g = new bjr("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        bkk.h = new bjr("camerax.core.imageCapture.flashType", Integer.TYPE, null);
        new bjr("camerax.core.imageCapture.jpegCompressionQuality", Integer.TYPE, null);
        bkk.i = new bjr("camerax.core.imageCapture.screenFlash", bcc.class, null);
        bkk.j = new bjr("camerax.core.useCase.postviewResolutionSelector", btu.class, null);
        bkk.k = new bjr("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }

    public bkk(blf blf0) {
        this.E = blf0;
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

    public final int D() {
        return (int)(((Integer)blq.b(this, bkk.a)));
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
        return (int)(((Integer)blq.b(this, bkk.l)));
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
        return this.E;
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

