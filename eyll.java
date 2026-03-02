import dagger.internal.Provider;
import j..util.Objects;

final class eyll implements Provider {
    final eylm a;

    public eyll(eylm eylm0) {
        Objects.requireNonNull(eylm0);
        this.a = eylm0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eykm(this.a.a);
    }
}

