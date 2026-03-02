import dagger.internal.Provider;
import j..util.Objects;

final class cqce implements Provider {
    final cqcf a;

    public cqce(cqcf cqcf0) {
        Objects.requireNonNull(cqcf0);
        this.a = cqcf0;
        super();
    }

    public final cqca a() {
        return new cqca(this.a.a);
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

