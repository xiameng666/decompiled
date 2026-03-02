import j..util.Objects;
import java.util.concurrent.Future;

public final class epyb extends epyd {
    final clcf a;
    final hkwt b;
    final epyf c;

    public epyb(epyf epyf0, int v, int v1, float f, clcf clcf0, hkwt hkwt0) {
        this.a = clcf0;
        this.b = hkwt0;
        Objects.requireNonNull(epyf0);
        this.c = epyf0;
        super(v, v1, f);
    }

    @Override  // epyd
    protected final Future a() {
        eqnh eqnh0 = this.c.b();
        hkwq hkwq0 = new hkwq();
        clax clax0 = this.c.a(ckvs.d);
        return eqnh0.a(this.a, ((MessageLite)this.b), ((ProtoLiteMessage)hkwu.a), hkwq0, ckvs.c, clax0);
    }

    @Override  // epyd
    protected final ProtoLiteMessage b(int v) {
        return epyf.f(v);
    }
}

