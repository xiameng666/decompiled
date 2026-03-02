import dagger.internal.Provider;
import j..util.Objects;

final class ehpy implements Provider {
    final ehpz a;

    public ehpy(ehpz ehpz0) {
        Objects.requireNonNull(ehpz0);
        this.a = ehpz0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new ehqb(this.a.b);
    }
}

