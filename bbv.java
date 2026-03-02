import java.util.concurrent.atomic.AtomicReference;

public final class bbv {
    public final bce a;

    public bbv(bce bce0) {
        this.a = bce0;
        super();
    }

    public final void a() {
        bce bce0 = this.a;
        AtomicReference atomicReference0 = bce0.b;
        synchronized(atomicReference0) {
            Integer integer0 = (Integer)atomicReference0.getAndSet(null);
            if(integer0 == null) {
                return;
            }
            if(((int)integer0) != bce0.a()) {
                bce0.p();
            }
        }
    }
}

