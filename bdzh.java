import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class bdzh implements Factory {
    private final Provider a;
    private final Provider b;
    private final Provider c;

    public bdzh(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    public final azts a() {
        Context context0 = ((ejaz)this.a).a();
        return ((bcza)this.b).a().booleanValue() ? new azts(context0, axzj.b()) : ayss.h(context0, ((bcyy)this.c).a());
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

