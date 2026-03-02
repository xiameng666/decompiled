import dagger.internal.Provider;
import j..util.Objects;

final class eylk implements Provider {
    final eylm a;

    public eylk(eylm eylm0) {
        Objects.requireNonNull(eylm0);
        this.a = eylm0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eykz(this.a.a);
    }
}

