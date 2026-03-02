import dagger.internal.Provider;
import j..util.Objects;

final class eymn implements Provider {
    final eymy a;

    public eymn(eymy eymy0) {
        Objects.requireNonNull(eymy0);
        this.a = eymy0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eyly(this.a.b);
    }
}

