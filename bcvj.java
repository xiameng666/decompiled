import com.google.android.gms.contextmanager.ContextData;
import j..util.Objects;

final class bcvj implements Runnable {
    final ContextData a;
    final bcvk b;

    public bcvj(bcvk bcvk0, ContextData contextData0) {
        this.a = contextData0;
        Objects.requireNonNull(bcvk0);
        this.b = bcvk0;
        super();
    }

    @Override
    public final void run() {
        Object object0 = this.b.d;
        ContextData contextData0 = this.a;
        synchronized(object0) {
            bcsw bcsw0 = this.b.b;
            if(bcsw0 == null) {
                return;
            }
            xsb xsb0 = new xsb(bcsw0, contextData0);
            bcsw0.P.b(xsb0, new xrn(bcsw0.Q + "_receive", "com.google.android.gms", null));
        }
    }
}

