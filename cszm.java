import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class cszm implements Factory {
    private final Provider a;
    private final Provider b;

    public cszm(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        Context context0 = ((ejaz)this.a).a();
        cszq cszq0 = (cszq)this.b.get();
        ibuq.f(cszq0, "nativeLibLoader");
        cszq0.a();
        cszi cszi0 = new cszi(context0, "multidevice/cache/MultideviceCache.pb");
        return ldh.a(cszo.a, null, cszi0, 14);
    }
}

