import j..util.Objects;
import java.util.concurrent.Future;

public final class epxy extends epye {
    final hkwk a;
    final epyf b;

    public epxy(epyf epyf0, int v, int v1, float f, hkwk hkwk0) {
        this.a = hkwk0;
        Objects.requireNonNull(epyf0);
        this.b = epyf0;
        super(v, v1, f);
    }

    @Override  // epye
    protected final Future a() {
        return this.b.c().b(hoxm.a.c().g(), this.a.toBytesArray(), hkwl.a);
    }

    @Override  // epye
    protected final Object b(int v) {
        return epyf.d(v);
    }
}

