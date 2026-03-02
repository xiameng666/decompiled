import j..util.Objects;
import java.util.concurrent.atomic.AtomicReference;

final class cylt extends gxum {
    final AtomicReference a;
    final cylu b;

    public cylt(cylu cylu0, AtomicReference atomicReference0) {
        this.a = atomicReference0;
        Objects.requireNonNull(cylu0);
        this.b = cylu0;
        super("getSessionNonce");
    }

    @Override
    public final void run() {
        byte[] arr_b = this.b.b.o.p(this.b.a);
        if(arr_b != null) {
            this.a.set(arr_b);
        }
    }
}

