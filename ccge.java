import j..util.function.Consumer.-CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

public final class ccge implements Consumer {
    public final ccgo a;
    public final AtomicReference b;

    public ccge(ccgo ccgo0, AtomicReference atomicReference0) {
        this.a = ccgo0;
        this.b = atomicReference0;
    }

    @Override
    public final void accept(Object object0) {
        IllegalStateException illegalStateException0 = new IllegalStateException(((String)object0));
        AtomicReference atomicReference0 = this.b;
        IllegalStateException illegalStateException1 = (IllegalStateException)atomicReference0.get();
        if(illegalStateException1 == null) {
            atomicReference0.set(illegalStateException0);
            return;
        }
        if(this.a.c.O()) {
            illegalStateException1.addSuppressed(illegalStateException0);
        }
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

