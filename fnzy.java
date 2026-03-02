import dagger.internal.Factory;
import dagger.internal.Provider;

public final class fnzy implements Factory {
    private final Provider a;
    private final Provider b;

    public fnzy(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        fnzx fnzx0 = (fnzx)this.a.get();
        foeg foeg0 = (foeg)this.b.get();
        return new fnja(fnzx0.a, null, foeg0);
    }
}

