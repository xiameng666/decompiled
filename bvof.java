import dagger.internal.Provider;
import j..util.Objects;

final class bvof implements Provider {
    final bvog a;

    public bvof(bvog bvog0) {
        Objects.requireNonNull(bvog0);
        this.a = bvog0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new bvot(this.a.b, this.a.c);
    }
}

