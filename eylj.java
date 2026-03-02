import dagger.internal.Provider;
import j..util.Objects;

final class eylj implements Provider {
    final eylm a;

    public eylj(eylm eylm0) {
        Objects.requireNonNull(eylm0);
        this.a = eylm0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eykk(this.a.a);
    }
}

