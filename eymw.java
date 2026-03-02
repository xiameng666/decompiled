import dagger.internal.Provider;
import j..util.Objects;

final class eymw implements Provider {
    final eymy a;

    public eymw(eymy eymy0) {
        Objects.requireNonNull(eymy0);
        this.a = eymy0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eyml(this.a.b);
    }
}

