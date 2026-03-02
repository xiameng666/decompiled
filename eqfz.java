import j..util.Objects;
import java.io.IOException;

final class eqfz implements gmbg {
    final eqgd a;

    public eqfz(eqgd eqgd0) {
        Objects.requireNonNull(eqgd0);
        this.a = eqgd0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        eqgd.a.g("DirectTransfer read error", throwable0, new Object[0]);
        if((throwable0 instanceof IOException)) {
            this.a.d.a(-8);
            return;
        }
        this.a.d.a(-1);
    }

    @Override  // gmbg
    public final void b(Object object0) {
    }
}

