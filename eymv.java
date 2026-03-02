import dagger.internal.Provider;
import j..util.Objects;

final class eymv implements Provider {
    final eymy a;

    public eymv(eymy eymy0) {
        Objects.requireNonNull(eymy0);
        this.a = eymy0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eylu(this.a.b);
    }
}

