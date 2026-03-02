import dagger.internal.Provider;
import j..util.Objects;

final class ehqr implements Provider {
    final ehqt a;

    public ehqr(ehqt ehqt0) {
        Objects.requireNonNull(ehqt0);
        this.a = ehqt0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new ehqx(this.a.b);
    }
}

