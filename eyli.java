import dagger.internal.Provider;
import j..util.Objects;

final class eyli implements Provider {
    final eylm a;

    public eyli(eylm eylm0) {
        Objects.requireNonNull(eylm0);
        this.a = eylm0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eykg(this.a.a);
    }
}

