import com.google.android.gms.chimera.modules.smartdevice.AppContextProvider;
import j..util.Objects;
import java.util.concurrent.Future;

public final class epyc extends epye {
    final hkwt a;
    final epyf b;

    public epyc(epyf epyf0, int v, int v1, float f, hkwt hkwt0) {
        this.a = hkwt0;
        Objects.requireNonNull(epyf0);
        this.b = epyf0;
        super(v, v1, f);
    }

    @Override  // epye
    protected final Future a() {
        return new eqnn(AppContextProvider.a(), bbfw.b(), this.b.c).b(hoxm.a.c().f(), this.a.toBytesArray(), hkwu.a);
    }

    @Override  // epye
    protected final Object b(int v) {
        return epyf.f(v);
    }
}

