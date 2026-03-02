import dagger.internal.Provider;
import j..util.Objects;

final class bvoo implements Provider {
    final bvoq a;

    public bvoo(bvoq bvoq0) {
        Objects.requireNonNull(bvoq0);
        this.a = bvoq0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new bvov(this.a.b, this.a.c);
    }
}

