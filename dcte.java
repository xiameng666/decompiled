import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class dcte implements Factory {
    private final Provider a;

    public dcte(Provider provider0) {
        this.a = provider0;
    }

    public final iakr a() {
        Context context0 = ((ejaz)this.a).a();
        fhbw fhbw0 = new fhbw();
        fhbw0.a(new gzcw());
        fhad fhad0 = fhae.a();
        fhad0.b(context0);
        iakr iakr0 = cmma.g(0x2604, -1, fhad0.a(), fhbw0).a(gzet.t);
        ibuq.e(iakr0, "get(...)");
        Preconditions.f(iakr0);
        return iakr0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

