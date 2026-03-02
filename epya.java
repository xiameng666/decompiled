import j..util.Objects;
import java.util.concurrent.Future;

public final class epya extends epye {
    final hkwr a;
    final epyf b;

    public epya(epyf epyf0, int v, int v1, float f, hkwr hkwr0) {
        this.a = hkwr0;
        Objects.requireNonNull(epyf0);
        this.b = epyf0;
        super(v, v1, f);
    }

    @Override  // epye
    protected final Future a() {
        return this.b.c().b(hoxm.a.c().e(), this.a.toBytesArray(), hkws.a);
    }

    @Override  // epye
    protected final Object b(int v) {
        return epyf.e(v);
    }
}

