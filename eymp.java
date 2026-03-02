import dagger.internal.Provider;
import j..util.Objects;

final class eymp implements Provider {
    final eymy a;

    public eymp(eymy eymy0) {
        Objects.requireNonNull(eymy0);
        this.a = eymy0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new eyls(this.a.b);
    }
}

