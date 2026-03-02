import java.util.concurrent.atomic.AtomicReference;

public final class boxx implements gfsi {
    public final AtomicReference a;

    public boxx(AtomicReference atomicReference0) {
        this.a = atomicReference0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Void void0 = (Void)object0;
        AtomicReference atomicReference0 = this.a;
        if(atomicReference0.get() != null) {
            ggtj ggtj0 = (ggtj)((ggtj)boxz.b.h()).ar(4819);
            int v = fqyo.a(((fqyp)atomicReference0.get()).e);
            int v1 = 1;
            if(v == 0) {
                v = 1;
            }
            ggtj0.z("Reporting last Keychain maintenance user engagement event %d as cancelled.", v - 1);
            boolean z = ((fqyp)atomicReference0.get()).h;
            int v2 = fqyo.a(((fqyp)atomicReference0.get()).e);
            if(v2 == 0) {
                v2 = 1;
            }
            int v3 = fqyk.a(((fqyp)atomicReference0.get()).g);
            if(v3 != 0) {
                v1 = v3;
            }
            boxz.c(z, v2, v1);
        }
        return null;
    }
}

