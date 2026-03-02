import dagger.internal.Provider;
import j..util.Objects;

final class eylc implements Provider {
    final eylm a;

    public eylc(eylm eylm0) {
        Objects.requireNonNull(eylm0);
        this.a = eylm0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eyln(this.a.a);
    }
}

