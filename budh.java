import dagger.internal.Factory;
import dagger.internal.Provider;

public final class budh implements Factory {
    private final Provider a;

    public budh(Provider provider0) {
        this.a = provider0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new azts(((ejaz)this.a).a(), buwz.a, azsx.s, aztr_settings.a);
    }
}

