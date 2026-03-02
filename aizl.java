import java.util.concurrent.atomic.AtomicBoolean;

public final class aizl implements gfsi {
    public final AtomicBoolean a;

    public aizl(AtomicBoolean atomicBoolean0) {
        this.a = atomicBoolean0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Void void0 = (Void)object0;
        return Boolean.valueOf(this.a.get());
    }
}

