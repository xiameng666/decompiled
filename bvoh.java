import dagger.internal.Provider;
import j..util.Objects;

final class bvoh implements Provider {
    final bvok a;

    public bvoh(bvok bvok0) {
        Objects.requireNonNull(bvok0);
        this.a = bvok0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new bvod(this.a.a);
    }
}

