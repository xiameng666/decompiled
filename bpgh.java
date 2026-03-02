import java.util.concurrent.atomic.AtomicReference;

public final class bpgh implements bnzi {
    public final gtas a;
    public final AtomicReference b;

    public bpgh(gtas gtas0, AtomicReference atomicReference0) {
        this.a = gtas0;
        this.b = atomicReference0;
    }

    @Override  // bnzi
    public final gmcd a(bntw bntw0, bnvk bnvk0) {
        boolean z = bntw0.b().equals(bnxi.a);
        gtas gtas0 = this.a;
        if(z && bouv.b(gtas0)) {
            gtas gtas1 = gtas0.equals(gtas.e) ? gtas.c : gtas.b;
            this.b.set(gtas1);
            return gmbu.i(gfsx.m(((gtas)this.b.get())));
        }
        return gmbu.i(gfsx.m(gtas0));
    }
}

