import dagger.internal.Provider;
import j..util.Objects;

final class eyle implements Provider {
    final eylm a;

    public eyle(eylm eylm0) {
        Objects.requireNonNull(eylm0);
        this.a = eylm0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eykx(this.a.a);
    }
}

