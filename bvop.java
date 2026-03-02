import dagger.internal.Provider;
import j..util.Objects;

final class bvop implements Provider {
    final bvoq a;

    public bvop(bvoq bvoq0) {
        Objects.requireNonNull(bvoq0);
        this.a = bvoq0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new bvor(this.a.b, this.a.c);
    }
}

