import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class ggvc {
    private static final AtomicBoolean a;

    static {
        ggvc.a = new AtomicBoolean(false);
    }

    public static void a(ggvb ggvb0) {
        if(!ggvc.a.compareAndSet(false, true)) {
            throw new IllegalStateException("Logger backend configuration may only occur once.");
        }
        ggva ggva0 = ggvb0.a;
        if(ggva0 == null) {
            ggva0 = ggvo.c;
        }
        AtomicReference atomicReference0 = ggvk.d;
        do {
            if(atomicReference0.compareAndSet(null, ggva0)) {
                ggvk.e();
                ggvl.a.b.set(ggwa.a);
                return;
            }
        }
        while(atomicReference0.get() == null);
        throw new IllegalStateException("Logger backends can only be configured once.");
    }
}

