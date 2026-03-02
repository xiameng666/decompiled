import dagger.internal.Provider;
import j..util.Objects;

final class ehqi implements Provider {
    final ehqj a;

    public ehqi(ehqj ehqj0) {
        Objects.requireNonNull(ehqj0);
        this.a = ehqj0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new ehql(this.a.b);
    }
}

