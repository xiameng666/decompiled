import j..util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

final class ibas implements Runnable {
    final ibaz a;

    public ibas(ibaz ibaz0) {
        Objects.requireNonNull(ibaz0);
        this.a = ibaz0;
        super();
    }

    @Override
    public final void run() {
        ArrayList arrayList0;
        ibaz ibaz0 = this.a;
        AtomicReference atomicReference0 = ibaz0.a;
        if(atomicReference0.get() == ibbd.f) {
            atomicReference0.set(null);
        }
        ibbd ibbd0 = ibaz0.c;
        Collection collection0 = ibbd0.y;
        if(collection0 != null) {
            for(Object object0: collection0) {
                ((ibay)object0).a("Channel is forcefully shutdown", null);
            }
        }
        ibbc ibbc0 = ibbd0.B;
        iapk iapk0 = ibbd.b;
        ibbc0.a(iapk0);
        synchronized(ibbc0.a) {
            arrayList0 = new ArrayList(ibbc0.b);
        }
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ((iauy)arrayList0.get(v2)).c(iapk0);
        }
        ibbc0.d.A.q(iapk0);
    }
}

