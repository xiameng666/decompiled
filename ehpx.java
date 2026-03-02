import dagger.internal.Provider;
import j..util.Objects;

final class ehpx implements Provider {
    final ehpz a;

    public ehpx(ehpz ehpz0) {
        Objects.requireNonNull(ehpz0);
        this.a = ehpz0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new ehqd(this.a.b);
    }
}

