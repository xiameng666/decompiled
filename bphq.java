import java.util.concurrent.atomic.AtomicReference;

public final class bphq implements gfsi {
    public final AtomicReference a;

    public bphq(AtomicReference atomicReference0) {
        this.a = atomicReference0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = (gfsx)object0;
        this.a.set(object1);
        return object1;
    }
}

