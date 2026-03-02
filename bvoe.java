import dagger.internal.Provider;
import j..util.Objects;

final class bvoe implements Provider {
    final bvog a;

    public bvoe(bvog bvog0) {
        Objects.requireNonNull(bvog0);
        this.a = bvog0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new bvox(this.a.b, this.a.c);
    }
}

