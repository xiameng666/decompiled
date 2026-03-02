import dagger.internal.Provider;
import j..util.Objects;

final class bvoj implements Provider {
    final bvok a;

    public bvoj(bvok bvok0) {
        Objects.requireNonNull(bvok0);
        this.a = bvok0;
        super();
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return new bvol(this.a.a);
    }
}

