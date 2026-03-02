import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class cszl implements Factory {
    private final Provider a;
    private final Provider b;

    public cszl(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        Context context0 = ((ejaz)this.a).a();
        cszq cszq0 = (cszq)this.b.get();
        ibuq.f(cszq0, "nativeLibLoader");
        cszq0.a();
        cszi cszi0 = new cszi(context0, "multidevice/settings/MultideviceSyncPermission.pb");
        return ldh.a(cszp.a, null, cszi0, 14);
    }
}

