import dagger.internal.Provider;
import j..util.Objects;

final class eylf implements Provider {
    final eylm a;

    public eylf(eylm eylm0) {
        Objects.requireNonNull(eylm0);
        this.a = eylm0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eykq(this.a.a);
    }
}

