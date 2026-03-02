import dagger.internal.Provider;
import j..util.Objects;

final class bvoi implements Provider {
    final bvok a;

    public bvoi(bvok bvok0) {
        Objects.requireNonNull(bvok0);
        this.a = bvok0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new bvon(this.a.a);
    }
}

