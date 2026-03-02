import dagger.internal.Provider;
import j..util.Objects;

final class eymr implements Provider {
    final eymy a;

    public eymr(eymy eymy0) {
        Objects.requireNonNull(eymy0);
        this.a = eymy0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eyma(this.a.b);
    }
}

