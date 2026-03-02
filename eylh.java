import dagger.internal.Provider;
import j..util.Objects;

final class eylh implements Provider {
    final eylm a;

    public eylh(eylm eylm0) {
        Objects.requireNonNull(eylm0);
        this.a = eylm0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eyku(this.a.a);
    }
}

