import dagger.internal.Factory;
import dagger.internal.Provider;

public final class becx implements Factory {
    private final Provider a;

    public becx(Provider provider0) {
        this.a = provider0;
    }

    public static final becw a() {
        return new becw(new ccmp());
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return becx.a();
    }
}

