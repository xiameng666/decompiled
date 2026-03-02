import j..util.Objects;
import java.util.concurrent.CancellationException;

final class cqsb implements gmbg {
    final cqsc a;

    public cqsb(cqsc cqsc0) {
        Objects.requireNonNull(cqsc0);
        this.a = cqsc0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        if(!(throwable0 instanceof CancellationException)) {
            a.ae(this.a.a.a.i(), "Failure executing mDNS QueryTask", throwable0);
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
    }
}

