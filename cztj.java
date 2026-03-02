import java.util.concurrent.atomic.AtomicBoolean;

public final class cztj implements geky {
    public final cztl a;
    public final AtomicBoolean b;

    public cztj(cztl cztl0, AtomicBoolean atomicBoolean0) {
        this.a = cztl0;
        this.b = atomicBoolean0;
    }

    @Override  // geky
    public final void a(gele gele0) {
        this.b.set(gele0.a());
        synchronized(this.a.c) {
            this.a.c.notifyAll();
        }
    }
}

