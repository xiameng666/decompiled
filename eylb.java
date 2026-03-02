import dagger.internal.Provider;
import j..util.Objects;

final class eylb implements Provider {
    final eylm a;

    public eylb(eylm eylm0) {
        Objects.requireNonNull(eylm0);
        this.a = eylm0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eyko(this.a.a);
    }
}

