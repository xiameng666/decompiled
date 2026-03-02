import dagger.internal.Provider;
import j..util.Objects;

final class eymt implements Provider {
    final eymy a;

    public eymt(eymy eymy0) {
        Objects.requireNonNull(eymy0);
        this.a = eymy0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eyme(this.a.b);
    }
}

