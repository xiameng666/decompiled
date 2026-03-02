import dagger.internal.Provider;
import j..util.Objects;

final class eylg implements Provider {
    final eylm a;

    public eylg(eylm eylm0) {
        Objects.requireNonNull(eylm0);
        this.a = eylm0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eyks(this.a.a);
    }
}

