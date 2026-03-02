import dagger.internal.Factory;
import dagger.internal.Provider;

public final class ffur implements Factory {
    private final Provider a;

    public ffur(Provider provider0) {
        this.a = provider0;
    }

    public final azts a() {
        return new azts(((ejaz)this.a).a(), ffuw.a, azsx.s, aztr_settings.a);
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

