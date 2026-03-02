import java.util.concurrent.atomic.AtomicReference;

public final class bntg implements gfsi {
    public final AtomicReference a;

    public bntg(AtomicReference atomicReference0) {
        this.a = atomicReference0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Void void0 = (Void)object0;
        return (fqzn)this.a.get();
    }
}

