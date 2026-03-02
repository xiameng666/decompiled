import java.util.concurrent.atomic.AtomicReference;

public final class boxv implements gfsi {
    public final AtomicReference a;
    public final boolean b;
    public final int c;
    public final int d;

    public boxv(AtomicReference atomicReference0, int v, boolean z, int v1) {
        this.a = atomicReference0;
        this.c = v;
        this.b = z;
        this.d = v1;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Void void0 = (Void)object0;
        gftb.check(((boxy)this.a.get()));
        boxy boxy0 = (boxy)this.a.get();
        gfsx gfsx0 = boxy0.b;
        if(gfsx0.i()) {
            Object object1 = gfsx0.d();
            ggtj ggtj0 = (ggtj)((ggtj)boxz.b.h()).ar(4821);
            int v = fqyo.a(((fqyp)object1).e);
            int v1 = 1;
            if(v == 0) {
                v = 1;
            }
            ggtj0.z("Reporting last Keychain maintenance user engagement event %d as cancelled.", v - 1);
            boolean z = ((fqyp)object1).h;
            int v2 = fqyo.a(((fqyp)object1).e) == 4 ? 10 : 9;
            int v3 = fqyk.a(((fqyp)object1).g);
            if(v3 != 0) {
                v1 = v3;
            }
            boxz.c(z, v2, v1);
        }
        if(boxy0.a) {
            ((ggtj)((ggtj)boxz.b.h()).ar(4820)).z("Reporting Keychain maintenance user engagement event %d.", this.c - 1);
            boxz.c(this.b, this.c, this.d);
        }
        return null;
    }
}

