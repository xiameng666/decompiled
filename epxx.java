import j..util.Objects;
import java.util.concurrent.Future;

public final class epxx extends epyd {
    final clcf a;
    final hkwk b;
    final epyf c;

    public epxx(epyf epyf0, int v, int v1, float f, clcf clcf0, hkwk hkwk0) {
        this.a = clcf0;
        this.b = hkwk0;
        Objects.requireNonNull(epyf0);
        this.c = epyf0;
        super(v, v1, f);
    }

    @Override  // epyd
    protected final Future a() {
        eqnh eqnh0 = this.c.b();
        hkwo hkwo0 = new hkwo();
        clax clax0 = this.c.a(ckvq.d);
        return eqnh0.a(this.a, ((MessageLite)this.b), ((ProtoLiteMessage)hkwl.a), hkwo0, ckvq.c, clax0);
    }

    @Override  // epyd
    protected final ProtoLiteMessage b(int v) {
        return epyf.d(v);
    }
}

