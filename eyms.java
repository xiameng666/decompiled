import dagger.internal.Provider;
import j..util.Objects;

final class eyms implements Provider {
    final eymy a;

    public eyms(eymy eymy0) {
        Objects.requireNonNull(eymy0);
        this.a = eymy0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eymc(this.a.b);
    }
}

