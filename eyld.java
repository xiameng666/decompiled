import dagger.internal.Provider;
import j..util.Objects;

final class eyld implements Provider {
    final eylm a;

    public eyld(eylm eylm0) {
        Objects.requireNonNull(eylm0);
        this.a = eylm0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eyki(this.a.a);
    }
}

