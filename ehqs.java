import dagger.internal.Provider;
import j..util.Objects;

final class ehqs implements Provider {
    final ehqt a;

    public ehqs(ehqt ehqt0) {
        Objects.requireNonNull(ehqt0);
        this.a = ehqt0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new ehqv(this.a.b);
    }
}

