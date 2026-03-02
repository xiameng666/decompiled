import j..util.Objects;
import java.util.concurrent.CancellationException;

final class epwx implements gmbg {
    final epxa a;

    public epwx(epxa epxa0) {
        Objects.requireNonNull(epxa0);
        this.a = epxa0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        if((throwable0 instanceof CancellationException)) {
            return;
        }
        epxa.a.g("Error establishing encrypted connection: " + throwable0, throwable0, new Object[0]);
        this.a.f(10577, "Error establishing encrypted connection: " + throwable0, null);
        this.a.b();
    }

    @Override  // gmbg
    public final void b(Object object0) {
        this.a.d = (eqhk)object0;
        this.a.c = null;
        this.a.o();
    }
}

