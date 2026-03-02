import j..util.Objects;
import java.util.concurrent.CancellationException;

public final class eqgh implements gmbg {
    final eqgk a;

    public eqgh(eqgk eqgk0) {
        Objects.requireNonNull(eqgk0);
        this.a = eqgk0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        if((throwable0 instanceof CancellationException)) {
            eqgk.a.d("CancellationException detected...", new Object[0]);
            return;
        }
        this.a.i.obtainMessage(3, throwable0).sendToTarget();
    }

    @Override  // gmbg
    public final void b(Object object0) {
    }
}

