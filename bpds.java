import java.util.concurrent.atomic.AtomicReference;

public final class bpds implements gfsi {
    public final AtomicReference a;

    public bpds(AtomicReference atomicReference0) {
        this.a = atomicReference0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Void void0 = (Void)object0;
        return (gfsx)this.a.get();
    }
}

