import dagger.internal.Provider;
import j..util.Objects;

final class eymu implements Provider {
    final eymy a;

    public eymu(eymy eymy0) {
        Objects.requireNonNull(eymy0);
        this.a = eymy0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eylq(this.a.b);
    }
}

