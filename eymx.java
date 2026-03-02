import dagger.internal.Provider;
import j..util.Objects;

final class eymx implements Provider {
    final eymy a;

    public eymx(eymy eymy0) {
        Objects.requireNonNull(eymy0);
        this.a = eymy0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eylw(this.a.b);
    }
}

