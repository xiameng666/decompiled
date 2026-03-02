import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class bntk implements bnzh {
    public final bpuq a;
    public final Executor b;
    public final frli c;
    public static final int d;

    static {
        bboh.b("GmsSpotOwnerKeyProvider", bbcu.eD);
    }

    public bntk(frli frli0, bpuq bpuq0, Executor executor0) {
        this.c = frli0;
        this.a = bpuq0;
        this.b = executor0;
    }

    @Override  // fqwk
    public final gmcd a() {
        return gdtf.j(this.c.a(), new bntd(), gmap.a);
    }

    @Override  // fqwk
    public final gmcd b() {
        return gdta.g(this.a()).h(new fqwj(), gmap.a);
    }

    @Override  // fqwk
    public final gmcd c(fqzn fqzn0) {
        gftb.check(fqzn0);
        gftb.checkTrue(((boolean)(fqzn0.c.isEmpty() ^ 1)));
        boolean z = false;
        gftb.checkTrue(((boolean)(((fqzn0.b & 2) == 0 ? 0 : 1) ^ 1)));
        if(fqzn0.e > 0) {
            z = true;
        }
        gftb.checkTrue(z);
        return gdta.g(this.d(fqzn0, true)).h(new bntj(), gmap.a);
    }

    public final gmcd d(fqzn fqzn0, boolean z) {
        AtomicReference atomicReference0 = new AtomicReference(fqzn0);
        bnte bnte0 = new bnte(fqzn0, z, atomicReference0);
        return gdta.g(this.c.b(bnte0, gmap.a)).i(new bntf(this), this.b).h(new bntg(atomicReference0), gmap.a);
    }
}

