import j..util.Objects;
import java.util.concurrent.Future;

public final class epxz extends epyd {
    final clcf a;
    final hkwr b;
    final epyf c;

    public epxz(epyf epyf0, int v, int v1, float f, clcf clcf0, hkwr hkwr0) {
        this.a = clcf0;
        this.b = hkwr0;
        Objects.requireNonNull(epyf0);
        this.c = epyf0;
        super(v, v1, f);
    }

    @Override  // epyd
    protected final Future a() {
        eqnh eqnh0 = this.c.b();
        hkwp hkwp0 = new hkwp();
        clax clax0 = this.c.a(ckvr.d);
        return eqnh0.a(this.a, ((MessageLite)this.b), ((ProtoLiteMessage)hkws.a), hkwp0, ckvr.c, clax0);
    }

    @Override  // epyd
    protected final ProtoLiteMessage b(int v) {
        return epyf.e(v);
    }
}

