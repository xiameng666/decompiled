import dagger.internal.Provider;
import j..util.Objects;

final class ehqh implements Provider {
    final ehqj a;

    public ehqh(ehqj ehqj0) {
        Objects.requireNonNull(ehqj0);
        this.a = ehqj0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new ehqn(this.a.b);
    }
}

