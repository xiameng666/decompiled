import java.util.concurrent.atomic.AtomicReference;

public final class fcfr {
    public volatile fffw a;
    private static final AtomicReference b;

    static {
        fcfr.b = new AtomicReference();
    }

    public fcfr() {
        this.a = null;
    }

    public static fcfr a() {
        fcfr fcfr0 = (fcfr)fcfr.b.get();
        batl.s(fcfr0);
        return fcfr0;
    }

    public static void b(fcfr fcfr0) {
        AtomicReference atomicReference0 = fcfr.b;
        do {
            if(atomicReference0.compareAndSet(null, fcfr0)) {
                return;
            }
        }
        while(atomicReference0.get() == null);
        throw new IllegalStateException("AncsService singleton can only be set once.");
    }
}

