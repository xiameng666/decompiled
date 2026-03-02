import dagger.internal.Provider;
import j..util.Objects;

final class eymo implements Provider {
    final eymy a;

    public eymo(eymy eymy0) {
        Objects.requireNonNull(eymy0);
        this.a = eymy0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eyna(this.a.b);
    }
}

