import dagger.internal.Provider;
import j..util.Objects;

final class eymq implements Provider {
    final eymy a;

    public eymq(eymy eymy0) {
        Objects.requireNonNull(eymy0);
        this.a = eymy0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eymj(this.a.b);
    }
}

