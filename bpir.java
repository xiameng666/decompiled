import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class bpir implements bpim {
    public static final bboh a;
    public static final ggeo b;
    public final bnnl c;
    public final fgvt d;
    private final fqxe e;
    private final Executor f;

    static {
        bpir.a = bboh.b("SelfProvisStateReporter", bbcu.eD);
        ggek ggek0 = new ggek();
        Integer integer0 = (int)1;
        ggek0.i(fqyi.p, integer0);
        ggek0.i(fqyi.q, integer0);
        ggek0.i(fqyi.W, integer0);
        ggek0.i(fqyi.X, integer0);
        Integer integer1 = (int)2;
        ggek0.i(fqyi.r, integer1);
        ggek0.i(fqyi.s, integer1);
        Integer integer2 = (int)3;
        ggek0.i(fqyi.x, integer2);
        ggek0.i(fqyi.y, integer2);
        ggek0.i(fqyi.B, integer2);
        ggek0.i(fqyi.C, integer2);
        ggek0.i(fqyi.D, integer2);
        ggek0.i(fqyi.E, integer2);
        ggek0.i(fqyi.F, integer2);
        ggek0.i(fqyi.G, integer2);
        bpir.b = ggek0.b();
    }

    public bpir(fqxe fqxe0, bnnl bnnl0, fgvt fgvt0, Executor executor0) {
        this.e = fqxe0;
        this.c = bnnl0;
        this.d = fgvt0;
        this.f = executor0;
    }

    @Override  // bpim
    public final gmcd a(fqyi fqyi0) {
        return this.b(fqyi0, true);
    }

    public final gmcd b(fqyi fqyi0, boolean z) {
        AtomicReference atomicReference0 = new AtomicReference(fqyi.a);
        bpio bpio0 = new bpio(this, atomicReference0, z, fqyi0);
        gdta gdta0 = gdta.g(this.e.n(bpio0)).i(new bpip(this, atomicReference0, fqyi0), this.f);
        bpiq bpiq0 = new bpiq(fqyi0);
        return gdta0.e(Throwable.class, bpiq0, gmap.a);
    }
}

