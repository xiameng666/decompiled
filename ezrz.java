import java.util.concurrent.atomic.AtomicReference;

public final class ezrz implements gfsi {
    public final AtomicReference a;
    public final ezmc b;

    public ezrz(AtomicReference atomicReference0, ezmc ezmc0) {
        this.a = atomicReference0;
        this.b = ezmc0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        boolean z = ((ProtoLiteMessage)ezmc.a).equals(((ezmc)object0));
        AtomicReference atomicReference0 = this.a;
        if(z) {
            atomicReference0.set(null);
            return this.b;
        }
        atomicReference0.set(((ezmc)object0));
        return this.b;
    }
}

