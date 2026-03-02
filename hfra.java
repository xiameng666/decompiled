import java.util.concurrent.atomic.AtomicReference;

public final class hfra implements gfsi {
    public final AtomicReference a;
    public final AtomicReference b;
    public final AtomicReference c;

    public hfra(AtomicReference atomicReference0, AtomicReference atomicReference1, AtomicReference atomicReference2) {
        this.a = atomicReference0;
        this.b = atomicReference1;
        this.c = atomicReference2;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        hfrg hfrg0 = new hfrg();
        hfrg0.b(((iapn)object0).a);
        hfrh.b(hfrg0, this.a, this.b);
        AtomicReference atomicReference0 = this.c;
        if(atomicReference0.get() != null) {
            hfrg.c(((iakk)atomicReference0.get()));
        }
        return hfrg0.a();
    }
}

