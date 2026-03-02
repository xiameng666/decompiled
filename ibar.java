import j..util.Objects;
import java.util.concurrent.atomic.AtomicReference;

final class ibar implements Runnable {
    final ibaz a;

    public ibar(ibaz ibaz0) {
        Objects.requireNonNull(ibaz0);
        this.a = ibaz0;
        super();
    }

    @Override
    public final void run() {
        ibaz ibaz0 = this.a;
        ibbd ibbd0 = ibaz0.c;
        if(ibbd0.y == null) {
            AtomicReference atomicReference0 = ibaz0.a;
            if(atomicReference0.get() == ibbd.f) {
                atomicReference0.set(null);
            }
            ibbd0.B.a(ibbd.c);
        }
    }
}

